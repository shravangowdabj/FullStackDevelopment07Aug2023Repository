package While;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int i=1;
		int number=Integer.parseInt(args[0]);
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+number+"is:"+fact);

	}

}
