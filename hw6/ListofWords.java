import java.util.ArrayList;
import java.util.List;

public class ListofWords {
	//has to be a singleton

	// Data member: List<String> words;
	private List<String> words = new ArrayList<String>();
	private ListofWords instance;

	private ListofWords(List<String> words) {
		//creates a new empty list of words
		words = new ArrayList<String>();
	}

	public ListofWords getInstance() {
		return instance;
	}

	public void addWord(String instance) {
		//adds the word to the words data member
		words.add(instance);
	}

	public void removeWord(String instance) {
		//remove the first occurrence of the word from the words data member
		words.remove(instance);
	}

	public String toString() {
		//Prints of the contents of the words data member
		String listString = String.join(", ", words);
		return listString;
	}

}
