package productionsystem;
import java.util.ArrayList;
import java.util.List;
import domain.*;


/*Este método solo contiene método estáticos, se usa para inferir cosas*/
public class InferenceEngine {
	
	public static String Resolve(List<PalabraClave> memoriaCotejo, List<Rule> memoriaProduccion) {
		/* TODO Este método recibe la memoria temporal (cotejo) y la memoria de producción
		 * (las reglas),  y devuelve una acción si verifica alguna regla, en caso contrario
		 * devuelve null*/
		
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
