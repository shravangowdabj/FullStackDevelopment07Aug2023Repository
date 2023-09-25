package Arrayassignment3demo;

public class Squareroot1DArray {

	public static void main(String[] args) {
		int x[]=new int [10];
		int k=0;
		for(int i=10;i>=1;i--)
		{
			int j=(i*i);
			
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length/2;z<x.length;z++)
		{
			System.out.println(x[z]);
		}

	}

}
