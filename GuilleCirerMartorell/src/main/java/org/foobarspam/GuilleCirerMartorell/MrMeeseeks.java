package org.foobarspam.GuilleCirerMartorell;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {
	//PROPIEDADES
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = {"Oooh yea! Can do!",
										 "Yes sireee!",
										 "Oh, yeah! Yes, ma'am!"};
	private String messageOnDone = "All done";
	private String messageOnExplode = "Pooooof";
	
	//CONSTRUCTOR
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	//METODOS
	public Integer getId() {
		return this.id;
	}
	
	public void sayMessageOnCreate() {
		System.out.println("I'm Mr Meeseeks "+getId()+". Look at meeee!");
	}
	
	private String generateMessageOnRequest() {
		Integer posicionAleatoria = ThreadLocalRandom.current().nextInt(3);
		return this.messageOnRequest[posicionAleatoria];
	}
	
	public String doRequest(String verbo, String objeto) {
		return verbo+" "+objeto;
	}
	
	public void sayMessageOnDone() {
		System.out.println(this.messageOnDone);
	}
	
	public void formulateRequest(String verbo, String objeto) {
		System.out.println(generateMessageOnRequest());
		System.out.println(doRequest(verbo, objeto));
		sayMessageOnDone();
	}
	
	public void stopExisting() {
		System.out.println(this.messageOnExplode+" "+getId());
	}
	
	
	
	

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */
}
