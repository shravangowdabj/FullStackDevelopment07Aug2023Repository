package practicedemo;

public class hsdhd {

	public static void main(String[] args) {
		int j=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				int res=j*j;
				System.out.print(res +"  ");
				k++;
				j++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=4);

	}

}
