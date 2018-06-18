package productionsystem;

import java.util.ArrayList;
import java.util.List;

import domain.PalabraClave;
import domain.Rule;

public class ProductionSystem {
	
	List<PalabraClave> memoriaTrabajo;
	List<Rule> memoriaProduccion;
	List<PalabraClave> memoriaCotejo; //Esto es una memoria temporal
	String log; //Esto es el log que se va a ir mostrando en la interfaz
	
	//Constructor
	public ProductionSystem() {
		super();
		InitClass();
	}

	public void InitClass() {
		this.memoriaCotejo = new ArrayList<PalabraClave>();
		this.memoriaTrabajo = IniciarMemoriaTrabajo();
		this.memoriaProduccion = IniciarMemoriaProduccion(memoriaTrabajo);
		this.log = "";
		
		/* LINEAS DE TEST
		memoriaCotejo = getListaPalabrasClaves("Esto es una prueba del método what aged collage",memoriaTrabajo);
		System.out.println("/");
		*/

	}

	private static List<PalabraClave> IniciarMemoriaTrabajo() {
		//**TODO Acá hay que crear todos los sinonimos que definamos**/
		
		List<PalabraClave> auxList = new ArrayList<PalabraClave>();
		
		//Las palabras con sinónimos les ponemos nombre pX y van después de este comentario
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

		PalabraClave p8 = new PalabraClave("jewerly", new ArrayList<String>());
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
		
		PalabraClave p15 = new PalabraClave("dad", new ArrayList<String>());
		p15.getSinonimos().add("dad's");
		p15.getSinonimos().add("daddy");
		p15.getSinonimos().add("dad");
		auxList.add(p15);
		
		PalabraClave p16 = new PalabraClave("mom", new ArrayList<String>());
		p16.getSinonimos().add("mom's");
		p16.getSinonimos().add("mom");
		auxList.add(p16);
		
		PalabraClave p17 = new PalabraClave("parents", new ArrayList<String>());
		p17.getSinonimos().add("parents");
		auxList.add(p17);
		
		//Las palabras que se usan para preguntar se definen como ppX y van después de este comentario
		PalabraClave pp1 = new PalabraClave("who", new ArrayList<String>());
		auxList.add(pp1);

		PalabraClave pp2 = new PalabraClave("what", new ArrayList<String>());
		pp2.getSinonimos().add("what's");
		auxList.add(pp2);

		PalabraClave pp3 = new PalabraClave("where", new ArrayList<String>());
		auxList.add(pp3);

		PalabraClave pp4 = new PalabraClave("when", new ArrayList<String>());
		auxList.add(pp4);

		PalabraClave pp5 = new PalabraClave("why", new ArrayList<String>());
		auxList.add(pp5);

		PalabraClave pp6 = new PalabraClave("how", new ArrayList<String>());
		auxList.add(pp6);

		return auxList;
	}

