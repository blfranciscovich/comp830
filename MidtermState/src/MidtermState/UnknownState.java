package MidtermState;
public class UnknownState implements State {

	   public void doAction(Context context) {
		      System.out.println("Player is in unknown state");
		      context.setState(this);
		      
		      
		   }

		   public String toString(){
		      return "Unknown State";
		   }

}