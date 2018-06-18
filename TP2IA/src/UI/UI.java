package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JTextField;

import domain.PalabraClave;
import domain.Rule;
import productionsystem.InferenceEngine;
import productionsystem.ProductionSystem;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

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
		frmTpIa.setBounds(100, 100, 1000, 780);
		frmTpIa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpIa.getContentPane().setLayout(null);
		JComboBox comboBoxCriterio = new JComboBox();

		
		TextArea textAreaLog = new TextArea();
		textAreaLog.setBackground(SystemColor.controlHighlight);
		textAreaLog.setEditable(false);
		textAreaLog.setBounds(10, 143, 972, 314);
		frmTpIa.getContentPane().add(textAreaLog);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(SystemColor.controlHighlight);
		textArea.setBounds(10, 463, 972, 258);
		frmTpIa.getContentPane().add(textArea);
		
		textFieldSmartToySay = new JTextField();
		textFieldSmartToySay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accion = null;
				String criterio = null; 
				textAreaLog.append("SmartToy dice: " + textFieldSmartToySay.getText());
				productionSystemInstace.appendLog(textFieldSmartToySay.getText());
				switch (comboBoxCriterio.getSelectedIndex()) {
				case 0:
					criterio = "ESPECIFICIDAD";
					accion = ProductionSystem.NewQuery(textFieldSmartToySay.getText(), productionSystemInstace.getMemoriaTrabajo(), productionSystemInstace.getMemoriaProduccion(), 1);
					break;
				case 1:
					
					criterio ="PRIORIDAD";
					accion = ProductionSystem.NewQuery(textFieldSmartToySay.getText(), productionSystemInstace.getMemoriaTrabajo(), productionSystemInstace.getMemoriaProduccion(), 2);
					break;
				case 2:
					criterio ="ALEATORIO";
					accion = ProductionSystem.NewQuery(textFieldSmartToySay.getText(), productionSystemInstace.getMemoriaTrabajo(), productionSystemInstace.getMemoriaProduccion(), 3);
					break;
				}
				//textAreaLog.append("\n El dispositivo reacciona de la siguiente manera: " + accion);
				textAreaLog.append(accion);
				textFieldSmartToySay.setText("");
				textAreaLog.append("\n\n");
				
				
				List<Rule> listaReglas = InferenceEngine.GetReglasPreseleccionadas();
				textArea.append("REGLAS PRESELECCIONADAS CON CRITERIO "+criterio+ ": \n");
				int i=1;
				for(Rule r: listaReglas) {
					textArea.append("Regla " + i +"\n");
					i++;
					
					for(PalabraClave pc: r.getCondicion()) {
						textArea.append(pc.getPalabraClave().toString()+", ");
					}
					textArea.append("\n");

				}
				textArea.append("\n");

			}
		});
		textFieldSmartToySay.setBounds(10, 82, 801, 25);
		frmTpIa.getContentPane().add(textFieldSmartToySay);
		textFieldSmartToySay.setColumns(10);
		
		JLabel lblIngreseUnaFrase = new JLabel("El SmartToy dice:");
		lblIngreseUnaFrase.setBounds(10, 66, 139, 15);
		frmTpIa.getContentPane().add(lblIngreseUnaFrase);
		
		JLabel lblCriterioDe = new JLabel("Criterio:");
		lblCriterioDe.setBounds(823, 66, 139, 15);
		frmTpIa.getContentPane().add(lblCriterioDe);
		
		comboBoxCriterio.setBounds(823, 82, 159, 24);
		comboBoxCriterio.addItem("Especificidad");
		comboBoxCriterio.addItem("Prioridad");
		comboBoxCriterio.addItem("Aleatorio");
		frmTpIa.getContentPane().add(comboBoxCriterio);
		comboBoxCriterio.setSelectedIndex(0);
		

	}
}
