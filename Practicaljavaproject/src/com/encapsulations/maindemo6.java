package com.encapsulations;
class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalAnimal;
	int Countrycode;

}  

class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
}

class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
}

public class maindemo6 {

	public static void main(String[] args) {
		Country ind= new Country();
		ind.CountryName="India";
		ind.CountryCaptial="Delhi";
		ind.NationalAnimal="Tiger";
		ind.Countrycode=07;
		System.out.println("CountryName:"+ind.CountryName);
		System.out.println("CountryCaptial:"+ind.CountryCaptial);
		System.out.println("NationalAnimal:"+ind.NationalAnimal);
		System.out.println("Countrycode;"+ind.Countrycode);
		System.out.println("----------------------");

		State ka=new State();
		ka.StateName="karnataka";
		ka.StateCaptial="banglore";
		ka.StateZone="Southbanglore";
		ka.StateCount=70000000;

		System.out.println("StateName:"+ka.StateName);
		System.out.println("StateCaptial="+ka.StateCaptial);
		System.out.println("StateZone:"+ka.StateZone);
		System.out.println("StateCount:"+ka.StateCount);
		System.out.println("-----------------------");

		District Kpm= new District();
		Kpm.DistrictName="mandya";
		Kpm.StateName="karnataka";
		Kpm.DistrictTaluk="mandya taluk";
		Kpm.DistrictCode=631;
		System.out.println("DistrictName:"+Kpm.DistrictName);
		System.out.println("StateName:"+Kpm.StateName);
		System.out.println("DistrictTaluk:"+Kpm.DistrictTaluk);
		System.out.println("DistrictCode:"+Kpm.DistrictCode);
		

	}

}
