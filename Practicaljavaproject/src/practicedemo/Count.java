package practicedemo;

public class Count {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=250;i<=500;i++)
		{
			if(i%10==0)
			{
				count=count+1;
			}
			i++;
		}
		System.out.println(count);

	}

}
