package practicedemo;

public class p3 {

	public static void main(String[] args) {
		int weekday = Integer.parseInt(args[0]);
		if (weekday==1)
		{
			System.out.println(weekday+"  sunday");
		}
		else if(weekday==2)
		{
			System.out.println(weekday+"  monday");
		}
		else if(weekday==3)
		{
			System.out.println(weekday+"  tuesday");
		}
		else if(weekday==4)
		{
			System.out.println(weekday+"  wednesday");
		}
		else if(weekday==5)
		{
			System.out.println(weekday+"  thrusday");
		}
		else if(weekday==6)
		{
			System.out.println(weekday+"  friday");
		}
		else if(weekday==7)
		{
			System.out.println(weekday+"  saturday");
		}
		else
		{
			System.out.println("bad day");
		}

	}

}
