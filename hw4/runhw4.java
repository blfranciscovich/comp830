package hw4;
//import java.awt.List;
import java.util.*;


public class runhomework4 {
/// Attributes
	private static PublisherImplementation pub;
	private int Event;

	public class SubscriberOdds implements Observer
	{
		@Override
		public void notifyObserver (int Event)
		{
			if (Event.getEventData() % 2 != 0)
			{
				System.out.println("Event " + e.getEventNumber() + " is odd: " + e.getEventData());
				Observer.notifyObserver;
			}

		}
	}
	public class SubscriberEvens implements Observer
	{
		@Override
		public void notifyObserver(int Event)
		{
			if (Event.getEventNumber() % 2 == 0)
			{
				System.out.println("Event " + Event.getEventNumber() + " is even: " + Event.getEventData());
			}

		}
	}

	public class SubscriberThrees implements Observer
	{
		public class SubscriberThrees implements Observer
		{
			@Override
			public boolean notifyObserver(Event e)
			{
				// TODO Auto-generated method stub
				if (e.getEventData() % 3 == 0)
				{
					System.out.println("Event " + e.getEventNumber() + " is divisible by 3: " + e.getEventData());
				}

			}
	// implements the Observer Interface
		}
	}

/// main for testing
	public static void main(String[] args)
	{
		pub = new PublisherImplementation();

		SubscriberOdds odds = new SubscriberOdds();
		SubscriberEvens evens = new SubscriberEvens();
		SubscriberThrees threes = new SubscriberThrees();

		pub.registerObserver(odds);
		pub.registerObserver(evens);
		pub.registerObserver(threes);
		pub.runSimulation();
	}
}
