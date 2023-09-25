package com.gentech.noargsconstructor;
class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalAnimal;
	int Countrycode;
	Country()
	{
		CountryName="India";
		CountryCaptial="Delhi";
		NationalAnimal="Tiger";
		Countrycode=07;
		System.out.println("CountryName:"+CountryName);
		System.out.println("CountryCaptial:"+CountryCaptial);
		System.out.println("NationalAnimal:"+NationalAnimal);
		System.out.println("Countrycode;"+Countrycode);
		System.out.println("----------------------");
	}
}
class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
	State()
	{
		StateName="karnataka";
		StateCaptial="banglore";
		StateZone="Southbanglore";
		StateCount=70000000;

		System.out.println("StateName:"+StateName);
		System.out.println("StateCaptial="+StateCaptial);
		System.out.println("StateZone:"+StateZone);
		System.out.println("StateCount:"+StateCount);
		System.out.println("-----------------------");
	}
}
class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
	District()
	{
		DistrictName="mandya";
		StateName="karnataka";
		DistrictTaluk="mandya taluk";
		DistrictCode=631;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("StateName:"+StateName);
		System.out.println("DistrictTaluk:"+DistrictTaluk);
		System.out.println("DistrictCode:"+DistrictCode);
	}
}

public class Assigb6 {

	public static void main(String[] args) {
		Country India=new Country();
		State Karnataka=new State();
		District mandya=new District();
		

	}

}
