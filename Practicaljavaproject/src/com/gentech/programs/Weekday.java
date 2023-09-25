package com.gentech.programs;

public class Weekday {

	public static void main(String[] args) {
		int X=Integer.parseInt(args[0]);
		if(X==1)
		{
			System.out.println("sunday");
		}
		else if(X==2)
		{
			System.out.println("monday");
		}
		else if(X==3)
		{
			System.out.println("tuesday");
		}
		else if(X==4)
		{
			System.out.println("wednesday");
		}
		else if(X==5)
		{
			System.out.println("thrusday");
		}
		else if(X==6)
		{
			System.out.println("friday");
		}
		else if(X==7)
		{
		System.out.println("saturday");
		}
		else
		{
		System.out.println("bad day");
		}

	}

}
