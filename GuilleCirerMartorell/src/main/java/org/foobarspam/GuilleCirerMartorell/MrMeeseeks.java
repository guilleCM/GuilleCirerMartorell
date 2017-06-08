package org.foobarspam.GuilleCirerMartorell;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {
	//PROPIEDADES
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private String[] messageOnRequest = {"Oooh yea! Can do!",
										 "Yes sireee!",
										 "Oh, yeah! Yes, ma'am!"};
	//CONSTRUCTOR
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	//METODOS
	public Integer getId() {
		return this.id;
	}
	

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */
}
