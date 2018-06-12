package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import productionsystem.ProductionSystem;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {

	private JFrame frmTpIa;
	private JTextField textFieldSmartToySay;

	ProductionSystem productionSystemInstace = new ProductionSystem();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmTpIa.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTpIa = new JFrame();
		frmTpIa.setTitle("TP IA");
		frmTpIa.setResizable(false);
		frmTpIa.setBounds(100, 100, 800, 500);
		frmTpIa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpIa.getContentPane().setLayout(null);
		
		TextArea textAreaLog = new TextArea();
		textAreaLog.setBackground(SystemColor.controlHighlight);
		textAreaLog.setEditable(false);
		textAreaLog.setBounds(10, 143, 772, 314);
		frmTpIa.getContentPane().add(textAreaLog);
		
		textFieldSmartToySay = new JTextField();
		textFieldSmartToySay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaLog.append("\n SmartToy dice: " + textFieldSmartToySay.getText());
				productionSystemInstace.appendLog(textFieldSmartToySay.getText());
				textFieldSmartToySay.setText("");
			}
		});
		textFieldSmartToySay.setBounds(10, 82, 772, 25);
		frmTpIa.getContentPane().add(textFieldSmartToySay);
		textFieldSmartToySay.setColumns(10);
		
		JLabel lblIngreseUnaFrase = new JLabel("El SmartToy dice:");
		lblIngreseUnaFrase.setBounds(10, 66, 139, 15);
		frmTpIa.getContentPane().add(lblIngreseUnaFrase);
	}
}
