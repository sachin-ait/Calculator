import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 235, 498, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		Border border = panel.getBorder();
		Border margin = new EmptyBorder(10,10,10,10);
		
		panel.setBorder(new CompoundBorder(border, margin));
		
		JButton btnNewButton = new JButton("7");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_12 = new JButton("+");
		panel.add(btnNewButton_12);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JButton btnNewButton_3 = new JButton("4");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_13 = new JButton("-");
		panel.add(btnNewButton_13);
		
		JLabel label_5 = new JLabel("");
		panel.add(label_5);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2);
		
		JButton btnNewButton_6 = new JButton("1");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_14 = new JButton("*");
		panel.add(btnNewButton_14);
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4);
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3);
		
		JButton btnNewButton_9 = new JButton("0");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton(".");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("=");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_15 = new JButton("/");
		panel.add(btnNewButton_15);		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(51, 5, 498, 231);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_1.setBorder(new CompoundBorder(border, margin));
		
		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(0, 176, 498, 55);
		panel_1.add(lblNewLabel);
		
		//test
		//test
	}
}
