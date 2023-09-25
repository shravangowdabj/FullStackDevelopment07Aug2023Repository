package Constructoroverloading;
class Student {
	String name;
	int Student_Id;
	String Student_Branch;

	Student(String n, int id) {
		name = n;
		Student_Id = id;
		System.out.println("Order Name : " + name);
		System.out.println("Order code : " + Student_Id);
	}

	Student() {

	}

	Student(String sb) {
		Student_Branch = sb;
		System.out.println("Order_Price : " + Student_Branch);

	}

}

public class Studenta {

	public static void main(String[] args) {
		Student obj = new Student("shravan", 6282645);
		Student obj2 = new Student("BE");
		
		

	}

}
