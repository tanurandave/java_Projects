package HotelDemo;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.JList;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ContactPage extends JFrame {

	// private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactPage frame = new ContactPage();
					frame.setVisible(true);
					frame.setSize(1400, 1200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ContactPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 961, 737);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 BackgroundPanel contentPane = new BackgroundPanel("C:\\\\Users\\\\randa\\\\second_year_B29\\\\DataBaseDemo\\\\src\\\\HotelDemo\\\\cbg.jpg");
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
		 JLabel label = new JLabel("Contact_Details ");
		label.setFont(new Font("Times New Roman", Font.BOLD, 45));
		label.setForeground(new Color(148, 0, 211));
		label.setBounds(506, 71, 335, 66);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Email :");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setBounds(425, 200, 152, 45);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("sanskrutipmaindarkar@coep.sveri.ac.in");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_2.setBounds(639, 208, 313, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("dshravani2011@gamil.com");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_3.setBounds(639, 261, 313, 37);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("randavetanuja@gmail.com");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_4.setBounds(639, 311, 313, 37);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Mobile No :");
		label_5.setForeground(new Color(0, 0, 255));
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_5.setBounds(425, 394, 152, 45);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("9022690165");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_6.setBounds(639, 425, 204, 29);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("9579448550");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_7.setBounds(639, 472, 204, 29);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("9067009229");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_8.setBounds(639, 518, 204, 29);
		contentPane.add(label_8);
		
		Button button = new Button("Back");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpDemo hm=new HelpDemo();
				hm.setVisible(true);
				hm.setSize(1400, 1200);
				dispose();
				
			
			}
		});
		button.setBounds(27, 32, 133, 37);
		contentPane.add(button);
	}
}


class BackgroundPanel extends JPanel {
    
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
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


