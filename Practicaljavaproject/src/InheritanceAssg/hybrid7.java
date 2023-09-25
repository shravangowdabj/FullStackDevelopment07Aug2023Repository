package InheritanceAssg;
class a8 {
	String names;
	int rollno;
	int pincode;

	a8(String name, int r, int cc) {
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a82 extends a8 {
	String names;
	int rollno;
	int pincode;

	a82(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a83 extends a82 {
	String names = "";
	int rollno;
	int pincode;

	a83(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a84 extends a8 {
	String names = "";
	int rollno;   
	int pincode;

	a84(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}

public class hybrid7 {

	public static void main(String[] args) {
		a83 obj = new a83("shravan gowda ", 45, 571404);
		a84 obj2 = new a84("chethu", 34, 571404);
	}
}
