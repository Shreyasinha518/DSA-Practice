import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener{
    JLabel l1,l2;
    JButton b;
    JTextField f1,f2;
    
    login(){
        l1=new JLabel ("Username:");
        f1=new JTextField(20);
        l2=new JLabel ("Password:");
        f2=new JTextField(20);
        b=new JButton("SUBMIT!");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        add(f1);
        
        add(l2);
        add(f2);
        add(b);
        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this, "SUBMITED!!!!");

    }
    public static void main(String args[]){
        new login();
    }



}