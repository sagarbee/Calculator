package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculator {

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	
	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnmod;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btn00;
	private JButton btnequal;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btndot;
	private JButton btnclear;
	private JButton btnaddition;
	private JButton btnsubstraction;
	private JButton btnmultiplication;
	private JButton btndivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 236, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(9, 11, 200, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace =null;
			if(textField.getText().length()>0) {
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backspace = str.toString();
				textField.setText(backspace);
			}
			}
		});
		btnbackspace.setFont(new Font("wingdings", Font.BOLD, 15));
		btnbackspace.setBounds(10, 64, 50, 50);
		frame.getContentPane().add(btnbackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(10, 112, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(10, 162, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn1.getText();
			textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(10, 213, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBounds(10, 262, 50, 50);
		frame.getContentPane().add(btn0);
		
		btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnmod.setBounds(112, 262, 50, 50);
		frame.getContentPane().add(btnmod);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(61, 112, 50, 50);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(61, 162, 50, 50);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(61, 213, 50, 50);
		frame.getContentPane().add(btn2);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn00.setBounds(61, 64, 50, 50);
		frame.getContentPane().add(btn00);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String answer;
			second = Double.parseDouble(textField.getText());
			if(operation == "+")
			{
				result = first+second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "-")
			{
				result = first-second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "*")
			{
				result = first*second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "/")
			{
				result = first/second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			if(operation == "%")
			{
				result = first%second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			
			
			
			
			
			
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequal.setBounds(112, 64, 50, 50);
		frame.getContentPane().add(btnequal);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(112, 112, 50, 50);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(112, 162, 50, 50);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(112, 213, 50, 50);
		frame.getContentPane().add(btn3);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btndot.getText();
				textField.setText(number);
				
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndot.setBounds(61, 262, 50, 50);
		frame.getContentPane().add(btndot);
		
		btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnclear.setBounds(159, 64, 50, 50);
		frame.getContentPane().add(btnclear);
		
		btnaddition = new JButton("+");
		btnaddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "+";
			
			}
		});
		btnaddition.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnaddition.setBounds(159, 112, 50, 50);
		frame.getContentPane().add(btnaddition);
		
		btnsubstraction = new JButton("-");
		btnsubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnsubstraction.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnsubstraction.setBounds(159, 162, 50, 50);
		frame.getContentPane().add(btnsubstraction);
		
		btnmultiplication = new JButton("*");
		btnmultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmultiplication.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnmultiplication.setBounds(159, 213, 50, 50);
		frame.getContentPane().add(btnmultiplication);
		
		btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndivide.setBounds(159, 262, 50, 50);
		frame.getContentPane().add(btndivide);
	}
}
