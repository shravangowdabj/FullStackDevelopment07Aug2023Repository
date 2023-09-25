package DoWhile;

public class Sumofsquare {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		do
		{
			int square=i*i;
			sum=sum+square;
			i--;
		}
		while(i>=1);
		System.out.println(sum);

	}

}
