package DoWhile;

public class InbetweenDo250to500 {

	public static void main(String[] args) {
		int count=0;
		int i=250;
		do
		{
			if(i%10==0)
			{
				count=count+1;
			}
			i++;
		}
		while(i<=500);
		System.out.println(count);

	}

}
