import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	
		private JLabel LBL_Visor;
		private boolean substitui = true;
		private double num1;
		private char oper = ' ';
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LBL_Visor = new JLabel("0");
		LBL_Visor.setHorizontalAlignment(SwingConstants.RIGHT);
		LBL_Visor.setFont(new Font("Arial", Font.PLAIN, 35));
		frame.getContentPane().add(LBL_Visor, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton BTN_1 = new JButton("1");
		BTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('1');
			}
		});
		BTN_1.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_1);
		
		JButton BTN_2 = new JButton("2");
		BTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('2');
			}
		});
		BTN_2.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_2);
		
		JButton BTN_3 = new JButton("3");
		BTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('3');
			}
		});
		BTN_3.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_3);
		
		JButton BTN_Mais = new JButton("+");
		BTN_Mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmOperacao('+');
			}
		});
		BTN_Mais.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Mais);
		
		JButton BTN_4 = new JButton("4");
		BTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('4');
			}
		});
		BTN_4.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_4);
		
		JButton BTN_5 = new JButton("5");
		BTN_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('5');
			}
		});
		BTN_5.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_5);
		
		JButton BTN_6 = new JButton("6");
		BTN_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('6');
			}
		});
		BTN_6.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_6);
		
		JButton BTN_Menos = new JButton("-");
		BTN_Menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmOperacao('-');
			}
		});
		BTN_Menos.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Menos);
		
		JButton BTN_7 = new JButton("7");
		BTN_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('7');
			}
		});
		BTN_7.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_7);
		
		JButton BTN_8 = new JButton("8");
		BTN_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('8');
			}
		});
		BTN_8.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_8);
		
		JButton BTN_9 = new JButton("9");
		BTN_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmDigito('9');
			}
		});
		BTN_9.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_9);
		
		JButton BTN_Vezes = new JButton("*");
		BTN_Vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmOperacao('*');
			}
		});
		BTN_Vezes.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Vezes);
		
		JButton BTN_0 = new JButton("0");
		BTN_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmOperacao('0');
			}
		});
		BTN_0.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_0);
		
		JButton BTN_Igual = new JButton("=");
		BTN_Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickIgual();
			}
		});
		BTN_Igual.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Igual);
		
		JButton BTN_Clear = new JButton("C");
		BTN_Clear.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Clear);
		
		JButton BTN_Dividir = new JButton("/");
		BTN_Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trateClickEmOperacao('/');
			}
		});
		BTN_Dividir.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(BTN_Dividir);
	}
	private void trateClickEmDigito(char dig) {
		if(this.substitui) {
			this.LBL_Visor.setText("" + dig);
			this.substitui = false;
		}else {
			this.LBL_Visor.setText(this.LBL_Visor.getText() + dig);
		}
	}
	private void trateClickEmOperacao(char opr) {
		this.num1 = Double.parseDouble(this.LBL_Visor.getText());
		this.substitui = true;
		this.oper = opr;
	}
	private void trateClickIgual() {
		if(this.oper != ' ') {
			double num2 = Double.parseDouble(this.LBL_Visor.getText());
			double res = 0;
			
			switch(this.oper) {
				case '+':
					res = this.num1 + num2;
					break;
				case '-':
					res = this.num1 - num2;
					break;
				case '*':
					res = this.num1 * num2;
					break;
				case '/':
					res = this.num1 / num2;
			}
			this.LBL_Visor.setText("" + res);
			this.substitui = true;
			this.oper = ' ';
		}
	}
}
