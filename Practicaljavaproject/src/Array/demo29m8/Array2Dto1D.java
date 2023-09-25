package Array.demo29m8;

public class Array2Dto1D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int b[]=new int[a.length*a[0].length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		
		}
		for(int z=0;z<b.length;z++)
		{
			System.out.print(b[z]+" ");
		}

	}

}
