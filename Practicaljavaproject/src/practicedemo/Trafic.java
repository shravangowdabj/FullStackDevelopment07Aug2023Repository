package practicedemo;

public class Trafic {

	public static void main(String[] args) {
		String signal=args[0];
		if(signal=="red")
		{
			System.out.println(signal+"  indicates to stop");
		}
		else if(signal=="yellow")
		{
			System.out.println(signal+"  indicates to ready");
		}
		else if(signal=="green")
		{
			System.out.println(signal+"  indicates to fffooo");
		}
		else
		{
			System.out.println("accident");
		}
			

	}

}
