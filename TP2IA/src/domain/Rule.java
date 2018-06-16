package domain;

import java.util.List;

public class Rule{

	public static String ACTION_RULE1 = "No hacer nada";
	public static String ACTION_RULE2 = "Emitir audio que indique al niño que no es obligación contestar";
	public static String ACTION_RULE3 = "Emitir audio que indique al niño que antes de contestar consulte a un mayor responsable";
	public static String ACTION_RULE4 = "Emitir audio que indique al niño que no conteste la pregunta";
	public static String ACTION_RULE5 = "Comenzar una grabación de la charla";
	public static String ACTION_RULE6 = "Enviar un aviso vía e-mail a los padres";
	public static String ACTION_RULE7 = "Enviar un aviso inmediato vía smartphone a los padres";
	public static String ACTION_RULE8 = "Bloquear conexión a internet";
	public static String ACTION_RULE9 = "Avisar a los diseñadores del dispositivo de escucha";
	public static String ACTION_RULE10 = "Apagar SmartToy";
	
	//Variables
	private List<PalabraClave> condicion;
	private String accion;
	private int peso;

	//Constructor
	public Rule() {
	}
	
	public Rule(List<PalabraClave> condicion, String accion, int peso) {
		super();
		this.condicion = condicion;
		this.accion = accion;
		this.peso = peso;
	}

	//Getter y Setters
	public List<PalabraClave> getCondicion() {
		return condicion;
	}
	public void setCondicion(List<PalabraClave> condicion) {
		this.condicion = condicion;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
