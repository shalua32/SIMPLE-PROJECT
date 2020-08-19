package studentLogin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RegForm extends JFrame {

//private static final long serialvesionUID = 1L;
	
	//student details variables
	private JPanel mainContent;
	private JTextField FirstName;
	private JTextField SecondName;
	private JTextField LastName;
	private JTextField Email;
	private JTextField MobileNumber;
	private JTextField StudentID;
	private JPasswordField myPassword;
	private JRadioButton Female, Male;
	private JButton    btnNewButton;
	
	/*
	 * 
	 * APPLICATION STARTS HERE !!!
	 * */
	
	public static void main(String []args) {
		
	EventQueue.invokeLater(new Runnable() {
		
		public void run() {
			
			try {
				
				RegForm Frame = new RegForm();
				Frame.setVisible(true);
				}
			
			
			catch (Exception e)
			{
			e.printStackTrace();
      }
		
	}
	
});	
		
	
	
}
	
	//CODE TO CREATE FRAME// GUI
	
public RegForm () {
	//creating layout
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kelvin\\Pictures\\Java\\g.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 10 , 1014, 720);
		setResizable(false);
		mainContent = new JPanel();
		mainContent.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(mainContent);
		mainContent.setLayout(null);
		
	//creating form prompt
	//form title
		JLabel lblNewStudentRegister = new JLabel ("Student Registration Form");
		lblNewStudentRegister.setFont(new Font("courier", Font.PLAIN, 30));
		lblNewStudentRegister.setBounds(300, 20, 500, 50);
		mainContent.add(lblNewStudentRegister);
		
	//first name code
		JLabel lblFName = new JLabel ("First Name");
		lblFName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFName.setBounds(58, 152, 99, 43);
		mainContent.add(lblFName);
		
	//second name code
		JLabel lblSName = new JLabel ("Second Name");
		lblSName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSName.setBounds(58, 245, 150, 29);
		mainContent.add(lblSName);

	//sur/last name code
		JLabel lblLName = new JLabel ("SurName");
		lblLName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLName.setBounds(58, 324, 124,36);
		mainContent.add(lblLName);
		
	// Email code
			JLabel lblEmail = new JLabel ("Email");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblEmail.setBounds(58, 400, 124,36);
			mainContent.add(lblEmail);
			
			
			
	//other sides 		
	// NumberId code
		JLabel lblId = new JLabel ("Student ID No");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblId.setBounds(500, 145, 228, 50);
		mainContent.add(lblId);
	
	// Confirm password code
		JLabel lblPassword = new JLabel ("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(500, 235, 228, 50);
		mainContent.add(lblPassword);
		
	// Mobile no code
		JLabel lblMobileNo = new JLabel ("Mobile Number");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNo.setBounds(500, 320, 228, 50);
		mainContent.add(lblMobileNo);
	
	// Gender code
		JLabel lblGen = new JLabel ("Gender");
		 lblGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblGen.setBounds(500, 395, 228, 50);
		
		mainContent.add(  lblGen);
						
				
	/***
	 * 
	 * 
	 * Code to create text fields to the label
	 * right side
	 * 
	 */
		
	//For first name
		
      FirstName = new JTextField();
      FirstName.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      FirstName.setBounds(214,151,228,45);
      mainContent.add(FirstName );
      FirstName.setColumns(10);
      
      
      //for second
      
      
      SecondName = new JTextField();
      SecondName.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      SecondName.setBounds(214,235,228,45);
      mainContent.add(SecondName );
      SecondName.setColumns(10);
      
      
      //for surname
      
      LastName = new JTextField();
      LastName.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      LastName.setBounds(214,319,228,45);
      mainContent.add(LastName );
      LastName.setColumns(10);
		
		
      //for Email
      Email = new JTextField();
      Email.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      Email.setBounds(214,400,228,45);
      mainContent.add(Email );
      Email.setColumns(10);
		
/*
 * 
 * LEFT SIDE
 * 
 */
      //for Student id
      
      //for Email
      StudentID = new JTextField();
      StudentID.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      StudentID.setBounds(700,151,228,45);
      mainContent.add(StudentID );
      StudentID.setColumns(10);
		
		
      //for password
      myPassword = new JPasswordField();
      myPassword.setFont(new Font ("Times New Roman", Font.ITALIC, 18));
      myPassword.setBounds(700, 235 , 228, 45);
      mainContent.add(myPassword);
      myPassword.setColumns(10);
      
      //mobile number
      MobileNumber = new JTextField();
      MobileNumber.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      MobileNumber.setBounds(700,319,228,45);
      mainContent.add(MobileNumber );
      MobileNumber.setColumns(10);
      
      //mobile number
      Male = new JRadioButton("Male");
      Female = new JRadioButton("Female");
      Male.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      Male.setBounds(700,400,228,45);
      Female.setFont(new Font ("Times New roman", Font.ITALIC, 18));
      Female.setBounds(700,430,228,45);
      ButtonGroup all = new ButtonGroup();
      all.add(Male);
      all.add(Female);
      mainContent.add(Female);
      mainContent.add(Male);


      
     
      
      
      
	//Button
      btnNewButton = new JButton("REGISTER");
      btnNewButton.setFont(new Font("Time New Roman", Font.ITALIC, 18));
      btnNewButton.setBounds(400,500,228,45);
      mainContent.add(btnNewButton);
      btnNewButton.addActionListener(new ActionListener() {
    	  
    	  public void actionPerformed(ActionEvent e) {
    		  String firstname = 	FirstName.getText();
    		  String Secondname =  SecondName.getText();
    		  String Lastname  =   LastName.getText();
    		  String email =       Email.getText();
    		  String mobNo =       MobileNumber.getText();
    		  int size =           mobNo.length();
    		  String ID =          StudentID.getText();
    		  char[] password   =   myPassword.getPassword();
    		  int len =           password.length;
    		  String genderF   = Female.getText();
    		  String generM    = Male.getText(); 		
    		
    		  
    		  /*  String msg = "" + firstname;
    		  msg += "/n";*/
    		  
    		  
    		 if (size != 10) {
    			 JOptionPane.showMessageDialog(btnNewButton, "Invalid Phone NUmber");
    		 }   		  
    		  
    		 else if( len <= 8) {
    			  JOptionPane.showMessageDialog(btnNewButton, "Invalid Password");
    			 
    			  
    		  }
    		 
    		 
    		 
    		 
    	  }
    	  
      });
      
      
     
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
