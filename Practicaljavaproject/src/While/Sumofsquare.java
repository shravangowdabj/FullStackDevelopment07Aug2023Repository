package While;

public class Sumofsquare {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		while(i>=1)
		{
			int square=i*i;
			sum=sum+square;
			i--;
		}
		System.out.println(sum);

	}

}
