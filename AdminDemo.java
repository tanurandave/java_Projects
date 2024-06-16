package HotelDemo;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class AdminDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static final String DB_URL = "jdbc:sqlserver://LAPTOP-5FKBIOV4\\SQLEXPRESS:1433;databaseName=sorder;encrypt=true;trustServerCertificate=true";
	static final String DB_URL1 = "jdbc:sqlserver://LAPTOP-5FKBIOV4\\SQLEXPRESS:1433;databaseName=register;encrypt=true;trustServerCertificate=true";

	static final String USER = "sa";

		static final String PASS = "12345";
		private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDemo frame = new AdminDemo();
					frame.setVisible(true);
					frame.setSize(1400,1200);
					frame.setTitle("Admin Panel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 958, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		BackgroundPanel6 contentPane = new BackgroundPanel6("C:\\Users\\randa\\second_year_B29\\DataBaseDemo\\src\\HotelDemo\\lbg3.jpg");
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
     
		Button button = new Button("previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLoginDemo ld=new AdminLoginDemo();
			ld.setVisible(true);
			ld.setSize(1400, 1200);
			dispose();
			}
		});
		button.setBounds(20, 32, 141, 45);
		contentPane.add(button);
		
		
		Button button_1 = new Button("Registred members ");
		button_1.setBounds(258, 44, 241, 44);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				table = new JTable();
				table.setBounds(24, 176, 219, 180);
				
				
				
				

				
				 try {
	       			  
	   					
	       			  
						Connection conn;
						
						
						conn=DriverManager.getConnection(DB_URL1,USER,PASS);
						Statement stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery("select * from registerDemo");

						while(rs.next())

						{
							String data=rs.getString(1)+""+rs.getInt(2)+""+rs.getString(3)+""+rs.getString(4);
							String index[]= {"name","age","email","password"};
						//table.add(data,index);

						}
				conn.close();
					}
					catch(Exception e1) {
						System.out.println("faild");
						
					}
				 contentPane.add(table);
			}
			
		});
		
		Button button_2 = new Button("Current order");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea1 = new JTextArea();
				textArea1.setBounds(462, 266, 443, 256);
				contentPane.add(textArea1);
				 try {
       			  
   					
       			  
						Connection conn;
						
						
						conn=DriverManager.getConnection(DB_URL,USER,PASS);
						Statement stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery("select * from shop_order");

						while(rs.next())

						{
							String data=rs.getString(1)+""+rs.getInt(2);

							textArea1.setText(data);

						}
				conn.close();
					}
					catch(Exception e1) {
						System.out.println("faild");
						
					}
				
			}
		});
		button_2.setBounds(530, 44, 212, 44);
		contentPane.add(button_2);
		
		Button button_3 = new Button("pending order");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_3.setBounds(792, 44, 206, 44);
		contentPane.add(button_3);
				
		
	}
}

class BackgroundPanel6 extends JPanel {
  
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPanel6(String imagePath) {
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


