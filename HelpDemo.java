package HotelDemo;
import java.io.File;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelpDemo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;

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
					HelpDemo frame = new HelpDemo();
					frame.setVisible(true);
					frame.setSize(1400,1200);
					frame.setTitle(" order!!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HelpDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 910, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 96));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BackgroundPanel3 contentPane = new BackgroundPanel3("C:\\Users\\randa\\second_year_B29\\DataBaseDemo\\src\\HotelDemo\\hd.png");
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
     
		 Button button = new Button("Back");
		 button.setActionCommand("Back");
		 button.setFont(new Font("Dialog", Font.PLAIN, 15));
		button.setForeground(new Color(0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HomeDemo hm=new HomeDemo();
				hm.setVisible(true);
				hm.setSize(1400,1200);
				dispose();
			
			}
		});
		button.setBounds(20, 74, 186, 48);
		contentPane.add(button);

		
		JLabel label = new JLabel("Email :");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setBounds(400, 142, 178, 55);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("password :");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_1.setBounds(400, 232, 178, 55);
		contentPane.add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(647, 154, 206, 48);
		contentPane.add(textField);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setBounds(647, 239, 206, 48);
		contentPane.add(textField_1);
		
		 Button button_1 = new Button("Submit");
		 button_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	        button_1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String email = textField.getText();
	                String password = textField_1.getText();
	                HelpDemo frame = new HelpDemo();
	                if (isValidEmail(email) && !password.isEmpty()) {
	                    JOptionPane.showMessageDialog(frame," Successful..!!!");
	                    textField.setText("");
	                    textField_1.setText("");
	                } else {
	                	 JOptionPane.showMessageDialog(frame," faild try again");
		                    
	                }
	                try {
						Connection conn;
						
						
						conn=DriverManager.getConnection(DB_URL,USER,PASS);
						
					PreparedStatement ps=conn.prepareStatement("insert into userDemo(email,password) values(?,?)");
					Statement stmt=conn.createStatement();
					System.out.println(email);
						System.out.println(password);
						System.out.println("connection created");
						ps.setString(1, email);
						ps.setString(2, password);
						ResultSet rs=stmt.executeQuery("select * from helpData");
					//	ResultSet rs=stmt.executeQuery("select * from helpData Where email=='"+email);

						//System.out.println("selected data");
						/*	while(rs.next())

						{
						//	JOptionPane.showMessageDialog(jpanel,"login successful");
							//String email1=rs.getString(1);
							//String pass=rs.getString(2);
						//System.out.println( +" "+);

						} */	
						//if(rs.getString(1)==email&&rs.getString(2)==password) {
							
						//}
						int rowAffected=ps.executeUpdate();
						System.out.println("@@Row Value is ="+rowAffected);
						if(rowAffected>0) {
							
							JOptionPane.showMessageDialog(contentPane,"data inserted");
						}else {
							
							JOptionPane.showMessageDialog(contentPane,"data not inserted");
						}
						

								
						
					
					conn.close();
					}
					catch(Exception e1) {
						System.out.println("faild");
						
					}
				}
				
	            
	        });
	        button_1.setBounds(474, 361, 206, 48);
	        contentPane.add(button_1);
	        Button button_2 = new Button("Contact");

			 button_2.setActionCommand("Contact");
	        button_2.setForeground(new Color(0, 0, 0));
	        button_2.setFont(new Font("Dialog", Font.PLAIN, 15));
	        button_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                ContactPage cp = new ContactPage();
	              cp.setVisible(true);
	              cp.setSize(1400,1200);
	               dispose();
	            }
	        });
	        button_2.setForeground(new Color(0, 0, 0));
	        button_2.setBounds(20, 154, 186, 48);
	        contentPane.add(button_2);
	        
	        JLabel lblNewLabel = new JLabel("Help");
	        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD , 50));
	        lblNewLabel.setBounds(567, 49, 215, 55);
	        contentPane.add(lblNewLabel);
	    }
	    
	    // Method to validate email address
	    private boolean isValidEmail(String email) {
	        // Regular expression for email validation
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        return email.matches(emailRegex);
	    }
	}


class BackgroundPanel3 extends JPanel {
  
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPanel3(String imagePath) {
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