	private static List<Rule> IniciarMemoriaProduccion(List<PalabraClave> memoriaTrabajo) {
		/**TODO Acá hay que  crear todas las reglas que definamos**/
		List<Rule> auxList = new ArrayList<Rule>();
		

		Rule r1 = new Rule(new ArrayList<PalabraClave>(), "", 1);

		/*Esto es para agregar palabras clave a la regla directamente desde la memoria de trabajo
		 * NOTA: Si les tira error acá, es porque ingresaron una PC que no está en la memoria de trabajo*/
		r1.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r1.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		//Esto es para agregar acción de la regla
		r1.setAccion(Rule.ACTION_RULE2);
		auxList.add(r1);
		
		Rule r2 = new Rule(new ArrayList<PalabraClave>(), "", 3);
		r2.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r2.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("money")).findFirst().get());
		r2.setAccion(Rule.ACTION_RULE3);
		auxList.add(r2);
		
		Rule r3 = new Rule(new ArrayList<PalabraClave>(), "", 6);

		r3.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r3.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("bank")).findFirst().get());
		r3.setAccion(Rule.ACTION_RULE4);
		auxList.add(r3);
		
		Rule r4 = new Rule(new ArrayList<PalabraClave>(), "", 2);

		r4.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r4.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("school")).findFirst().get());
		r4.setAccion(Rule.ACTION_RULE3);
		auxList.add(r4);
		
		Rule r5 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r5.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r5.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r5.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("school")).findFirst().get());
		r5.setAccion(Rule.ACTION_RULE4);
		auxList.add(r5);
		
		Rule r6 = new Rule(new ArrayList<PalabraClave>(), "", 6);

		r6.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r6.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r6.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("teacher")).findFirst().get());
		r6.setAccion(Rule.ACTION_RULE4);
		auxList.add(r6);
		
		Rule r7 = new Rule(new ArrayList<PalabraClave>(), "", 7);

		r7.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r7.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r7.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("school")).findFirst().get());
		r7.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("teacher")).findFirst().get());
		r7.setAccion(Rule.ACTION_RULE6);
		auxList.add(r7);
		
		Rule r8 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r8.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r8.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r8.setAccion(Rule.ACTION_RULE4);
		auxList.add(r8);
		
		Rule r9 = new Rule(new ArrayList<PalabraClave>(), "", 3);

		r9.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r9.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r9.setAccion(Rule.ACTION_RULE3);
		auxList.add(r9);
		
		Rule r10 = new Rule(new ArrayList<PalabraClave>(), "", 5);

		r10.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r10.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r10.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r10.setAccion(Rule.ACTION_RULE5);
		auxList.add(r10);
		
		Rule r11 = new Rule(new ArrayList<PalabraClave>(), "", 5);

		r11.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r11.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r11.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r11.setAccion(Rule.ACTION_RULE7);
		auxList.add(r11);
		
		Rule r12 = new Rule(new ArrayList<PalabraClave>(), "", 8);

		r12.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r12.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("jewerly")).findFirst().get());
		r12.setAccion(Rule.ACTION_RULE7);
		auxList.add(r12);
		
		Rule r13 = new Rule(new ArrayList<PalabraClave>(), "", 9);

		r13.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("jewerly")).findFirst().get());
		r13.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("money")).findFirst().get());
		r13.setAccion(Rule.ACTION_RULE8);
		auxList.add(r13);
		
		Rule r14 = new Rule(new ArrayList<PalabraClave>(), "", 10);

		r14.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r14.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("jewerly")).findFirst().get());
		r14.setAccion(Rule.ACTION_RULE6);
		auxList.add(r14);
		
		Rule r15 = new Rule(new ArrayList<PalabraClave>(), "", 6);

		r15.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("job")).findFirst().get());
		r15.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r15.setAccion(Rule.ACTION_RULE3);
		auxList.add(r15);
		
		Rule r16 = new Rule(new ArrayList<PalabraClave>(), "", 7);

		r16.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r16.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("job")).findFirst().get());
		r16.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r16.setAccion(Rule.ACTION_RULE6);
		auxList.add(r16);
		
		
		Rule r17 = new Rule(new ArrayList<PalabraClave>(), "", 5);

		r17.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r17.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("job")).findFirst().get());
		r17.setAccion(Rule.ACTION_RULE6);
		auxList.add(r17);
		
		Rule r18 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r18.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("what")).findFirst().get());
		r18.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("job")).findFirst().get());
		r18.setAccion(Rule.ACTION_RULE6);
		auxList.add(r18);
		
		Rule r19 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r19.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r19.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("money")).findFirst().get());
		r19.setAccion(Rule.ACTION_RULE10);
		auxList.add(r19);
		
		Rule r20 = new Rule(new ArrayList<PalabraClave>(), "", 6);

		r20.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r20.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("jewerly")).findFirst().get());
		r20.setAccion(Rule.ACTION_RULE10);
		auxList.add(r20);
		
		Rule r21 = new Rule(new ArrayList<PalabraClave>(), "", 7);

		r21.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("necklace")).findFirst().get());
		r21.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("jewerly")).findFirst().get());
		r21.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("money")).findFirst().get());
		r21.setAccion(Rule.ACTION_RULE8);
		auxList.add(r21);
		
		Rule r22 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r22.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("where")).findFirst().get());
		r22.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("necklace")).findFirst().get());
		r22.setAccion(Rule.ACTION_RULE7);
		auxList.add(r22);
		
		Rule r23 = new Rule(new ArrayList<PalabraClave>(), "", 5);

		r23.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("activity")).findFirst().get());
		r23.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("job")).findFirst().get());
		r23.setAccion(Rule.ACTION_RULE5);
		auxList.add(r23);
		
		Rule r24 = new Rule(new ArrayList<PalabraClave>(), "", 2);

		r24.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("license")).findFirst().get());
		r24.setAccion(Rule.ACTION_RULE4);
		auxList.add(r24);
		
		Rule r25 = new Rule(new ArrayList<PalabraClave>(), "", 4);

		r25.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r25.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("home")).findFirst().get());
		r25.setAccion(Rule.ACTION_RULE2);
		auxList.add(r25);
		
		Rule r26 = new Rule(new ArrayList<PalabraClave>(), "", 1);

		r26.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("town")).findFirst().get());
		r26.setAccion(Rule.ACTION_RULE2);
		auxList.add(r26);
		
		Rule r27 = new Rule(new ArrayList<PalabraClave>(), "", 4);
		r27.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r27.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("dad")).findFirst().get());
		r27.setAccion(Rule.ACTION_RULE6);
		auxList.add(r27);
		
		Rule r28 = new Rule(new ArrayList<PalabraClave>(), "", 4);
		r28.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r28.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("mom")).findFirst().get());
		r28.setAccion(Rule.ACTION_RULE6);
		auxList.add(r28);
		
		Rule r29 = new Rule(new ArrayList<PalabraClave>(), "", 5);
		r29.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r29.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("dad")).findFirst().get());
		r29.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("mom")).findFirst().get());
		r29.setAccion(Rule.ACTION_RULE7);
		auxList.add(r29);
		
		Rule r30 = new Rule(new ArrayList<PalabraClave>(), "", 5);
		r30.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("activity")).findFirst().get());
		r30.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("school")).findFirst().get());
		r30.setAccion(Rule.ACTION_RULE5);
		auxList.add(r30);
		
		Rule r31 = new Rule(new ArrayList<PalabraClave>(), "", 2);
		r31.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("how")).findFirst().get());
		r31.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("school")).findFirst().get());
		r31.setAccion(Rule.ACTION_RULE2);
		auxList.add(r31);
		
		Rule r32 = new Rule(new ArrayList<PalabraClave>(), "", 2);
		r32.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("parents")).findFirst().get());
		r32.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("necklace")).findFirst().get());
		r32.setAccion(Rule.ACTION_RULE4);
		auxList.add(r32);
		
		Rule r33 = new Rule(new ArrayList<PalabraClave>(), "", 4);
		r33.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("name")).findFirst().get());
		r33.getCondicion().add(memoriaTrabajo.stream().filter(pc -> pc.getPalabraClave().equals("parents")).findFirst().get());
		r33.setAccion(Rule.ACTION_RULE5);
		auxList.add(r33);
		
		return auxList;

	}
	
	/*Este método es que se llama desde la UI, recibe una frase ingresada y las dos memorias.
	 * Retorna un String con una acción que verifique alguna regla*/
	public static String NewQuery(String frase, List<PalabraClave> memoriaTrabajo, List<Rule> memoriaProduccion, int criterioResolucion) {
		frase = FormatFrase(frase);
		List<PalabraClave> nuevasPalabrasClaves = getListaPalabrasClaves(frase.toLowerCase(), memoriaTrabajo); //Esto es una lista de PC de la frase

		return InferenceEngine.Resolve(nuevasPalabrasClaves, memoriaProduccion, criterioResolucion);
	}
	
	/*Esto método es para limpiar la frase para que solo queren palabras, es decir,
	 * elimina signos, acentos, etc*/
	private static String FormatFrase(String frase) {
		
		frase = frase.replace("?", "");
		frase = frase.replace("¿", "");
		frase = frase.replace("!", "");
		frase = frase.replace("¡", "");
		frase = frase.replace("á", "a");
		frase = frase.replace("é", "e");
		frase = frase.replace("í", "i");
		frase = frase.replace("ó", "o");
		frase = frase.replace("ó", "u");
		frase = frase.toLowerCase(); //Esto pasa todo a minuscula
		
		return frase;

	}

	private static List<PalabraClave> getListaPalabrasClaves(String frase, List<PalabraClave> memoriaTrabajo)
	{
		String[] palabras = frase.split("\\s+");		
		List<PalabraClave> listaAux = new ArrayList<PalabraClave>();

		/*Esto recorre cada palabra de la frase y:
		 * si coincide con alguna palabra clave, lo agrega a la lista,
		 * si no coincide, busca en los sinonimos, si coincide con algun sinonimo, agrega
		 * si no, deja pasar la palabra sin hacer nada*/
		for (int i = 0; i < palabras.length; i++) {
			String palabraAux = palabras[i];
			PalabraClave newPalabraClave = InferenceEngine.GetPalabraClave(palabraAux, memoriaTrabajo);
			if(newPalabraClave != null)
			{
				listaAux.add(newPalabraClave);
			}
		}
			
		return listaAux;
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

	public List<PalabraClave> getMemoriaCotejo() {
		return memoriaCotejo;
	}

	public void setMemoriaCotejo(List<PalabraClave> memoriaCotejo) {
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
