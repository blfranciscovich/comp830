package MidtermCommand;

public class MoveSouth implements CommandInterface {
	
	private int yCoord;
	
	public MoveSouth (int yCoord) {
		this.yCoord = yCoord;
	}

	@Override
	public void undo() {
		ListOfyCoord.getInstance().removeyCoord(yCoord);

	}
	
	@Override
	public void execute() {
		ListOfyCoord.getInstance().addyCoord(yCoord);
	}
	
	

}
