import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CounterClicks extends JFrame implements ActionListener{
    JLabel counter;
    JTextField counterField;
    JButton clickButton;
     int count=0;
    CounterClicks(){
        setTitle("CLICK ME!");
        setLayout(new FlowLayout());
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counter=new JLabel("COUNTER:");
        counterField=new JTextField(10);
        clickButton=new JButton("CLICK ME!");
        clickButton.addActionListener(this);
        add(counter);
        add(counterField);
        add(clickButton);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==clickButton){
        count++;
        counterField.setText(String.valueOf(count));
       
    }
} 
public static void main(String[] args){
    new CounterClicks();
}
}
