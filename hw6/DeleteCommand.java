import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class DeleteCommand implements GameCommandInterface{

	private String myString;
	private Invoker invoker = new Invoker();


	public DeleteCommand(String myString) {
		//Public constructor that holds the string passed in
		this.myString = myString;
	}

	public void Execute() {
		//Get the list of words
		//List<String> words = ListofWords.getInstance();
		//ArrayList words = Object.method2();
		//ListofWords.words.getList();

		//Add the word into the list
		//words.add(myString);
	}

	public void undo() {
		//Get the list of words

		//remove the first instance of the word in the list
		//words.pop("myString");
	}

	public void redo() {
		//call execute
		invoker.Execute();
	}

}
