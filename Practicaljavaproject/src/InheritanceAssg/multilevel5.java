package InheritanceAssg;
class A11 {
	A11(String name) {
		System.out.println("Super Class name : " + name);
	}
}

class A12 extends A11{
	A12(String name) {
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class A13 extends A12 {
	A13(String name) {
		super(name);
		System.out.println("Child Class of child class 1 ");
	}
}
class A14 extends A13 {
	A14(String name) {
		super(name);
		System.out.println("Child Class of child class 2 ");
	}
}

public class multilevel5 {

	public static void main(String[] args) {
		A14 obj = new A14("shravan gowda");
		

	}

}
