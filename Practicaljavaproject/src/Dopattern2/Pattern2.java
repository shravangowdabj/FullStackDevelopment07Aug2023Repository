package Dopattern2;

public class Pattern2 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=5;
			do
			{
				System.out.print(5+"  ");
				k--;
			}while(k>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
