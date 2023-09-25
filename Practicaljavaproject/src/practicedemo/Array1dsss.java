package practicedemo;

public class Array1dsss {

	public static void main(String[] args) {
		int count =0;
		int i=100;
		do
		{
			if(i%4==0)
			{
				count=count+1;
			}
			i--;
			
		}while(i>=50);
		System.out.println(count);
		int x[]=new int[count];
		int k=0;
		int j=100;
		do
		{
			if(j%4==0)
			{
				x[k]=j;
				k++;
			}j--;
		
		}
		while(j>=50);
		int z=x.length/2;
		do
		{
			System.out.println(x[z]);
			z++;
		}while(z<x.length);
		
		

	}

}
