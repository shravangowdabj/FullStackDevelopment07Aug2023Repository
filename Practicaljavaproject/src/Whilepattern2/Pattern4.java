package Whilepattern2;

public class Pattern4 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(i+"  ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
