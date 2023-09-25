package newassg;
class goa {
	String shravan;

	void show() {
		System.out.println("The Parent class:" +shravan );
	}
}

class apple extends goa {
	String shravan;

	apple(String s1, String s2) {
		super.shravan = s1;
		this.shravan = s2;
	}

	void show2() {
		System.out.println("The sub class:" + shravan);
	}

}

class orange extends apple {
	String shravan;

	orange(String s1, String s2, String s3) {
		super(s1, s2);
		this.shravan = s3;
	}

	void show3() {
		System.out.println("The Second sub class:" + shravan);
	}

}


public class Assg2 {

	public static void main(String[] args) {
		orange o = new orange("Goa", "Orange", "Apple");
		o.show();
		o.show2();
		o.show3();

	}

}
