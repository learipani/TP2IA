package productionsystem;

import java.util.ArrayList;
import java.util.List;

import domain.PalabraClave;
import domain.Rule;

public class ProductionSystem {
	


	public static void main(String[] args) {
		
		List<PalabraClave> memoriaTrabajo;
		List<Rule> memoriaProduccion;
		List<String> memoriaCotejo; //Esto es una memoria temporal
		String log; //Esto es el log que se va a ir mostrando en la interfaz
		
		
		memoriaTrabajo = IniciarMemoriaTrabajo();
		memoriaProduccion = IniciarMemoriaProduccion(memoriaTrabajo);
		
		/* TODO Acá lo que hay que hacer, es un while o algo que se repita todo el tiempo y pida ingresar frases,
		 * por cada frase que se ingrese, buscar las palabras claves de dicha frase y agregarlas a la memoriaCotejo,
		 * luego pasar la memoriaCotejo al método Resolve() de la clase InferenceEngine y esta va a devolver una
		 * acción si las palabrasClaves enviadas verifican alguna acción*/

	}

	private static List<PalabraClave> IniciarMemoriaTrabajo() {
		//**TODO Acá hay que crear todos los sinonimos que definamos**/
		
		List<PalabraClave> auxList = new ArrayList<PalabraClave>();
		
		PalabraClave p1 = new PalabraClave("PalabraClave", new ArrayList<String>());
		p1.getSinonimos().add("Sinonimo1");
		p1.getSinonimos().add("Sinonimo2");
		p1.getSinonimos().add("Sinonimo3");
		auxList.add(p1);
		
        
		return auxList;
	}

	private static List<Rule> IniciarMemoriaProduccion(List<PalabraClave> memoriaTrabajo) {
		/**TODO Acá hay que  crear todas las reglas que definamos**/
		List<Rule> auxList = new ArrayList<Rule>();
		
		Rule r1 = new Rule(new ArrayList<PalabraClave>(), "ACCION 1");
		//Esto es para agregar palabras clave a la regla directamente desde la memoria de trabajo
		r1.getCondicion().add((PalabraClave) memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("PalabraClave1")));
		r1.getCondicion().add((PalabraClave) memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("PalabraClave2")));
		r1.getCondicion().add((PalabraClave) memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("PalabraClave3")));
		auxList.add(r1);
		
		return auxList;

	}

	
}
