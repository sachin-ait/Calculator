import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class GUI {

	private JFrame frame;
	private float x,y,z;

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
	public GUI() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setIconImage(null);
		frame.getContentPane().setLayout(null);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
		frame.setFocusableWindowState(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(51, 5, 498, 231);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 176, 474, 55);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);	
		lblNewLabel.setBorder(new EmptyBorder(10,10,10,10));
		panel_1.add(lblNewLabel);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBounds(12, 40, 474, 136);
		lblHistory.setEnabled(false);
		lblHistory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHistory.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHistory.setOpaque(true);
		lblHistory.setBackground(new Color(240, 248, 255));	
		lblHistory.setBorder(new EmptyBorder(10,10,10,10));
		panel_1.add(lblHistory);		
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 249, 498, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 5, 8, 8));

		
		Border border = panel.getBorder();
		Border margin = new EmptyBorder(10,10,10,10);
		
		panel.setBorder(new CompoundBorder(border, margin));
		
		JButton btnNewButton = new JButton("7");
	
		
		btnNewButton.setBackground(new Color(245, 255, 250));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));

		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		
	
		btnNewButton_1.setBackground(new Color(245, 255, 250));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBackground(new Color(245, 255, 250));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_12 = new JButton("+");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_16 = new JButton("<");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("C");
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(245, 255, 250));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(245, 255, 250));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(new Color(245, 255, 250));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_13 = new JButton("-");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_20 = new JButton("(");
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton(")");
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBackground(new Color(245, 255, 250));
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBackground(new Color(245, 255, 250));
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBackground(new Color(245, 255, 250));
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_14 = new JButton("*");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_18 = new JButton("^");
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_22 = new JButton("~");
		panel.add(btnNewButton_22);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBackground(new Color(245, 255, 250));
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton(".");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("%");
		panel.add(btnNewButton_15);		
		
		JButton btnNewButton_21 = new JButton("/");
		panel.add(btnNewButton_21);
		

		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton_10);
		
		
		
		
	}
}
