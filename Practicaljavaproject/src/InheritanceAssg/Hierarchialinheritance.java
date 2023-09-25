package InheritanceAssg;
class maths3
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication result :"+(x*y));
	}
}
class maths4 extends maths3
{
	void division(int x,int y)
	{
		System.out.println("division result :"+(x/y));
	}
}
class maths5 extends maths3
{
	void addition(int x,int y)
	{
		System.out.println("Addition result :"+(x+y));
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		maths4 o1=new maths4();
		o1.multiplication(125,7);
		o1.division(20,4);
		maths5 o2=new maths5();
		o2.multiplication(23,20);
		o2.addition(122,123);
		
		

	}

}
