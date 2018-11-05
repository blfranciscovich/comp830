package MidtermCommand;

public class MoveEast implements CommandInterface {
	
	private int xCoord;
	
	public MoveEast (int xCoord) {
		this.xCoord = xCoord;
	}

	@Override
	public void execute() {
		ListOfxCoord.getInstance().addxCoord(xCoord);
	}
	
	@Override
	public void undo() {
		ListOfxCoord.getInstance().removexCoord(xCoord);

	}
	
	

}
