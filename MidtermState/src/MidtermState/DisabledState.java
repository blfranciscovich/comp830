package MidtermState;
public class DisabledState implements State {
	
	   public void doAction(Context context) {
		      System.out.println("Player is in Disabled state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Disabled State";
		   }

}
