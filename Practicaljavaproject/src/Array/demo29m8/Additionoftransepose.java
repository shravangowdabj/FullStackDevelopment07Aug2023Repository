package Array.demo29m8;

public class Additionoftransepose {

	public static void main(String[] args) {
		int x[][]= {{10,20},{40,50}};
		int y[][]= {{1,2},{3,4}};
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			int z[][]=new int[x.length][x[0].length];
			System.out.println("the matrix is:");
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]+y[i][j];
				}
			}
			for(int m=0;m<z.length;m++)
			{
				for(int n=0;n<z[0].length;n++)
				{
					System.out.print(z[m][n]+" ");
				}
				System.out.println();
			}
			System.out.println("the transpose of matrix:");
			
		
		for(int m=0;m<z.length;m++)
		{
			for(int n=0;n<z[0].length;n++)
			{
				System.out.print(z[n][m]+" ");
			}
			System.out.println();

	    }

}

	}

}
