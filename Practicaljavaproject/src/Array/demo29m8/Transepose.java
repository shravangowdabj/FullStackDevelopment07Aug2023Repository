package Array.demo29m8;

public class Transepose {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("The matrix:");
		for(int i=0;i<a.length;i++)
		{
		 for(int j=0;j<a.length;j++)
		 {
			 
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
		}
		System.out.println("The transpose of matrix:");
		for(int i=0;i<a.length;i++)
		{
		 for(int j=0;j<a.length;j++)
		 {
			 
			 System.out.print(a[j][i]+" ");
		 }
		 System.out.println();
	}

	}

}
