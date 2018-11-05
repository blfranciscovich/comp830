package MidtermCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
	
	private List<CommandInterface> cmdList;
	int index;
	
	public CommandInvoker() {
		cmdList = new ArrayList<>();
		index = -1;
	}
	
	public void setCommandInterface(CommandInterface cmd) {
		cmdList.add(cmd);
		index++;
	}
	
	public void execute() {
		if (index < 0)
			return;
		cmdList.get(index).execute();		
	}
	
	public void undo() {
		if (index < 0)
			return;
		cmdList.get(index).undo();	
		index--;
	}
	
	public void clearCommandList() {
		cmdList.clear();
		index = -1;
	}

}

