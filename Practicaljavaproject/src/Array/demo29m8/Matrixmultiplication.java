package Array.demo29m8;

public class Matrixmultiplication {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{7,4,3}};
		int b[][]= {{9,3},{8,4},{7,6}};
		int mult[][]=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<b[0].length;k++)
				{
					mult[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
        for(int m=0;m<mult.length;m++)
        {
        	for(int n=0;n<mult[m].length;n++)
        	{
        		System.out.print(mult[m][n]+" ");
        	}
        	System.out.println();
        }

}
}
