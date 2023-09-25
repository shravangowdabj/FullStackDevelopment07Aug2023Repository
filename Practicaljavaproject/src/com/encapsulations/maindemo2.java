package com.encapsulations;




class Student
{
	String StudentFirstName;
	int age;
	int id;
	String branch;
}  

class Library
{
	String LibraryType;
	String LibraryName;
	int id;
	String Location;
}

class Sports
{
	String SportsName;
	String SportsSponser;
	String PlayerName;
	int Jersyid;
}
public class  maindemo2{

	public static void main(String[] args) {
		Student shravan= new Student();
		shravan.StudentFirstName="Guna";
		shravan.age=21;
		shravan.id=4707;
		shravan.branch="Engineering";
		System.out.println("StudentFirstName:"+shravan.StudentFirstName);
		System.out.println("Age:"+shravan.age);
		System.out.println("id:"+shravan.id);
		System.out.println("branch;"+shravan.branch);
		System.out.println("----------------------");

		Library Lib=new Library();
		Lib.LibraryType="Government";
		Lib.LibraryName="kannada";
		Lib.id=9080;
		Lib.Location="mandya";

		System.out.println("LibraryName:"+Lib.LibraryName);
		System.out.println("LibraryType="+Lib.LibraryType);
		System.out.println("id:"+Lib.id);
		System.out.println("Location:"+Lib.Location);
		System.out.println("-----------------------");

		Sports Sp= new Sports();
		Sp.SportsName="Cricket";
		Sp.SportsSponser=("Addidas");
		Sp.PlayerName="Virat Kolhi";
		Sp.Jersyid=18;
		System.out.println("SportsName:"+Sp.SportsName);
		System.out.println("SportsSponser:"+Sp.SportsSponser);
		System.out.println("PlayerName:"+Sp.PlayerName);
		System.out.println("Jersyid:"+Sp.Jersyid);


		

	}

}
