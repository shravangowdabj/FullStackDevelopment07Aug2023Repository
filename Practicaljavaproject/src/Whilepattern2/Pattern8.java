package Whilepattern2;

public class Pattern8 {

	public static void main(String[] args) {
		int m=15;
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(+m+"  ");
				m--;
				k++;
			}System.out.println();
			i--;
		}

	}

}
