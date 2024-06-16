package HotelDemo;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import HotelDemo.BackgroundPaneldemo;

import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setSize(1400,1200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(00, 00, 1327, 1107);

        BackgroundPaneldemo contentPane = new BackgroundPaneldemo("C:\\Users\\randa\\second_year_B29\\DataBaseDemo\\src\\HotelDemo\\wbg.png");
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Taj Restaurant");
        lblNewLabel.setToolTipText("welcome...!!");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 45));
        lblNewLabel.setBounds(485, 153, 538, 77);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel1 = new JLabel("Find the best restaurants, cafes and bars in India");
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNewLabel1.setBounds(357, 276, 767, 41);
		contentPane.add(lblNewLabel1);
		
		
        JButton button = new JButton("Next");
        button.setBackground(new Color(128, 64, 64));
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HomeDemo ld=new HomeDemo();
        		ld.setVisible(true);
        		ld.setSize(1400,1200);
        	}
        });
        button.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        button.setBounds(989, 588, 234, 60);
        button.setForeground(new Color(255, 255, 255));
        button.setForeground(new Color(255, 255, 255));
        contentPane.add(button);
	}
}

class BackgroundPaneldemo extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

    public BackgroundPaneldemo(String imagePath) {
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



