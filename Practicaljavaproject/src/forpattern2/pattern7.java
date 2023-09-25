package forpattern2;

public class pattern7 {

	public static void main(String[] args) {
		int m=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				int res=m*m;
				System.out.print(+res+"  ");
				m++;
			}
			System.out.println();
		}

	}

}
