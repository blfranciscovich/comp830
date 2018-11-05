package MidtermCommand;

import java.util.Random;
import java.util.Scanner;

public class MidtermCommand {

	public static void main(String[] args) {
		
		CommandInvoker invoker = new CommandInvoker();
		int count = 0;
		
		//Scanner scanner = new Scanner(System.in);
		//boolean quit = false;
		while (count < 50) {
			
			//System.out.print("Command: ");
			//String input = scanner.nextLine();
			
			Random rand = new Random(); 
			int value = rand.nextInt(3);
			value += 1;
			
			Integer[] coords = value();
			
			switch(coords[0]) {
				case 1:
					MoveNorth north = new MoveNorth(coords[1]);
					invoker.setCommandInterface(north);
					invoker.execute();
					count +=1;
					System.out.println("y coordinates: " + ListOfyCoord.getInstance().toString());
					System.out.println("x coordinates: " + ListOfxCoord.getInstance().toString());
					break;
				case 2:
					MoveEast east = new MoveEast(coords[1]);
					invoker.setCommandInterface(east);
					invoker.execute();
					count +=1;
					System.out.println("y coordinates: " + ListOfyCoord.getInstance().toString());
					System.out.println("x coordinates: " + ListOfxCoord.getInstance().toString());
					break;
				case 3:
					MoveSouth south = new MoveSouth(coords[1]);
					invoker.setCommandInterface(south);
					invoker.execute();
					count +=1;
					System.out.println("y coordinates: " + ListOfyCoord.getInstance().toString());
					System.out.println("x coordinates: " + ListOfxCoord.getInstance().toString());
					break;
				case 4:
					MoveWest west = new MoveWest(coords[1]);
					invoker.setCommandInterface(west);
					invoker.execute();
					count +=1;
					System.out.println("y coordinates: " + ListOfyCoord.getInstance().toString());
					System.out.println("x coordinates: " + ListOfxCoord.getInstance().toString());
					break;
				default:
					System.out.println("Error occured");
					
					
			}
			
		}
	}

	private static Integer[] value() {
		// TODO Auto-generated method stub
		return null;
	}
}
