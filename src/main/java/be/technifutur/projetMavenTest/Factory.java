package be.technifutur.projetMavenTest;

import be.technifutur.applicationMVC.ControleurInterface;
import be.technifutur.applicationMVC.MVCFactoryInterface;
import be.technifutur.applicationMVC.VueInterface;

public class Factory  implements MVCFactoryInterface<Model>{
	
	Model model;
	
	public Model getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public ControleurInterface<Model> getControler() {
		// TODO Auto-generated method stub
		return null;
	}

	public VueInterface<Model> getVue() {
		// TODO Auto-generated method stub
		return null;
	}

}
