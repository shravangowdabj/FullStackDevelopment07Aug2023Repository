package Array.demo29m8;

public class Array1Dto2D {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int b[][]=new int[3][2];
		int k=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=a[k];
				k++;
				
			}
		}
		for(int z=0;z<b.length;z++)
		{
	         for(int x=0;x<b[z].length;x++)
	         {
	        	 System.out.print(b[z][x]+" ");
	         }
	         System.out.println();
		}

	}

}
