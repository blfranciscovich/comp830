//import java.awt.List;
import java.util.*;

import hw4.runhomework4.SubscriberOdds;

public class PublisherImplementation implements Observer
{
	private ArrayList<Observer> observer;
	private Object subscribers;
	private int e;

	public PublisherImplementation()
	{
		observer = new ArrayList<Observer>();
	}


	@Override
	public void notifyObserver(Event e)
	{
		for (Observer sub : subscribers)
			sub.notifyObserver(e);

	}

	private Event generateEvent()
	{
		return new Event();

	}

	public void runSimulation()
	{
		int odds = 0;
		int threes = 0;
		for (int i = 1; i <= 200; i++)
		{
			Event e = new Event(i, new Random().nextInt(5000) + 1);
			notifyObserver(e);
			for (Observer sub : subscribers)
			{
				boolean istrue = sub.notifyObserver(int e);;
				if (sub instanceof SubscriberOdds && istrue)
				{
					odds = odds + 1;
					if (odds > 20)
					{
						removeObserver(sub);
					}
					else if (sub instanceof SubscriberThrees)
					{
						threes = threes + 1;
						if (threes > 6)
						{
							removeObserver(sub);
						}
					}
				}
				if (i % 40 == 0 && i / 40 > 0 && i / 40 < 6)
				{
					registerObserver(sub);
				}
			}
		}
		@Override
		public void removeObserver(Observer o)
		{
			subscribers.remove(o);
		}
		@Override
		public void registerObserver(Observer o)
		{
			subscribers.add(o);
		}
		@Override
		public void notifyObservers(Observer o)
		{
			o.notifyObserver(generateEvent());
		}
	}


}
