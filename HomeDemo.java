package HotelDemo;
import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class HomeDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDemo frame = new HomeDemo();
					frame.setVisible(true);
					frame.setSize(1400,1200);

					frame.setTitle("Welcome to Restaurant Billing System");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeDemo() {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(00, 00, 1326, 736);

	        BackgroundPanel2 contentPane = new BackgroundPanel2("C:\\Users\\randa\\eclipse-workspace\\Micro\\src\\oopj_project\\r4.jpg");
	        contentPane.setForeground(new Color(255, 255, 255));
	        contentPane.setBackground(new Color(255, 255, 255));
	        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	       
		
		
		
	        JButton button = new JButton("Home");
	        button.setBackground(new Color(0, 0, 0));
	        button.setForeground(new Color(255, 255, 255));
	        button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	        button.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        button.setBounds(189, 25, 111, 31);
	        contentPane.add(button);

	        JButton button_1 = new JButton("Menu");
	        button_1.setBackground(new Color(0, 0, 0));
	        button_1.setForeground(new Color(255, 255, 255));
	        button_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	        button_1.setBounds(375, 25, 111, 31);
	        
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			MenuDemo ab=new MenuDemo();
			ab.setVisible(true);
			ab.setSize(1400, 1200);
			dispose();
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Order");
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_2.setBounds(565, 25, 111, 31);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			OrderPageDemo or=new OrderPageDemo();
			or.setVisible(true);
			or.setSize(1200,600);
			dispose();
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Help");
		button_3.setBackground(new Color(0, 0, 0));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_3.setBounds(745, 25, 111, 31);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				HelpDemo hd=new HelpDemo();
				hd.setVisible(true);
				hd.setSize(1400, 1200);
				dispose();
			}
		});
		contentPane.add(button_3);
		
		Label label = new Label("        Restorant Billing System");
		label.setBounds(395, 354, 451, 54);
		label.setBackground(new Color(0, 0, 0));
		label.setFont(new Font("Blackadder ITC", Font.BOLD | Font.ITALIC, 30));
		label.setForeground(new Color(255, 255, 255));
		contentPane.add(label);
		//"ऐकदा याल तर पुन्हा पुन्हा याल..."
		JLabel lblNewLabel = new JLabel("Aikda yal tar punha punha yal...");
		lblNewLabel.setForeground(new Color(255, 255, 255));

		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(767, 476, 387, 91);
		contentPane.add(lblNewLabel);
		
		Label label_1 = new Label("welcome..");
		label_1.setBackground(new Color(0, 0, 0));
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_1.setBounds(0, -1, 1304, 71);
		contentPane.add(label_1);
		
		Button button_4 = new Button("Login");
		button_4.setBackground(new Color(0, 0, 0));

		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  LoginDemo ld=new LoginDemo();
			  ld.setVisible(true);
			  ld.setSize(1400, 1200);
			  dispose();
			}
		});
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setBounds(1066, 79, 139, 31);
		contentPane.add(button_4);
	}
}
class BackgroundPanel2 extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel2(String imagePath) {
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