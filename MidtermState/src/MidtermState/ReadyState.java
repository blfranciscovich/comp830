package MidtermState;
public class ReadyState implements State {

	   public void doAction(Context context) {
		      System.out.println("Player is in ready state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Ready State";
		   }

}