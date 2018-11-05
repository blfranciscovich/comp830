package MidtermCommand;

import java.util.ArrayList;
import java.util.List;

public class List {

	private static List INSTANCE;
	private List<String> list;
	
	private List() {
		list = new ArrayList<>();
	}
	
	public static List getInstance() {
		if (INSTANCE == null)
			INSTANCE = new List();
		return INSTANCE;
	}
	
	public void addWord(String word) {
		list.add(word);
	}
	
	public void removeWord(String word) {
		list.remove(word);
	}
	
	public void clearList() { 
		list.clear();
	}
	
	public String toString() {
		return list.toString();
	}
	
}