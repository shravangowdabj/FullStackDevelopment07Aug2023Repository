package Whilepattern2;

public class Pattern6 {

	public static void main(String[] args) {
		int m=5;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(+m +"  ");
				m=m+5;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
