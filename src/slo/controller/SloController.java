package slo.controller;

import slo.view.SloPopups;

public class SloController
{
	private SloPopups myPopups;
	
	
	public SloController()
	{
		myPopups = new SloPopups();
	}
	
	public void start()
	{
		int n;
		
	//	myPopups.showResponse("N is equal to ten");
			
		for(n=9; n<10; n++)
		{
			myPopups.showResponse("N is nine now");
			if(n==10.5)
			{
				myPopups.showResponse("This will not be shown");
			}
			else if(n==10)
			{
				myPopups.showResponse("NONONONO");
			}
			else
			{
				myPopups.showResponse("We don't know what N is...");
			}
		}
		
		myPopups.showResponse("Lets try testing q next!");
		
		double q;
		
		for(q=12.5; q<=14.5; q++)
		{
			if(q==12.5)
			{
				myPopups.showResponse("q is 12.5");
			}
			else if(q==13.5) 
			{	
				myPopups.showResponse("q is 13.5");
			}
			else if(q==14.5)
			{	
				myPopups.showResponse("We reached the limit");
			}	
			else myPopups.showResponse("Q is greater than or equal to 14.5");
		}
		String Str = new String("Q is still greater than or equal to 14.5");
		myPopups.showResponse(Str.substring(10, 40));
		myPopups.showResponse(Str.substring(10, 40));
		myPopups.showResponse(Str.substring(10, 40));
		myPopups.showResponse(Str.concat("!!!!!!!!!1"));
	
	}
}


