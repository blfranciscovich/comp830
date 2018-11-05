package MidtermCommand;

import java.util.ArrayList;
import java.util.List;

public class ListOfxCoord {
	
	private static ListOfxCoord INSTANCE;
	private List<Integer> listOfxCoord;

	
	private ListOfxCoord() {
		listOfxCoord = new ArrayList<>();
	}
	
	public static ListOfxCoord getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ListOfxCoord();
		return INSTANCE;
	}
	
	public void addxCoord(int xCoord) {
		listOfxCoord.add(xCoord);
	}
	
	public void removexCoord(int xCoord) {
		listOfxCoord.remove(xCoord);
	}
	
	public void clearList() { 
		listOfxCoord.clear();
	}
}