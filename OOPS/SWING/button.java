import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myButton extends JFrame implements ActionListener {
    JButton button;
    myButton(){
        button=new JButton("CLICK ME");
        add(button);
        setSize(200,300);
        button.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        
            JOptionPane.showMessageDialog(this,"Button Clicked");
        
    }
    public static void main(String[] args) {
        new myButton();
    }
}
