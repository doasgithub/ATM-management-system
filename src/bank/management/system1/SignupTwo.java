package bank.management.system1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan, aadhar;
    JRadioButton eno, eyes, sno, syes;
    ButtonGroup sgroup, egroup;
    JButton next;
    JComboBox religion, category, education, occupation, income;
    String formno;
    
   
    SignupTwo(String formno) {
        
         this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(200, 80, 400, 30);
        add(additionalDetails);
          
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(100, 140, 100, 30);
        add(name);
          
        String valreligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valreligion);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBounds(300, 140, 400, 30);
        add(religion);
          
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
          
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBounds(300, 190, 400, 30);
        add(category);
          
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
          
        String varincome[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        income = new JComboBox(varincome);
        income.setBackground(Color.WHITE);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBounds(300, 240, 400, 30);
        add(income);
          
        JLabel gender = new JLabel("Education :");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
          
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(100, 315, 200, 30);
        add(email);
          
        String vareducation[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        education = new JComboBox(vareducation);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        education.setBounds(300, 290, 400, 30);
        add(education);
    
        JLabel maritalstatus = new JLabel("Occupation :");
        maritalstatus.setFont(new Font("Raleway", Font.BOLD, 18));
        maritalstatus.setBounds(100, 390, 200, 30);
        add(maritalstatus);
         
        String varoccupation[] = {"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox(varoccupation);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBounds(300, 390, 400, 30);
        add(occupation);

        JLabel address = new JLabel("Pan no. :");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(100, 440, 200, 30);
        add(address);
          
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
          
        JLabel city = new JLabel("Aadhar no. :");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(100, 490, 200, 30);
        add(city);
          
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
          
        JLabel state = new JLabel("Senior citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(100, 540, 200, 30);
        add(state);
          
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
          
        JLabel pincode = new JLabel("Exisiting Account :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
  
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(400, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
          
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
           
              String sreligion = (String)religion.getSelectedItem(); 
              String scategory = (String)category.getSelectedItem();
              String sincome = (String)income.getSelectedItem();
              String seducation = (String)education.getSelectedItem();
              String soccupation = (String)occupation.getSelectedItem();
              String seniorcitizens = null;
              if(syes.isSelected()){
                  seniorcitizens = "yes";
              }else if(sno.isSelected()){
                   seniorcitizens = "no";
              }
              
               String existing = null;
              if(eyes.isSelected()){
                  existing = "yes";
              }else if(eno.isSelected()){
                   existing = "no";
              }
              
              String span = pan.getText();
              String saadhar = aadhar.getText();
              
               try{
 
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizens+"','"+existing+"')";
                c1.s.executeUpdate(q1);
                
                 new SignupThree(formno).setVisible(true);
                setVisible(false);
  
        }catch(Exception ex){
                   System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
}
