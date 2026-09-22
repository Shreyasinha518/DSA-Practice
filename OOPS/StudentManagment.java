import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentManagment extends JFrame implements ActionListener {
    JLabel nameLabel, rollLabel, genderLabel, courseLabel, skillLabel, addressLabel;
    JTextField nameField, rollField;
    JRadioButton maleButton, femaleButton;
    JCheckBox javaBox, pythonBox, cppBox;
    ButtonGroup genderGroup;
    JTextArea addressArea;
    JButton submitButton, resetButton;
    JComboBox<String> courseBox;
    StudentManagment(){
        setTitle("STUDEBT MANAGEMENT");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Layout
        setLayout(new GridLayout(9, 2, 10, 10));
        // Name
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        //roll
        rollLabel = new JLabel("Roll Number:");
        rollField = new JTextField();
        // Gender
        genderLabel = new JLabel("Gender:");

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Course
        courseLabel = new JLabel("Course:");

        courseBox = new JComboBox<>(
            new String[]{"CSE", "ECE", "IT", "ME"}
        );

        // Skills
        skillLabel = new JLabel("Skills:");

        javaBox = new JCheckBox("Java");
        pythonBox = new JCheckBox("Python");
        cppBox = new JCheckBox("C++");

        // Address
        addressLabel = new JLabel("Address:");
        addressArea = new JTextArea();

        // Buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        // Add components
        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(genderLabel);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel);

        add(courseLabel);
        add(courseBox);

        add(skillLabel);

        JPanel skillPanel = new JPanel();
        skillPanel.add(javaBox);
        skillPanel.add(pythonBox);
        skillPanel.add(cppBox);
        add(skillPanel);

        add(addressLabel);
        add(addressArea);

        // Empty spaces
        add(new JLabel(""));
        add(new JLabel(""));

        add(submitButton);
        add(resetButton);

        // Event listeners
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Make window visible
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {

        // SUBMIT button
        if (e.getSource() == submitButton) {

            String name = nameField.getText();
            String roll = rollField.getText();

            // Validation
            if (name.isEmpty() || roll.isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please fill all required fields."
                );

                return;
            }

            // Gender
            String gender = "";

            if (maleButton.isSelected()) {
                gender = "Male";
            }
            else if (femaleButton.isSelected()) {
                gender = "Female";
            }
            else {
                gender = "Not Selected";
            }

            // Course
            String course =
                (String) courseBox.getSelectedItem();

            // Skills
            String skills = "";

            if (javaBox.isSelected()) {
                skills += "Java ";
            }

            if (pythonBox.isSelected()) {
                skills += "Python ";
            }

            if (cppBox.isSelected()) {
                skills += "C++ ";
            }

            if (skills.isEmpty()) {
                skills = "None";
            }

            // Address
            String address = addressArea.getText();

            // Display result
            String result =
                "Student Details\n\n" +
                "Name: " + name + "\n" +
                "Roll No: " + roll + "\n" +
                "Gender: " + gender + "\n" +
                "Course: " + course + "\n" +
                "Skills: " + skills + "\n" +
                "Address: " + address;

            JOptionPane.showMessageDialog(
                this,
                result,
                "Student Details",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        // RESET button
        else if (e.getSource() == resetButton) {

            nameField.setText("");
            rollField.setText("");
            addressArea.setText("");

            genderGroup.clearSelection();

            courseBox.setSelectedIndex(0);

            javaBox.setSelected(false);
            pythonBox.setSelected(false);
            cppBox.setSelected(false);
        }
    }

    // Main method
    public static void main(String[] args) {

        new StudentManagment();
    }
}
