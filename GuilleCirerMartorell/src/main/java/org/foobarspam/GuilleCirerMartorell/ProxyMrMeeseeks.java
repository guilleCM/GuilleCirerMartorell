package org.foobarspam.GuilleCirerMartorell;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	//PROPIEDADES
	private MrMeeseeks mrMeeseeks = null;
	
	//METODOS
	public void pushButton(ArrayList<MrMeeseeks> setMrMe) {
		createMrMeeseeks(setMrMe);
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {
		MrMeeseeks mrMeeseeks = new MrMeeseeks();
		this.mrMeeseeks = mrMeeseeks;
		mrMeeseeks.sayMessageOnCreate();
	}

	public MrMeeseeks getMrMe() {
		return this.mrMeeseeks;
	}
}
