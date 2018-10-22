import java.util.Scanner;

public class RunHW6 {

	public static void main(String[] args)
	{
		AddCommand a1;
		DeleteCommand d1;
		String word = "";
		//Create an invoker object
		Invoker invoker = new Invoker();

		Scanner in = new Scanner(System.in);

		//get the user input
	     word = in.nextLine();

		//print "Command: "
	     System.out.println("Command:");

		//Until the user types "quit", loop:
		if (word != "quit") {

			//if the user typed a command that is not recognized, print "Command not recognized"
			if (word != "add" && word != "delete" && word != "undo" && word != "redo") {
				System.out.println("Command not recognized");
			}

		    else if (word == "add") {
				//create an AddCommand object. Pass in the string to be added to the list.
		    	a1 = new AddCommand("Test1");
				//call invoker.setCommand(Command object);
		    	invoker.setCommand(a1);
				// call invoker.execute();
		    	invoker.Execute();
			}

			else if (word == "delete") {
				//create the DeleteCommand object. pass in the Word to be deleted.
				d1 = new DeleteCommand("Test1");
				//call invoker.setCommand(Command object);
				invoker.setCommand(d1);
				//call invoker.execute();
				invoker.Execute();
			}

			else if (word == "undo"){
				invoker.undo();
			}

			else if (word == "redo") {
				invoker.redo();
			}

			else if (word == "quit") {
				System.out.close();
			}
		}
	}
}
