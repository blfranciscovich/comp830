package MidtermState;

import java.util.Scanner;

public class MidtermState {

	public static void main(String[] args) {
			Context context = new Context();
			int health = 0;
			// unknown state
			boolean us = true;
			// ready state
			boolean rs = false;
			//disabled state
			boolean ds = false;
			//down state
			boolean dns = false;
			
			Scanner scanner = new Scanner(System.in);
			boolean quit = false;
			
			UnknownState unknownState = new UnknownState();
		      unknownState.doAction(context);
			
			while (!quit) {
				System.out.print("Command: ");
				String word = scanner.nextLine();
				String[] words = word.split(" ");
				
				switch(words[0]) {
				case "check":
					if (us == true) {
						ReadyState readyState = new ReadyState();
					      readyState.doAction(context);
		
					      System.out.println(context.getState().toString());
					      
					      rs = true;
					      us = false;
					      break;
					} else if (rs == true && health == 0) {
						ReadyState readyState = new ReadyState();
					      readyState.doAction(context);
		
					      System.out.println(context.getState().toString());
					      
					      health = health + 1;
					      break;
					} else if (rs == true && health == 1) {
						DownState downState = new DownState();
			    	      downState.doAction(context);

			    	      System.out.println(context.getState().toString());
			    	      health = health + 1;
			    	      rs = false;
			    	      ds = true;
			    	      break;
					} else if (health > 1) {
						UnknownState unknownState2 = new UnknownState();
					      unknownState.doAction(context);

					      System.out.println(context.getState().toString());
					      us = true;
					      rs = false;
					      ds = false;
					      dns = false;
					      break;
					} else {
						System.out.println("Command not avaiable in this state");
						System.out.println(context.getState().toString());
					}
				
			case "enable":
				if (ds = true) {
					UnknownState unknownState2 = new UnknownState();
				      unknownState.doAction(context);

				      System.out.println(context.getState().toString());
				      ds = false;
				      us = true;
				      break;
				}else {
					System.out.println("Command not avaiable in this state");
					System.out.println(context.getState().toString());
				}
				
			case "disable":
				if (ds = true) {
					ReadyState readyState = new ReadyState();
					readyState.doAction(context);

				      System.out.println(context.getState().toString());
				      ds = false;
				      rs = true;
				      break;
				} else {
					System.out.println("Command not avaiable in this state");
					System.out.println(context.getState().toString());
				}
			case "quit":
				quit = true;
				break;
			default:
				System.out.println("Command not recognised");
				
				}		
		}
		scanner.close();
		
	}
}
