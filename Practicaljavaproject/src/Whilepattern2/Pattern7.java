package Whilepattern2;

public class Pattern7 {

	public static void main(String[] args) {
		int m=1;
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				int res=m*m;
				System.out.print(+res+"  ");
				k++;
				m++;
			}System.out.println();
			i++;
			
		}

	}

}
