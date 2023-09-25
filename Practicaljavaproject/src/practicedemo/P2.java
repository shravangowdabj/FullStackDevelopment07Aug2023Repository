package practicedemo;

public class P2 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		if(x>y&&x>z)
		{
			System.out.println(x+"is a largest number");
		}
		else if(y>z&&y>x)
		{
			System.out.println(y+"is a largest number");
		}
		else if(z>x&&z>y)
		{
			System.out.println(z+"is a largest number");
		}
		else
		{
			System.out.println("invalid rec");
		}

	}

}
