package domain;

import java.util.List;

public class PalabraClave {
	
	//Variables
	String palabraClave;
	List<String> sinonimos;
	
	//Constructor
	public PalabraClave(String palabraClave, List<String> sinonimos) {
		super();
		this.palabraClave = palabraClave;
		this.sinonimos = sinonimos;
	}
	
	//Getter y Setters
	public String getPalabraClave() {
		return palabraClave;
	}
	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	public List<String> getSinonimos() {
		return sinonimos;
	}
	public void setSinonimos(List<String> sinonimos) {
		this.sinonimos = sinonimos;
	}
	
	

}
