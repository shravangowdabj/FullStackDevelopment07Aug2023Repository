package Dopattern2;

public class Pattern8 {

	public static void main(String[] args) {
		int m=15;
		int i=5;
		do
		{
			int k=1;
			do
			{   
				System.out.print(+m+"  ");
				m--;
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
