package Constructoroverloading;
class college
{
	college(String collegename)
	{
		System.out.println("collegename:"+collegename);
	}
	college(int collegeid)
	{
		System.out.println("collegeid:"+collegeid);
	}
	college(char branch)
	{
		System.out.println("branch:"+branch);
	}
	
}

public class College1 {

	public static void main(String[] args) {
		college obj=new college("ghousia college of engg");
		college obj2=new college(12);
		college obj3=new college("B");
		

	}

}
