package MidtermCommand;

public class MoveNorth implements CommandInterface {
	
	private int yCoord;
	
	public MoveNorth (int yCoord) {
		this.yCoord = yCoord;
	}

	
	@Override
	public void execute() {
		ListOfyCoord.getInstance().addyCoord(yCoord);
	}
	
	@Override
	public void undo() {
		ListOfyCoord.getInstance().removeyCoord(yCoord);

	}

}