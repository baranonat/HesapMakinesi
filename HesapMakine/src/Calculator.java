import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.concurrent.CopyOnWriteArraySet;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnC;
	private JButton btnNewButton_15;
	private double number, answer;
	private int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}

	public void calculate() {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));

			break;

		}

	}

	public Calculator() {
		setResizable(false);
		setTitle("Hesap Makinesi");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Screen = new JPanel();
		Screen.setBackground(Color.WHITE);
		Screen.setBounds(10, 11, 364, 60);
		contentPane.add(Screen);
		Screen.setLayout(null);

		input = new JTextField();
		input.setBackground(Color.WHITE);
		input.setEditable(false);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBounds(0, 22, 364, 38);
		Screen.add(input);
		input.setColumns(10);

		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(4, 4, 356, 14);
		Screen.add(lbl);

		JPanel Control = new JPanel();
		Control.setBackground(Color.WHITE);
		Control.setBounds(10, 82, 364, 368);
		contentPane.add(Control);
		Control.setLayout(new GridLayout(4, 4, 20, 20));

		btnNewButton_1 = new JButton("9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1);

		btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_2);

		btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_3);

		btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_4);

		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_6);

		btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton);

		btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_9);

		btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_5);

		btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_8);

		btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_7);

		btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_12);

		btnNewButton_10 = new JButton("*");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_10);

		btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_11);

		btnNewButton_13 = new JButton("=");
		btnNewButton_13.setBackground(Color.GREEN);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_13);

		btnC = new JButton("C");
		btnC.setBackground(Color.RED);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnC);

		btnNewButton_15 = new JButton("%");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_15);
	}
}
