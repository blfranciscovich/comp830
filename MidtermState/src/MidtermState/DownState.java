package MidtermState;
public class DownState implements State {

	   public void doAction(Context context) {
		      System.out.println("Player is in down state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Down State";
		   }
}
