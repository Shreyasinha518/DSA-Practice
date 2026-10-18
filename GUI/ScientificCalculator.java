
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Locale;

public class ScientificCalculator extends JFrame
        implements ActionListener {

    private final JTextField display;
    private final JLabel modeLabel;
    private boolean degreeMode = true;
    private boolean newInput = true;

    private double storedValue = 0;
    private String pendingOperator = "";
    private boolean hasPendingOperation = false;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(520, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        modeLabel = new JLabel("Mode: DEG");
        modeLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JPanel top = new JPanel(new BorderLayout(5, 5));
        top.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        top.add(modeLabel, BorderLayout.NORTH);
        top.add(display, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);

        String[] buttons = {
            "sin", "cos", "tan", "asin", "acos",
            "atan", "log", "ln", "sqrt", "x^2",
            "x^y", "1/x", "n!", "pi", "DEG/RAD",
            "(", ")", "%", "DEL", "C",
            "7", "8", "9", "/", "exp",
            "4", "5", "6", "*", "10^x",
            "1", "2", "3", "-", "abs",
            "0", ".", "=", "+", "+/-"
        };

        JPanel panel = new JPanel(new GridLayout(8, 5, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 15));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.matches("[0-9]")) {
                enterDigit(cmd);
            } else if (cmd.equals(".")) {
                enterDecimal();
            } else if (cmd.equals("C")) {
                clear();
            } else if (cmd.equals("DEL")) {
                deleteLast();
            } else if (cmd.equals("+/-")) {
                changeSign();
            } else if (cmd.equals("DEG/RAD")) {
                degreeMode = !degreeMode;
                modeLabel.setText(
                    "Mode: " + (degreeMode ? "DEG" : "RAD")
                );
            } else if (cmd.equals("+") || cmd.equals("-")
                    || cmd.equals("*") || cmd.equals("/")) {
                setOperator(cmd);
            } else if (cmd.equals("=")) {
                calculateResult();
            } else if (cmd.equals("(") || cmd.equals(")")) {
                appendParenthesis(cmd);
            } else if (cmd.equals("x^y")) {
                setOperator("^");
            } else if (cmd.equals("pi")) {
                setValue(Math.PI);
            } else if (cmd.equals("%")) {
                setValue(getValue() / 100.0);
            } else {
                applyScientificFunction(cmd);
            }
        } catch (ArithmeticException | IllegalArgumentException ex) {
            showError(ex.getMessage());
        } catch (Exception ex) {
            showError("Invalid mathematical expression.");
        }
    }

    private void enterDigit(String digit) {
        if (newInput || display.getText().equals("0")) {
            display.setText(digit);
            newInput = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    private void enterDecimal() {
        if (newInput) {
            display.setText("0.");
            newInput = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    private void clear() {
        display.setText("0");
        storedValue = 0;
        pendingOperator = "";
        hasPendingOperation = false;
        newInput = true;
    }

    private void deleteLast() {
        if (newInput) {
            display.setText("0");
            newInput = true;
            return;
        }

        String text = display.getText();

        if (text.length() <= 1
                || (text.length() == 2 && text.startsWith("-"))) {
            display.setText("0");
            newInput = true;
        } else {
            display.setText(text.substring(0, text.length() - 1));
        }
    }

    private void changeSign() {
        double value = getValue();
        setValue(-value);
    }

    private void appendParenthesis(String p) {
        if (newInput) {
            display.setText(p.equals("(") ? "(" : "0)");
            newInput = false;
        } else {
            display.setText(display.getText() + p);
        }
    }

    private double getValue() {
        try {
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Enter a valid number first."
            );
        }
    }

    private void setValue(double value) {
        if (!Double.isFinite(value)) {
            throw new ArithmeticException(
                "Result is undefined or out of range."
            );
        }

        display.setText(format(value));
        newInput = true;
    }

    private String format(double value) {
        if (!Double.isFinite(value)) {
            return "Error";
        }

        if (value == 0) {
            return "0";
        }

        return BigDecimal.valueOf(value)
                .round(new MathContext(12))
                .stripTrailingZeros()
                .toPlainString();
    }

    private void setOperator(String op) {
        double current = getValue();

        if (hasPendingOperation && !newInput) {
            storedValue = performOperation(
                storedValue, current, pendingOperator
            );
            display.setText(format(storedValue));
        } else {
            storedValue = current;
        }

        pendingOperator = op;
        hasPendingOperation = true;
        newInput = true;
    }

    private void calculateResult() {
        if (!hasPendingOperation) {
            return;
        }

        double second = getValue();

        double answer = performOperation(
            storedValue, second, pendingOperator
        );

        setValue(answer);
        hasPendingOperation = false;
        pendingOperator = "";
    }

    private double performOperation(double a, double b, String op) {
        double result;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException(
                        "Cannot divide by zero."
                    );
                }
                result = a / b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            default:
                throw new IllegalArgumentException(
                    "Unknown operator."
                );
        }

        if (!Double.isFinite(result)) {
            throw new ArithmeticException(
                "Result is undefined or out of range."
            );
        }

        return result;
    }

    private void applyScientificFunction(String cmd) {
        double x = getValue();
        double answer;

        switch (cmd) {
            case "sin":
                answer = Math.sin(toRadians(x));
                break;
            case "cos":
                answer = Math.cos(toRadians(x));
                break;
            case "tan":
                if (degreeMode &&
                        Math.abs(Math.cos(toRadians(x))) < 1e-12) {
                    throw new ArithmeticException(
                        "Tangent is undefined at this angle."
                    );
                }
                answer = Math.tan(toRadians(x));
                break;
            case "asin":
                checkRange(x, -1, 1);
                answer = fromRadians(Math.asin(x));
                break;
            case "acos":
                checkRange(x, -1, 1);
                answer = fromRadians(Math.acos(x));
                break;
            case "atan":
                answer = fromRadians(Math.atan(x));
                break;
            case "log":
                if (x <= 0) {
                    throw new ArithmeticException(
                        "Logarithm requires a positive number."
                    );
                }
                answer = Math.log10(x);
                break;
            case "ln":
                if (x <= 0) {
                    throw new ArithmeticException(
                        "Natural logarithm requires a positive number."
                    );
                }
                answer = Math.log(x);
                break;
            case "sqrt":
                if (x < 0) {
                    throw new ArithmeticException(
                        "Square root of a negative number is not real."
                    );
                }
                answer = Math.sqrt(x);
                break;
            case "x^2":
                answer = x * x;
                break;
            case "1/x":
                if (x == 0) {
                    throw new ArithmeticException(
                        "Reciprocal of zero is undefined."
                    );
                }
                answer = 1.0 / x;
                break;
            case "n!":
                answer = factorial(x);
                break;
            case "exp":
                answer = Math.exp(x);
                break;
            case "10^x":
                answer = Math.pow(10, x);
                break;
            case "abs":
                answer = Math.abs(x);
                break;
            default:
                throw new IllegalArgumentException(
                    "Unsupported function."
                );
        }

        setValue(answer);
    }

    private double toRadians(double x) {
        return degreeMode ? Math.toRadians(x) : x;
    }

    private double fromRadians(double x) {
        return degreeMode ? Math.toDegrees(x) : x;
    }

    private void checkRange(double x, double min, double max) {
        if (x < min || x > max) {
            throw new ArithmeticException(
                "Input must be between " + min + " and " + max + "."
            );
        }
    }

    private double factorial(double x) {
        if (x < 0 || x != Math.floor(x) || x > 170) {
            throw new ArithmeticException(
                "Factorial requires an integer from 0 to 170."
            );
        }

        double result = 1;

        for (int i = 2; i <= (int) x; i++) {
            result *= i;
        }

        return result;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(
            this,
            message == null ? "Invalid operation." : message,
            "Calculator Error",
            JOptionPane.ERROR_MESSAGE
        );

        display.setText("0");
        storedValue = 0;
        pendingOperator = "";
        hasPendingOperation = false;
        newInput = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScientificCalculator());
    }
}
