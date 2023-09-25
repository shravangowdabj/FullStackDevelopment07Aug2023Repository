package com.gentech.programs;

public class Largestamongthreenumber {

	public static void main(String[] args) {
		int X=Integer.parseInt(args[0]);
		int Y=Integer.parseInt(args[1]);
		int Z=Integer.parseInt(args[2]);
		if((X>Y)&&(X>Z))
		{
			System.out.println(X+" is largest number");
		}
		else if((Y>Z)&&(Y>X))
		{
			System.out.println(Y+" is largest number");
		}
		else
		{
			System.out.println(Z+" is largest number");
		}
		

	}

}
