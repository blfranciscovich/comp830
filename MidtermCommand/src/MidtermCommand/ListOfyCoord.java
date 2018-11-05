package MidtermCommand;

import java.util.ArrayList;
import java.util.List;

public class ListOfyCoord {
	
	private static ListOfyCoord INSTANCE;
	private List<Integer> listOfyCoord;

	
	private ListOfyCoord() {
		listOfyCoord = new ArrayList<>();
	}
	
	public static ListOfyCoord getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ListOfyCoord();
		return INSTANCE;
	}
	
	public void addyCoord(int yCoord) {
		listOfyCoord.add(yCoord);
	}
	
	public void removeyCoord(int yCoord) {
		listOfyCoord.remove(yCoord);
	}
	
	public void clearList() { 
		listOfyCoord.clear();
	}
}
