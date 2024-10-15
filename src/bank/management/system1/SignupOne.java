
package bank.management.system1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{
    
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, citytextfield, statetextfield, pincodetextfield;
   JDateChooser dateChooser;
   JRadioButton male, female, married, single, other;
   ButtonGroup genderGroup, maritalStatusGroup;
   long random;
   JButton next;
   
    
    SignupOne(){
        setLayout(null);
        
         Random ran = new Random();
          random = Math.abs((ran.nextLong()%9000L)+1000);
         
         JLabel formno = new JLabel("Application from no." + random);
          formno.setFont(new Font("Raleway", Font.BOLD, 38));
          formno.setBounds(140,20,600,40);
          add(formno);
          
          JLabel personalDetails = new JLabel("Page 1: personal Details");
          personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
          personalDetails.setBounds(200,80,400,30);
          add(personalDetails);
          
          JLabel name = new JLabel("Name :");
          name.setFont(new Font("Raleway", Font.BOLD, 18));
          name.setBounds(100,140,100,30);
          add(name);
          
          nametextfield = new JTextField();
          nametextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          nametextfield.setBounds(300,140,400,30);
          add(nametextfield);
          
          
          JLabel fname = new JLabel("father's Name :");
          fname.setFont(new Font("Raleway", Font.BOLD, 18));
          fname.setBounds(100,190,200,30);
          add(fname);
          
          fnametextfield = new JTextField();
          fnametextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          fnametextfield.setBounds(300,190,400,30);
          add(fnametextfield);
          
          JLabel dob = new JLabel("Date of birth :");
          dob.setFont(new Font("Raleway", Font.BOLD, 18));
          dob.setBounds(100,240,200,30);
          add(dob);
          
          dateChooser = new JDateChooser();
	
	  dateChooser.setForeground(new Color(105, 105, 105));
	  dateChooser.setBounds(300, 240, 400, 30);
	  add(dateChooser);
          
 
          JLabel email = new JLabel("Email address :");
          email.setFont(new Font("Raleway", Font.BOLD, 18));
          email.setBounds(100,290,200,30);
          add(email);
          
          emailtextfield = new JTextField();
          emailtextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          emailtextfield.setBounds(300,290,400,30);
          add(emailtextfield);
          
          
          JLabel gender = new JLabel("Gender :");
          gender.setFont(new Font("Raleway", Font.BOLD, 18));
          gender.setBounds(100,340,200,30);
          add(gender);
          
        male = new JRadioButton("Male");
        male.setBounds(300, 340, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 340, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
          
          JLabel maritalstatus = new JLabel("Marital Status :");
          maritalstatus.setFont(new Font("Raleway", Font.BOLD, 18));
          maritalstatus.setBounds(100,390,200,30);
          add(maritalstatus);
          
           single = new JRadioButton("Single");
            single.setBounds(300, 390, 100, 30);
            single.setBackground(Color.WHITE);
          add(single);

 married = new JRadioButton("Married");
married.setBounds(400, 390, 100, 30);
married.setBackground(Color.WHITE);
add(married);

 other = new JRadioButton("Other");
other.setBounds(500, 390, 100, 30);
other.setBackground(Color.WHITE);
add(other);


 maritalStatusGroup = new ButtonGroup();
maritalStatusGroup.add(single);
maritalStatusGroup.add(married);
maritalStatusGroup.add(other);
         
          JLabel address = new JLabel("Address :");
          address.setFont(new Font("Raleway", Font.BOLD, 18));
          address.setBounds(100,440,200,30);
          add(address);
          
          addresstextfield = new JTextField();
          addresstextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          addresstextfield.setBounds(300,440,400,30);
          add(addresstextfield);
          
          JLabel city = new JLabel("city :");
          city.setFont(new Font("Raleway", Font.BOLD, 18));
          city.setBounds(100,490,200,30);
          add(city);
          
           citytextfield = new JTextField();
          citytextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          citytextfield.setBounds(300,490,400,30);
          add(citytextfield);          
          
          JLabel state = new JLabel("State :");
          state.setFont(new Font("Raleway", Font.BOLD, 18));
          state.setBounds(100,540,200,30);
          add(state);
                    
          statetextfield = new JTextField();
          statetextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          statetextfield.setBounds(300,540,400,30);
          add(statetextfield);  
          
          
          JLabel pincode = new JLabel("pincode :");
          pincode.setFont(new Font("Raleway", Font.BOLD, 18));
          pincode.setBounds(100,590,200,30);
          add(pincode);
  
           pincodetextfield = new JTextField();
          pincodetextfield.setFont(new Font("Raleway", Font.BOLD, 18));
          pincodetextfield.setBounds(300,590,400,30);
          add(pincodetextfield);
          
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this); 
        add(next);
          
          
        getContentPane().setBackground(Color.WHITE);
          setSize(850,800);
          setLocation(350,10);
          setVisible(true);
 
        
    }
    
     public void actionPerformed(ActionEvent ae){
             
         String formno = "" + random;
          String name = nametextfield.getText();
        String fname = fnametextfield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
            
        String email = emailtextfield.getText();
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(single.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
           
        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String pincode = pincodetextfield.getText();
        String state = statetextfield.getText();
        
         try {
             if(name.equals("")){
             JOptionPane.showMessageDialog(null, "Fill all the required fields");
             }else{
                Conn c = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(q1);
                
                
                  setVisible(false);
                 new SignupTwo(formno).setVisible(true);
              
                
            }
         } catch (Exception e) {
             System.out.println(e);
         }
        
     }
    
    public static void main(String[] args) {
        new SignupOne();
    }
}
