package InheritanceAssg;
class maths13
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication result :"+(x*y));
	}
}
class maths14 extends maths13
{
	void division(int x,int y)
	{
		System.out.println("division result :"+(x/y));
	}
}
class maths15 extends maths14
{
	void addition(int x,int y)
	{
		System.out.println("Addition result :"+(x+y));
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		maths15 o5=new maths15();
		o5.multiplication(5,7);
		o5.division(25,5);
		o5.addition(76,76);
		

	}

}
