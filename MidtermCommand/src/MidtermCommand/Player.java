package MidtermCommand;


public class Player {
	private static Player instance; 
	private int xCoord = 0;
	private int yCoord = 0;

	
	Player(){
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	 public static Player getInstance() {
		 if(instance == null) {
			 instance = new Player();
		 }
		 return instance;
	 }
}