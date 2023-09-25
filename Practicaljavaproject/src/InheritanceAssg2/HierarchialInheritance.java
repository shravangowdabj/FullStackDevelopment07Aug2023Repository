package InheritanceAssg2;
class student11 {
	student11() {
		System.out.println("Super Class");
	}
}

class class21 extends student11 {
	class21() {
		System.out.println("Child Class : First");
	}
}

class library3 extends class21 {
	library3() {
		System.out.println("Child Class : Second");
	}
}

class teacher4 extends class21 {
	teacher4() {
		System.out.println("Child Class : Third");
	}
}

class staff5 extends class21 {
	staff5() {
		System.out.println("Child Class : Fourth");
	}
}

class workers6 extends class21 {
	workers6() {
		System.out.println("Child Class : Fifth");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		class21 o = new class21();
		library3 o1 = new library3();
		teacher4 o2 = new teacher4();
		staff5 o3 = new staff5();
		workers6 o4 = new workers6();

	}
}
