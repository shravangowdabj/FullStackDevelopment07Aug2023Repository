package Arrayassignment3demo;

public class Array15thTAble1DArray {

	public static void main(String[] args) {
		
		//System.out.println("# of elements" +count);
		int x[]=new int[10];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			if(j%8==0)
			{
				x[k]=8*j;
				k++;
			}
		}
		for(int z=0;z<x.length/2;z++)
		{
			System.out.println(x[z]);
		}

	}

}
