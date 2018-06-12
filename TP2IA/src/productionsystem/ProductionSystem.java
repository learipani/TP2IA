package productionsystem;

import java.util.ArrayList;
import java.util.List;

import domain.PalabraClave;
import domain.Rule;

public class ProductionSystem {
	
	List<PalabraClave> memoriaTrabajo;
	List<Rule> memoriaProduccion;
	List<String> memoriaCotejo; //Esto es una memoria temporal
	String log; //Esto es el log que se va a ir mostrando en la interfaz
	
	//Constructor
	public ProductionSystem() {
		super();
		InitClass();
	}

	public void InitClass() {
		this.memoriaCotejo = new ArrayList<String>();
		this.memoriaTrabajo = IniciarMemoriaTrabajo();
		this.memoriaProduccion = IniciarMemoriaProduccion(memoriaTrabajo);
		this.log = "";
		
		/* TODO Acá lo que hay que hacer, es un while o algo que se repita todo el tiempo y pida ingresar frases,
		 * por cada frase que se ingrese, buscar las palabras claves de dicha frase y agregarlas a la memoriaCotejo,
		 * luego pasar la memoriaCotejo al método Resolve() de la clase InferenceEngine y esta va a devolver una
		 * acción si las palabrasClaves enviadas verifican alguna acción*/

	}

