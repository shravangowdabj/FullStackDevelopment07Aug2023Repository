package Arrayassignment3demo;

public class Assg32DArray {

	public static void main(String[] args) {
		byte x[][]= {{2,2,1},{4,5,7},{1,1,2}};
	    int i=0;
	    while(i<x.length)
	    {
	    	int j=0;
	    	while(j<x[i].length)
	    	{
	    		System.out.print(x[i][j]+"  ");
	    		j++;
	    	}
	    	System.out.println();
	    	i++;
	    		
	    		
	    }

	}

}
