package FreshWorks_Babu_10Feb;

public class MultiThreadingUsingRunanable implements Runnable
{
	public void run()
	{
		try
		{

			System.out.println( " THread from MultiThreading" +Thread.currentThread().getId() + " is running ");

		} catch( Exception e )
		{
			System.out.println( " Exception Caught ");
		}
	}
}
