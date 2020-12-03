package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import code.CalcHelper;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Gui {

	private JFrame frame;
	private double answer,history;
	private String number,screenNumber;
	private JPanel panel_1,panel;
	private JLabel lblHistory;
	private JButton btn7,btn8,btn9,btn4,btn5, btn6,btn1,btn2,btn3,btn0,btnEqual,btnDot,btnPlus,btnMinus,
					btnMulti,btnPercent,btnBack,btnClear,btnPower,btnRightBracket,btnLeftBracket,btnDivide,btnSqrt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private CalcHelper helper;
	private JTextField lblOutput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() throws Exception {
		initialize();
		helper= new CalcHelper();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setIconImage(null);
		frame.getContentPane().setLayout(null);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(240, 248, 255) );
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 516, 233);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 248, 255));
		
		lblHistory = new JLabel("<html>History");
		lblHistory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHistory.setBounds(22, 26, 474, 136);
		lblHistory.setEnabled(false);
		lblHistory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHistory.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHistory.setOpaque(true);
		lblHistory.setBackground(new Color(240, 248, 255));	
		lblHistory.setBorder(new EmptyBorder(10,10,10,10));
		panel_1.add(lblHistory);		
		
		lblOutput = new JTextField();
		lblOutput.setBounds(12, 189, 484, 32);
		panel_1.add(lblOutput);
		lblOutput.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(0, 232, 516, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 7, 8, 8));
		panel.setBackground(Color.white);

		
		Border border = panel.getBorder();
		Border margin = new EmptyBorder(10,10,10,10);
		
		panel.setBorder(new CompoundBorder(border, margin));
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("7");
			}
		});
	
		
		btn7.setBackground(new Color(245, 255, 250));
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Arial", Font.PLAIN, 20));

		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("8");
			}
		});
		
	
		btn8.setBackground(new Color(245, 255, 250));
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("9");
			}
		});
		btn9.setBackground(new Color(245, 255, 250));
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn9);
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("+");
			}
		});
		panel.add(btnPlus);
		
		btnBack = new JButton("<");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					numberFunction("<");
			}
		});
		
		btnMulti = new JButton("*");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("*");
			}
		});
		panel.add(btnMulti);
		panel.add(btnBack);
		
		btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("C");
			}
		});
		panel.add(btnClear);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("4");
			}
		});
		btn4.setBackground(new Color(245, 255, 250));
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("5");
			}
		});
		btn5.setBackground(new Color(245, 255, 250));
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn5);
		
		 btn6 = new JButton("6");
		 btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("6");
			}
		});
		 btn6.setBackground(new Color(245, 255, 250));
		 btn6.setForeground(Color.BLACK);
		 btn6.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add( btn6);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("-");
			}
		});
		panel.add(btnMinus);
		
		btnLeftBracket = new JButton("(");
		btnLeftBracket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLeftBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("(");
			}
		});
		
		 btnDivide = new JButton("/");
		 btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 btnDivide.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numberFunction("/");
		 	}
		 });
		 panel.add(btnDivide);
		panel.add(btnLeftBracket);
		
		btnRightBracket = new JButton(")");
		btnRightBracket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRightBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction(")");
			}
		});
		panel.add(btnRightBracket);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberFunction("1");
			}
		});
		btn1.setBackground(new Color(245, 255, 250));
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("2");
			}
		});
		btn2.setBackground(new Color(245, 255, 250));
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("3");
			}
		});
		btn3.setBackground(new Color(245, 255, 250));
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn3);
		
		btnPower = new JButton("^");
		btnPower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("^");
			}
		});
		panel.add(btnPower);
		
		btnSqrt = new JButton("\u221A");
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("\u221A");
			}
		});
		panel.add(btnSqrt);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				numberFunction("0");
			}
		});
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("sin(");
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("cos(");
			}
		});
		panel.add(btnCos);
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setEnabled(false);
		panel.add(btnNewButton_1);
		btn0.setBackground(new Color(245, 255, 250));
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(btn0);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = lblOutput.getText();
				if(number.contains(".")) {
					
				}else {
					screenNumber = number+".";
					lblOutput.setText(screenNumber);
				}	
				
			}
		});
		
		btnNewButton = new JButton("");
		btnNewButton.setVisible(false);
		btnNewButton.setEnabled(false);
		panel.add(btnNewButton);
		panel.add(btnDot);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.0;
		c.weighty = 0.0;
		c.gridwidth = 3;
		c.gridx = 5;
		c.gridy = 4;
		
		 btnEqual = new JButton("=");
		 btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input= lblOutput.getText();
				lblHistory.setText(lblHistory.getText()+"<br>"+input);
				try
				{
				  lblOutput.setText(""+helper.calc(input));
				}
				catch (Exception e1) {
					lblOutput.setText(e1.getMessage());
				}
			}
		});
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("%");
			}
		});
		panel.add(btnPercent);		
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberFunction("tan(");
			}
		});
		panel.add(btnTan);
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(btnEqual,c);
			
	
	}
	private void numberFunction(String a) {				
		
		if(lblOutput.getText().equals("0")) {
			screenNumber = a;
			lblOutput.setText(screenNumber);
			
		}else {
				switch(a) {
				case "+":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
					
				    break;
				case "-":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case "*":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case "/":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				    
				case "<":
					try {
						number = lblOutput.getText();
						screenNumber = number.substring(0, number.length() - 1);
						lblOutput.setText(screenNumber);						
					}catch(Exception ex) {						
					}
				    break;
				    
				case "C":
					lblOutput.setText("");
				    break;				   				   
				    
				case "\u221A":
					
				    break;
				    
				case "%":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case "^":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case "(":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case ")":
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				    break;
				case "=":
					
				    break;
				    
				case "0":
					number = lblOutput.getText();
					if(number.equals("")) {
						
					}else {
						screenNumber = number+0;
						lblOutput.setText(screenNumber);
					}
					break;
					
				default:
					number = lblOutput.getText();
					screenNumber = number+a;
					lblOutput.setText(screenNumber);
				
			}
		}
		
	}
}
