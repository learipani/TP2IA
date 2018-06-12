package domain;

import java.util.List;

public class Rule {

	//Variables
	private List<PalabraClave> condicion;
	private String accion;

	//Constructor
	public Rule(List<PalabraClave> condicion, String accion) {
		super();
		this.condicion = condicion;
		this.accion = accion;
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
	
	
	

	
}
