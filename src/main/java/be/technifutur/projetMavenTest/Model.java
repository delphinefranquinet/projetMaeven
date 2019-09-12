package be.technifutur.projetMavenTest;

import java.util.HashMap;
import java.util.Map;

public class Model {

	private final int mapSize = 10;
	private Map<String, String> map = new HashMap<String, String>();
	private int actualSize = 0;
	
	
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public int getMapSize() {
		return mapSize;
	}
	
	public void ajouter(String key, String value) {
		
		if (!map.containsKey(key) && (actualSize < mapSize)) {
			map.put(key, value);
			actualSize = actualSize + 1;
		}else if (map.containsKey(key) && (actualSize < mapSize)){
			map.replace(key, value);
		}else {
			System.out.println("Impossible d'ajouter car la map est pleine");
		}
			
	}
	
	public void retirer (String key, String valeur) {
		
		if(map.containsKey(key)) {
			map.remove(key);
			actualSize = actualSize -1;
		}else {
			System.out.println("la clé n'existe pas dans la map");
		}
		
		
	}
	public int getActualSize() {
		return actualSize;
	}
	public void setActualSize(int actualSize) {
		this.actualSize = actualSize;
	}
	
	
	
}
