package com.gentech.programs;

public class Positiveornegative {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>=0)
		{
			System.out.println(num+" is a positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is a nagative number");
		}
		else
		{
			System.out.println(num+" not valid");
		}

	}

}
