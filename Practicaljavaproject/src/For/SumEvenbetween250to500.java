package For;

public class SumEvenbetween250to500 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=250;i<=500;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);

	}

}
