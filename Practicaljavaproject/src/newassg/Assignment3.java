package newassg;

class Student11
{
	String name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in parent class:"+Studname);
	}
}
class Student22 extends Student11
{
	Student22(String Branchname)
	{
		super.name=Branchname;
		super.showStudname(Branchname);
	}
	String name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in child class:"+Studname);
	}
}
class Student33 extends Student22
{
	Student33(String facultyname)
	{
		super(facultyname);
		super.showStudname(facultyname);	

	}
	String name;
	void showStudname(String facname)
	{
		System.out.println("the student name in child class:"+facname);
	}
}

public class Assignment3  {

	public static void main(String[] args) {
		Student11 obj=new Student33("sagar");
		obj.showStudname("ravi");
		obj.showStudname("prajwal");


	}

}

