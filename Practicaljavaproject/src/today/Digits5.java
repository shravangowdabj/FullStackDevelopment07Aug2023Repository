package today;

public class Digits5 {

	public static void main(String[] args) {
		

			digits obj = new digits(675376457);
		}

	}

	class digits
	{
		int d = 0;
		int c=0;
		digits(int n)
		{
			d = n;
			while(d>0)
			{
				c++;
				d = d/10;
				
			}
			System.out.println("No of Digits : " +c);
		

	}

}
