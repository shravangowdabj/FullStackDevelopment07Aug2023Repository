package Whilepattern2;

public class Pattern3 {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
			i--;
		}

	}

}
