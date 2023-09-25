package Parameter;
class student
{
	String firstname;
	int id;
	int age;
	String gender;
	student(String fname,int eid,int eage,String egender)
	{
		firstname=fname;
		id=eid;
		age=eage;
		gender=egender;

		System.out.println("student name:-  "+firstname);
		System.out.println("student id:-  "+id);
		System.out.println("student age:-  "+age);
		System.out.println("student gender:-  "+gender);
		System.out.println("+++++++++++++++++++++++++");	
	}
}
class library
{
	String lib;
	int lib_id;
	String libhead;
	int libtstrentgh;
	library(String dep,int did,String d_head,int dstrength)
	{
		lib=dep;
		lib_id=did;
		libhead=d_head;
		libtstrentgh=dstrength;
		System.out.println("library name:-  "+lib);
		System.out.println("library id:-  "+lib_id);
		System.out.println("library head:-   "+libhead);
		System.out.println("library strength:-   "+libtstrentgh);
		System.out.println("+++++++++++++++++++++++++");

	}

}
class sports
{
	int sportsid;
	String spotype;
	String spocoach;
	sports(int spo_id,String spo_tye,String coach)
	{
		sportsid=spo_id;
		spotype=spo_tye;
		spocoach=coach;
		System.out.println("sports id:- "+sportsid);
		System.out.println("sports type:-  "+spotype);
		System.out.println("sports coach:- "+spocoach);	
	}

}
public class Assg4t{
	public static void main(String[] args) {


		student e=new student("chethan",9876,22,"male" );

		library d=new library("civil lib",87654,"sagar",76);

		sports ins=new sports(8765,"football game","shravan");
	}
}
