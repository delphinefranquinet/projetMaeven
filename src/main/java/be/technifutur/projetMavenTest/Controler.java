package be.technifutur.projetMavenTest;

import be.technifutur.applicationMVC.ControleurInterface;

public class Controler implements ControleurInterface<Model>{
	
	public Model model;

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public boolean isFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public void newInput(String input) {
		
        String key = "", value = "";
        String[] temp = input.split(",");
        key = temp[0].substring(1);
        value = temp[1];
        
        if ('+' == input.charAt(0)) {
            model.ajouter(key, value);
        } else if ('-' == input.charAt(0)) {
        	model.retirer(key, value);
            
        }
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
