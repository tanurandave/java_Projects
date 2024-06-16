package HotelDemo;

import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel jpanel;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	Button b1;
	static final String DB_URL = "jdbc:sqlserver://LAPTOP-5FKBIOV4\\SQLEXPRESS:1433;databaseName=project;encrypt=true;trustServerCertificate=true";

	static final String USER = "sa";

		static final String PASS = "12345";
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginDemo frame = new LoginDemo();
					frame.setVisible(true);
					frame.setSize(1400,1200);
					frame.setTitle("Login ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 907, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 BackgroundPanel4 contentPane = new BackgroundPanel4("C:\\Users\\randa\\second_year_B29\\DataBaseDemo\\src\\HotelDemo\\lbg.jpg");
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(421, 179, 180, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(421, 270, 180, 40);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(625, 180, 172, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(625, 271, 172, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("Login");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		button.setBounds(521, 410, 180, 56);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String email=textField.getText();
					String password=textField_1.getText();  LoginDemo frame = new LoginDemo();
	                if (isValidEmail(email) && !password.isEmpty()) {
	                	   JOptionPane.showMessageDialog(frame,"Successful..!!!");
	 	                  textField.setText("");
	                    textField_1.setText("");
	                    
	                }
	                else {
	                	JOptionPane.showMessageDialog(frame,"failed try again");
	 	                  textField.setText("");
	                    textField_1.setText("");
	                }
	                
  					System.out.println(email);
					System.out.println(password);
	                    	
	                    		  try {
	                    			  
	  		    					
	                    			  
		    							Connection conn;
		    							
		    							
		    							conn=DriverManager.getConnection(DB_URL,USER,PASS);
		    							
		    							PreparedStatement ps=conn.prepareStatement("insert into login(email,password) values(?,?)");
		    						
		    							ps.setString(1, email);
		    							ps.setString(2, password);
		    							int rowAffected=ps.executeUpdate();
		    							System.out.println("@@Row Value is ="+rowAffected);
		    							if(rowAffected>0) {
		    								
		    								JOptionPane.showMessageDialog(jpanel,"data inserted");
		    							}else {
		    								
		    								JOptionPane.showMessageDialog(jpanel,"data is not inserted");
		    							}
		    							
		    						
		    						conn.close();
		    						}
		    						catch(Exception e1) {
		    							System.out.println("faild");
		    							
		    						}
			}	

			private boolean isValidEmail(String email) {
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		        return email.matches(emailRegex);
			}

			
		});
		contentPane.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(548, 66, 283, 58);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		contentPane.add(lblNewLabel_2);
		
		JButton button_1 = new JButton("previous");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		button_1.setBounds(34, 22, 193, 43);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeDemo md=new HomeDemo();
				md.setVisible(true);
				md.setSize(1400,1200);
			
			}
			
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Admin");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		button_2.setBounds(34, 88, 193, 40);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 AdminLoginDemo ad=new AdminLoginDemo();
			 ad.setVisible(true);
			 ad.setSize(1400,1200);
			 dispose();
			}
		});
		contentPane.add(button_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			RegisterDemo rd=new RegisterDemo();
			rd.setVisible(true);
			rd.setSize(1400,1400);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton.setBounds(34, 157, 193, 43);
		contentPane.add(btnNewButton);
	}
}

class BackgroundPanel4 extends JPanel {
  
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPanel4(String imagePath) {
        try {
            backgroundImage = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
    } 
} 




