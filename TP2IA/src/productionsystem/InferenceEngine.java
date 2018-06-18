package productionsystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import domain.*;


/*Este método solo contiene método estáticos, se usa para inferir cosas*/
public class InferenceEngine {
	
	static List<Rule> listaReglas = new ArrayList<Rule>();

	public static String Resolve(List<PalabraClave> memoriaCotejo, List<Rule> memoriaProduccion, int criterioResolucion) {
		/* TODO Este método recibe la memoria temporal (cotejo) y la memoria de producción
		 * (las reglas),  y devuelve una acción si verifica alguna regla, en caso contrario
		 * devuelve null*/
		
		Rule regla = new Rule();
		
		/*Recorre todas las reglas de la memoria de producción y se fija si existe alguna regla, cuyas condiciones,
		 * esten incluídas todas en la "memoriaCotejo"*/
		if(!memoriaCotejo.isEmpty()) {
		for (Rule itemRule : memoriaProduccion) {
			/*if(memoriaCotejo.containsAll(itemRule.getCondicion())) {
				listaReglas.add(itemRule);
			}*/
			//if((itemRule.getCondicion()).containsAll(memoriaCotejo)) {
			if(memoriaCotejo.containsAll(itemRule.getCondicion())) {
				listaReglas.add(itemRule);
			}
		}
		}
		
		switch (criterioResolucion) {
		case 1:
			regla = AlgoritmoEspecificidad(listaReglas);
			break;

		case 2:
			regla = AlgoritmoPrioridad(listaReglas);
			break;
			
		case 3:
			regla = algoritmoAleatorio(listaReglas);
			break;
			
		default:
			break;
		}
		
		
		/*Si no se verifica ninguna regla, devuelve "No hacer nada",
		 * Si existe una regla, devuelve la acción (que es la primera de la lista) */
		
			return MostartLog(regla, memoriaCotejo);
			//return regla.getAccion();
		
		
	}

	private static String MostartLog(Rule regla, List<PalabraClave> memoriaCotejo) {
		
		
		String salida ="\nEL AGENTE DETERMINO REALIZAR LA ACCION:  \n";
		if(regla == null) {
			salida+=Rule.ACTION_RULE1 +"\n";
		}
		else {
			salida+=regla.getAccion() + "\n";
				
		if(!memoriaCotejo.isEmpty()) {
		salida+= ("PORQUE RECONOCIO LAS PALABRAS CLAVES: \n");
		for (PalabraClave pc : memoriaCotejo) {
			  salida+=pc.getPalabraClave() + " \n";
			}
		}
		}
	    return salida;
	}

	private static Rule AlgoritmoPrioridad(List<Rule> memoriaProduccion) {

		Collections.sort(memoriaProduccion, new Comparator<Rule>() {
			@Override
			public int compare(Rule r1, Rule r2) {
					if(r1.getPeso()>r2.getPeso()) {
						return -1;
					}
					if(r1.getPeso()<r2.getPeso()) {
						return 1;
					} 						
						return 0;
			}
		});
		
		if(!memoriaProduccion.isEmpty()) {
			return memoriaProduccion.get(0);
		}
		else return null;
	}

	private static Rule AlgoritmoEspecificidad(List<Rule> memoriaProduccion) {
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
			
			if(!memoriaProduccion.isEmpty()) {
				return memoriaProduccion.get(0);
			}
			else return null;
	}

	private static Rule algoritmoAleatorio(List<Rule> listaReglas) {
		if(listaReglas.isEmpty()) {
			return null;
		}
		else {
			int numReglaAleatorio = (int) Math.floor(Math.random()*(listaReglas.size()));
			return listaReglas.get(numReglaAleatorio);
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

	public static List<Rule> GetReglasPreseleccionadas() {
		return listaReglas;
	}
	
}