	private static List<PalabraClave> IniciarMemoriaTrabajo() {
		//**TODO Acá hay que crear todos los sinonimos que definamos**/
		
		List<PalabraClave> auxList = new ArrayList<PalabraClave>();
		
		PalabraClave p1 = new PalabraClave("name", new ArrayList<String>());
		p1.getSinonimos().add("forename");
		p1.getSinonimos().add("noun");
		p1.getSinonimos().add("nickname");
		p1.getSinonimos().add("nppellation");
		auxList.add(p1);
		
		PalabraClave p2 = new PalabraClave("old", new ArrayList<String>());
		p2.getSinonimos().add("aged");
		auxList.add(p2);
		
		PalabraClave p3 = new PalabraClave("born", new ArrayList<String>());
		p3.getSinonimos().add("birth");
		p3.getSinonimos().add("birthday");
		auxList.add(p3);
		
		PalabraClave p4 = new PalabraClave("school", new ArrayList<String>());
		p4.getSinonimos().add("collage");
		p4.getSinonimos().add("schoolhouse");
		p4.getSinonimos().add("schooling");
		p4.getSinonimos().add("institute");
		p4.getSinonimos().add("institution");
		p4.getSinonimos().add("university");
		p4.getSinonimos().add("faculty");
		p4.getSinonimos().add("academy");
		p4.getSinonimos().add("capacity");
		auxList.add(p4);
		
		PalabraClave p5 = new PalabraClave("teacher", new ArrayList<String>());
		p5.getSinonimos().add("professor");
		p5.getSinonimos().add("educator");
		p5.getSinonimos().add("educationist");
		p5.getSinonimos().add("instructor");
		p5.getSinonimos().add("tutor");
		p5.getSinonimos().add("schoolmaster");
		p5.getSinonimos().add("preceptor");
		auxList.add(p5);
		
		PalabraClave p6 = new PalabraClave("bank", new ArrayList<String>());
		p6.getSinonimos().add("banking");
		p6.getSinonimos().add("atm");
		auxList.add(p6);
		
		PalabraClave p7 = new PalabraClave("money", new ArrayList<String>());
		p7.getSinonimos().add("currency");
		p7.getSinonimos().add("coin");
		p7.getSinonimos().add("coinage");
		p7.getSinonimos().add("wealth");
		p7.getSinonimos().add("richness");
		p7.getSinonimos().add("riches");
		p7.getSinonimos().add("moneybag");
		p7.getSinonimos().add("cash");
		p7.getSinonimos().add("finances");
		p7.getSinonimos().add("credit");
		auxList.add(p7);

		PalabraClave p8 = new PalabraClave("jewelry", new ArrayList<String>());
		p8.getSinonimos().add("jewelers");
		p8.getSinonimos().add("diamo");
		p8.getSinonimos().add("gems");
		p8.getSinonimos().add("gemstones");
		p8.getSinonimos().add("trinkets");
		p8.getSinonimos().add("bling");
		p8.getSinonimos().add("bijoux");
		p8.getSinonimos().add("precious");
		auxList.add(p8);
		
		PalabraClave p9 = new PalabraClave("necklace", new ArrayList<String>());
		p9.getSinonimos().add("chain");
		p9.getSinonimos().add("choker");
		p9.getSinonimos().add("necklet");
		p9.getSinonimos().add("locket");
		p9.getSinonimos().add("pearls");
		p9.getSinonimos().add("pendant");
		auxList.add(p9);
		
		PalabraClave p10 = new PalabraClave("job", new ArrayList<String>());
		p10.getSinonimos().add("occupation");
		p10.getSinonimos().add("profession");
		p10.getSinonimos().add("trade");
		p10.getSinonimos().add("career");
		p10.getSinonimos().add("work");
		p10.getSinonimos().add("vocation");
		auxList.add(p10);
		
		PalabraClave p11 = new PalabraClave("home", new ArrayList<String>());
		p11.getSinonimos().add("house");
		p11.getSinonimos().add("residence");
		p11.getSinonimos().add("apartment");
		p11.getSinonimos().add("flat");
		p11.getSinonimos().add("bungalow");
		p11.getSinonimos().add("property");
		p11.getSinonimos().add("room");
		p11.getSinonimos().add("place");
		p11.getSinonimos().add("domicile");
		p11.getSinonimos().add("habitation");
		p11.getSinonimos().add("quarter");
		auxList.add(p11);
		
		PalabraClave p12 = new PalabraClave("town", new ArrayList<String>());
		p12.getSinonimos().add("city");
		p12.getSinonimos().add("minicipality");
		p12.getSinonimos().add("urban");
		p12.getSinonimos().add("township");
		p12.getSinonimos().add("suburb");
		p12.getSinonimos().add("village");
		auxList.add(p12);
		
		PalabraClave p13 = new PalabraClave("license", new ArrayList<String>());
		p13.getSinonimos().add("permit");
		p13.getSinonimos().add("certificate");
		p13.getSinonimos().add("document");
		p13.getSinonimos().add("documentation");
		p13.getSinonimos().add("authorization");
		p13.getSinonimos().add("certification");
		p13.getSinonimos().add("credentials");
		auxList.add(p13);
		
		PalabraClave p14 = new PalabraClave("activity", new ArrayList<String>());
		p14.getSinonimos().add("interest");
		p14.getSinonimos().add("pastime");
		p14.getSinonimos().add("recreation");
		p14.getSinonimos().add("entertainment");
		p14.getSinonimos().add("hobby");
		p14.getSinonimos().add("sport");
		p14.getSinonimos().add("amusement");
		p14.getSinonimos().add("game");
		p14.getSinonimos().add("avocation");
		auxList.add(p14);
		
        
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

	public List<PalabraClave> getMemoriaTrabajo() {
		return memoriaTrabajo;
	}

	public void setMemoriaTrabajo(List<PalabraClave> memoriaTrabajo) {
		this.memoriaTrabajo = memoriaTrabajo;
	}

	public List<Rule> getMemoriaProduccion() {
		return memoriaProduccion;
	}

	public void setMemoriaProduccion(List<Rule> memoriaProduccion) {
		this.memoriaProduccion = memoriaProduccion;
	}

	public List<String> getMemoriaCotejo() {
		return memoriaCotejo;
	}

	public void setMemoriaCotejo(List<String> memoriaCotejo) {
		this.memoriaCotejo = memoriaCotejo;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
	
	public void appendLog(String log) {
		this.log += "\n"+log;
	}
	
	

	
}
