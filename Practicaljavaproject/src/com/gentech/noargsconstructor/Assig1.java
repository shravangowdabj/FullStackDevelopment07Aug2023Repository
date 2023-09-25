package com.gentech.noargsconstructor;
class employee
{
	String firstname;
	int age;
	long mobileno;
	String adress;
	employee()
	{
		firstname = "sagargowda";
		age = 39;
		mobileno = 89097627;
		adress = "mandya";
		System.out.println("firstname:" + firstname);
		System.out.println("age:" + age);
		System.out.println("mobileno:" + mobileno);
		System.out.println("adress:" + adress);
		System.out.println("+++++++++++");
	}
}
class department
{
	String deptname;
	String depthead;
	int deptno;
	department()
	{
	deptname = "outpatient";
	depthead = "ravi";
	deptno = 2;
	System.out.println("deptname:" + deptname);
	System.out.println("depthead:" + depthead);
	System.out.println("deptno:" + deptno);
	System.out.println("+++++++++++++");
	}
}
class insurance
{
	String insurancename;
	int in_id;
	String in_type;
	int in_amount;
	insurance()
	{
		insurancename = "vehicle";
		in_id = 86178;
		in_type = "car";
		in_amount = 52618;
		System.out.println("insurancename:" + insurancename);
		System.out.println("in_id:" + in_id);
		System.out.println("in_type:" + in_type);
		System.out.println("in_amount:" + in_amount);
	}
}
		
	
	


public class Assig1 {

	public static void main(String[] args) {
		employee sagar=new employee();
		department outpatient=new department();
		insurance vehical=new insurance();
	
		

	}

}
