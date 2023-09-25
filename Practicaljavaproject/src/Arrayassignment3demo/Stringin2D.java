package Arrayassignment3demo;

public class Stringin2D {

	public static void main(String[] args) {
		String x[][]= {{"sagar","chethu","ravi"},{"rafi","hari","yash"},{"javi","dev","gopi"}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+"  ");
	
			}
			System.out.println();
		}
	}

}
