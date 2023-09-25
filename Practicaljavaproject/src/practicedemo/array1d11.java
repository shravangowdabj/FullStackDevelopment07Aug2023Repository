package practicedemo;

public class array1d11 {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=80;i++)
		{
			if(i%2==1)
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
		int x[]=new int[count];
		int k=0;
		for(int j=60;j<=80;j++)
		{
			if(j%2==1)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}
}
		


