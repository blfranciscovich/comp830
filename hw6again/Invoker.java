import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private int index;
	private GameCommandInterface[] cdmList;
	private DeleteCommand delete;
	private AddCommand add;

	public Invoker(){
		//create an empty commands list
		ArrayList<String> cdmList = new ArrayList<String>();
	}

	public ArrayList<GameCommandInterface> setCommand(GameCommandInterface cmdList) {
		//Add the command object to the end of the list of commands
		ArrayList<GameCommandInterface> cdmList = new ArrayList<GameCommandInterface>();
		return cdmList;
	}

	public void Execute() {
		//call the execute() method on the most recently added command object


	}

	public void redo() {
		//call the redo() method on the current command object
	}

	public void undo() {
		//call the undo() method on the current command object
	}
}
