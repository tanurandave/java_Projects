package HotelDemo;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AdminLoginDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginDemo frame = new AdminLoginDemo();
					frame.setVisible(true);
					frame.setSize(1400, 1200);
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
	public AdminLoginDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 907, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		BackgroundPanel5 contentPane = new BackgroundPanel5("C:\\Users\\randa\\second_year_B29\\DataBaseDemo\\src\\HotelDemo\\lbg2.jpg");
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(458, 179, 180, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(458, 270, 180, 58);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(682, 184, 163, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(682, 289, 163, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Button button = new Button("Login");
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setBounds(544, 408, 208, 58);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 String email = textField.getText();
	                String pass1 = textField_1.getText();
	                 String userid="admin123@gmail.com";
	                 String pass="admin123";
	                 AdminLoginDemo frame = new AdminLoginDemo();
						
	                if (userid.equals(email) && pass.equals(pass1)) {
	                	JOptionPane.showMessageDialog(frame,"Successful..!!!");
			               
	                   AdminDemo hm=new AdminDemo();
	                   hm.setVisible(true);
	                   dispose();
	                } else {
	                	
	                	JOptionPane.showMessageDialog(frame," failed ");
	                	textField.setText(""); 
	                	textField_1.setText(""); 
	                }
			}

			
		});
		contentPane.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login Form");
		lblNewLabel_2.setBounds(525, 68, 368, 64);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel_2);
		
		Button button_1 = new Button("previous");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		button_1.setBounds(34, 22, 189, 40);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDemo md=new LoginDemo();
				md.setSize(1400, 1200);
				md.setVisible(true);
			
			}
			
		});
		contentPane.add(button_1);
		
	}
}

class BackgroundPanel5 extends JPanel {
  
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPanel5(String imagePath) {
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


