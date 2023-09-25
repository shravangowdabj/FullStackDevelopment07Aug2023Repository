package Arrayassignment3demo;

public class TwoArrayin1D {

	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int b[]= {10,20,30,40,50,60};
		int c[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
