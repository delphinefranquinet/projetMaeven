package be.technifutur.projetMavenTest;

import be.technifutur.applicationMVC.ControleurInterface;

public class Vue implements ControleurInterface<Model>{
	
	public Model model;

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public boolean isFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public void newInput(String input) {
		
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public boolean hasLastScreen() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	

}
