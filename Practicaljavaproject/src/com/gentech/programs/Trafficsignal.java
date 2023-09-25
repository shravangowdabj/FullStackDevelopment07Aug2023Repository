package com.gentech.programs;

public class Trafficsignal {

	public static void main(String[] args) {
		char colour=args[0].charAt(0);
		switch(colour)
		{
		case 'r':
		System.out.println(colour+" red indicates stop");
		break;
		case 'g':
		System.out.println(colour+" green indicates go");
		break;
		case 'y':
		System.out.println(colour+" yellow indicates ready");
		break;
		}

	}

}
