package DoWhile;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int i=1;
		int number=Integer.parseInt(args[0]);
		do
		{
			fact=fact*i;
			i++;
		}
		while(i<=number);
		System.out.println("factorial of "+number+"is:"+fact);
		

	}

}
