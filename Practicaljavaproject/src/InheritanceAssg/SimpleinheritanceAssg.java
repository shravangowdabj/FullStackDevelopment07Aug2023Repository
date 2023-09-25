package InheritanceAssg;
class maths1
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication result :"+(x*y));
	}
}
class maths2 extends maths1
{
	void division(int x,int y)
	{
		System.out.println("division result :"+(x/y));
	}
}

public class SimpleinheritanceAssg {

	public static void main(String[] args) {
		maths2 o1=new maths2();
		o1.division(20,4);
		o1.multiplication(25,5);
		

	}

}
