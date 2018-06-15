package productionsystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import domain.*;


/*Este método solo contiene método estáticos, se usa para inferir cosas*/
public class InferenceEngine {
	
	public static String Resolve(List<PalabraClave> memoriaCotejo, List<Rule> memoriaProduccion, int criterioResolucion) {
		/* TODO Este método recibe la memoria temporal (cotejo) y la memoria de producción
		 * (las reglas),  y devuelve una acción si verifica alguna regla, en caso contrario
		 * devuelve null*/
		
		switch (criterioResolucion) {
		case 1:
			AlgoritmoEspecificidad(memoriaProduccion);
			break;

		case 2:
			AlgoritmoPrioridad();
			break;
			
		case 3:
			AlgoritmoAleatorio();
			break;
			
		default:
			break;
		}
		
		List<Rule> listaReglas = new ArrayList<Rule>();
		
		/*Recorre todas las reglas de la memoria de producción y se fija si existe alguna regla, cuyas condiciones,
		 * esten incluídas todas en la "memoriaCotejo"*/
		for (Rule itemRule : memoriaProduccion) {
			if(memoriaCotejo.containsAll(itemRule.getCondicion())) {
				listaReglas.add(itemRule);
			}
		}
		/*Si no se verifica ninguna regla, devuelve "No hacer nada",
		 * Si verifica una regla, devuelve la acción de la primera de la lista*/
		if(listaReglas.isEmpty()) {
			return Rule.ACTION_RULE1;
		}
		else {
			return listaReglas.stream().findFirst().get().getAccion();
		}
		
	}
	
	private static void AlgoritmoAleatorio() {
		// TODO Auto-generated method stub
		
	}

	private static void AlgoritmoPrioridad() {
		// TODO Auto-generated method stub
		
	}

	private static void AlgoritmoEspecificidad(List<Rule> memoriaProduccion) {
			List<Rule> auxList = new ArrayList<Rule>(); 
			/*memoriaProduccion.size();
			for(Rule rule : memoriaProduccion ) {
				int prueba = rule.getCondicion().size();
				System.out.println(prueba);}*/
			
			Collections.sort(memoriaProduccion, new Comparator<Rule>() {

				@Override
				public int compare(Rule r1, Rule r2) {
						if(r1.getCondicion().size()>r2.getCondicion().size()) {
							return -1;
						}
						if(r1.getCondicion().size()<r2.getCondicion().size()) {
							return 1;
						} 						
							return 0;
				}
			});		
	}

	public static PalabraClave GetPalabraClave(String palabraDeFrase, List<PalabraClave> memoriaTrabajo) {
		/* TODO Este método recibe una palabra de una frase, y, si existe en la memoria de
		 * trabajo, devuelve la palabra clave de dicha palabra recibida, en caso contrario
		 * devuelve null*/
		
		if(memoriaTrabajo.stream().anyMatch(pc -> pc.getPalabraClave().equals(palabraDeFrase))) {
			return memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals(palabraDeFrase)).findFirst().get();
		}
		else {
			for (PalabraClave itemPalabraClave : memoriaTrabajo) {
				if(itemPalabraClave.getSinonimos().stream().anyMatch(sinonimo -> sinonimo.equals(palabraDeFrase))) {
					return itemPalabraClave;
				}
			}	
		}	
		
		return null;
		
	}
	
}
