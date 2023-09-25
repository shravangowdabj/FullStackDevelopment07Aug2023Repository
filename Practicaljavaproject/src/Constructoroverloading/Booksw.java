package Constructoroverloading;
class books {
	String name;
	int book_code;
	String book_auhtor;

	books(String n, int bc) {
		name = n;
		book_code = bc;
		System.out.println("Book Name : " + name);
		System.out.println("Book code : " + book_code);
	}

	books(String ba) {
		book_auhtor = ba;
		System.out.println("Collge Under University : " + book_auhtor);

	}

	books() {

	}

}

public class Booksw {

	public static void main(String[] args) {
		books obj = new books("full stack Development", 2635);
		books obj2 = new books("gowdru");
		

	}

}
