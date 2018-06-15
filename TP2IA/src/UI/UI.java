package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import productionsystem.InferenceEngine;
import productionsystem.ProductionSystem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {

	JFrame frmTpIa;
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
		frmTpIa.setBounds(100, 100, 1000, 500);
		frmTpIa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpIa.getContentPane().setLayout(null);
		
		TextArea textAreaLog = new TextArea();
		textAreaLog.setBackground(SystemColor.controlHighlight);
		textAreaLog.setEditable(false);
		textAreaLog.setBounds(10, 143, 972, 314);
		frmTpIa.getContentPane().add(textAreaLog);
		
		textFieldSmartToySay = new JTextField();
		textFieldSmartToySay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux;
				textAreaLog.append("SmartToy dice: " + textFieldSmartToySay.getText());
				productionSystemInstace.appendLog(textFieldSmartToySay.getText());
				aux = ProductionSystem.NewQuery(textFieldSmartToySay.getText(), productionSystemInstace.getMemoriaTrabajo(), productionSystemInstace.getMemoriaProduccion(), 1);//se debe pasar el numero del algoritmo
				textAreaLog.append("\n El dispositivo reacciona de la siguiente manera: " + aux);
				textFieldSmartToySay.setText("");
				textAreaLog.append("\n\n");
				
			}
		});
		textFieldSmartToySay.setBounds(10, 82, 970, 25);
		frmTpIa.getContentPane().add(textFieldSmartToySay);
		textFieldSmartToySay.setColumns(10);
		
		JLabel lblIngreseUnaFrase = new JLabel("El SmartToy dice:");
		lblIngreseUnaFrase.setBounds(10, 66, 139, 15);
		frmTpIa.getContentPane().add(lblIngreseUnaFrase);
	}
}
