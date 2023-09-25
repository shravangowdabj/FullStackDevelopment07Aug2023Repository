package Array.demo29m8;

public class Matrixsubdemo {

	public static void main(String[] args) {
		int x[][]= {{1,2},{3,4}};
		int y[][]= {{10,20},{30,40}};
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res=y[i][j]-x[i][j];
					System.out.print(res+"  ");
				}
				System.out.println();
			}
		}

	}

}
