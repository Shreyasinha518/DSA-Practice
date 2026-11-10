import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admissions extends JFrame implements ActionListener{
    JLabel cse,csds,total;
    JTextField cseField, csdsField,totalField;
    JButton totalButton;
    Admissions(){
        setTitle("Admission Counter");
        setSize(400,500);
        setLayout(new GridLayout(4,2,10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cse=new JLabel("CSE");
        csds=new JLabel("CSDS");
        total=new JLabel("Total");
        cseField=new JTextField(10);
        csdsField=new JTextField(10);
        totalField=new JTextField(10);
        totalButton=new JButton("Calculate Total");
        totalButton.addActionListener(this);
        add(cse);
        add(cseField);
        add(csds);
        add(csdsField);
        add(total);
        add(totalField);
        add(new JLabel(" "));
        add(totalButton);
        setLocationRelativeTo(null);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        try{
        String cseText=cseField.getText().trim();
        String csdsText=csdsField.getText().trim();
        if(cseText.isEmpty() || csdsText.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter both CSE and CSDS values");
            return;
        }
        int cseValue=Integer.parseInt(cseText);
        int csdsValue=Integer.parseInt(csdsText);
        if(cseValue<0 || csdsValue<0){
            JOptionPane.showMessageDialog(this,"Please Enter Positive Values.");
            return;
        }
        int totalValue=cseValue+csdsValue;
        totalField.setText(String.valueOf(totalValue));

    
    cseField.setEditable(false);
    csdsField.setEditable(false);
    totalField.setEditable(false);
        }
    catch(Exception ex){
        JOptionPane.showMessageDialog(this,"Please enter valid integer values.");

    }
    
    }

public static void main(String[] args){
    new Admissions();
}
}