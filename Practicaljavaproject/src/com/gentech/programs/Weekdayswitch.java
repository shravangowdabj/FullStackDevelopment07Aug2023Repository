package com.gentech.programs;

public class Weekdayswitch {

	public static void main(String[] args) {
		int X=Integer.parseInt(args[0]);
		switch (X)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
		    System.out.println("tuesday");
		    break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("bad day");
			
		}

	}

}
