package Dopattern2;

public class Pattern5 {

	public static void main(String[] args) {
		int m=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
			System.out.print(m++ +"  ");
			k++;
			}while(k<=i);
			System.out.println();
			i++;
			
		}while(i<=5);

	}

}
