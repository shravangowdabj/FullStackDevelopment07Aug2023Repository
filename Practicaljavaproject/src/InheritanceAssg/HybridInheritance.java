package InheritanceAssg;
class maths6
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication result :"+(x*y));
	}
}
class maths7 extends maths6
{
	void division(int x,int y)
	{
		System.out.println("division result :"+(x/y));
	}
}
class maths8 extends maths7
{
	void addition(int x,int y)
	{
		System.out.println("Addition result :"+(x+y));
	}
	
}
class maths9 extends maths6
{
	void substraction(int x,int y)
	{
		System.out.println("substraction result :"+(x-y));
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		maths8 o1=new maths8();
		o1.addition(5, 5);
		o1.division(8,8);
		o1.multiplication(8, 5);
		maths9 o2=new maths9();
		o2.substraction(10, 9);
		o2.multiplication(9, 9);
		
		
		
		
		
		
		
		

	}

}
