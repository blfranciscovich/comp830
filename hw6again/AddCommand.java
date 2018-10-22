
public class AddCommand implements GameCommandInterface  {

	private String myString;
	private Invoker invoker = new Invoker();

	//public constructor that holds the string passed in
	public AddCommand(String myString) {
		this.myString = myString;
	}

	public void Execute() {
		//Get the list of words

		//List<String> words = words.getList();
		//Add the word into the list

	}

	public void undo() {
		//Get the list of words
		//remove the first instance of the word in the list
	}

	public void redo() {
		//call execute
		invoker.Execute();
	}

}
