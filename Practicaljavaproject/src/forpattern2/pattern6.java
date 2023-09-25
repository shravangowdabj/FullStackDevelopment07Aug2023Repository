package forpattern2;

public class pattern6 {

	public static void main(String[] args) {
		int m=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(+m + "  ");
				m=m+5;
			}
			System.out.println();
		}

	}

}
