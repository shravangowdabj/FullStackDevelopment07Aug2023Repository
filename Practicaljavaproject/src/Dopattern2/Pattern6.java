package Dopattern2;

public class Pattern6 {

	public static void main(String[] args) {
		int m=5;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(+m +"  ");
				m=m+5;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);
		

	}

}
