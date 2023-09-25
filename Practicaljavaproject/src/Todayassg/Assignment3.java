package Todayassg;
public class Assignment3 {

	public static void main(String[] args) 
	{
		showallemp o = new showallemp();
		o.showempname("Shravan");
		o.showdepcode(1098);
		o.showempno(556432);

	}
}
interface empname
{
	void showempname(String s);
}
interface depcode extends empname
{
	void showdepcode(int n);
}
interface empno extends depcode
{
	void showempno(int n);
}

class showallemp implements empno
{
	public void showempname(String s) 
	{
		System.out.println("Employee Nmae : "+s);
	}
	public void showdepcode(int n)
	{
		System.out.println("Department Code : "+n);
	}
	public void showempno(int n)
	{
		System.out.println("Employee no : "+n);
	}

}
