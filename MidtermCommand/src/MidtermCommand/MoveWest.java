package MidtermCommand;

public class MoveWest implements CommandInterface {
	
	private int xCoord;
	
	public MoveWest (int xCoord) {
		this.xCoord = xCoord;
	}

	@Override
	public void undo() {
		ListOfxCoord.getInstance().removexCoord(xCoord);

	}
	
	@Override
	public void execute() {
		ListOfxCoord.getInstance().addxCoord(xCoord);
	}

}
