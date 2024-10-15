
package bank.management.system1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login, clear, signup;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    
    Login () {
        
    setTitle("Automated teller machine");  
     setLayout(null);
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
     Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
 ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,450,40);
        add(text);
        
        JLabel cardno = new JLabel("card no.");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(125,150,375,30);
        add(cardno);
        
        cardtextfield = new JTextField(15);
        cardtextfield.setBounds(300,150,230,30);
       cardtextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardtextfield);
        
        JLabel pin = new JLabel("pin");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125,220,375,30);
        add(pin);
        
        pintextfield = new JPasswordField(15);
        pintextfield.setBounds(300,220,230,30);
       pintextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(pintextfield);
        
        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("Sign Up");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
 
        
    setSize(800,480);
    setVisible(true);
    setLocation(350,200);
    getContentPane().setBackground(Color.WHITE);
    }
    
     public void actionPerformed(ActionEvent ae){
            if( ae.getSource() == clear){
                cardtextfield.setText("");
                 pintextfield.setText("");
            } else if( ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardtextfield.getText();
            String pinnumber = pintextfield.getText();
            
            String q  = "select * from login where cardno = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            
                try {
                    ResultSet rs = conn.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                } catch (Exception e) {
                    System.out.println(e);
                }
            
            } else if( ae.getSource() == signup){
                setVisible(false);
                new SignupOne().setVisible(true);
            }
     }
    
    public static void main(String[] args) {
        new Login();
    }
}
