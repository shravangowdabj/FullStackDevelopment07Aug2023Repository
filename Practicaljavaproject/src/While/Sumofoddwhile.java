package While;

public class Sumofoddwhile {

	public static void main(String[] args) {
		int sum=0;
		int i=50;
		while(i<=100)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	

	}

}
