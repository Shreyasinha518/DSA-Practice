//package SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentForm extends JFrame implements ActionListener {

    JLabel nameLabel, courseLabel;
    JTextField nameField;
    JComboBox<String> courseBox;
    JCheckBox javaBox, pythonBox;
    JButton submitButton;

    StudentForm() {

        setTitle("Student Registration");

        setLayout(new FlowLayout());

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        courseLabel = new JLabel("Course:");

        String courses[] = {"CSE", "ECE", "IT"};
        courseBox = new JComboBox<>(courses);

        javaBox = new JCheckBox("Java");
        pythonBox = new JCheckBox("Python");

        submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameField);

        add(courseLabel);
        add(courseBox);

        add(javaBox);
        add(pythonBox);

        add(submitButton);

        submitButton.addActionListener(this);

        setSize(400, 300);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();

        String course =
            (String) courseBox.getSelectedItem();

        String message =
            "Name: " + name +
            "\nCourse: " + course;

        JOptionPane.showMessageDialog(
            this,
            message
        );
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
