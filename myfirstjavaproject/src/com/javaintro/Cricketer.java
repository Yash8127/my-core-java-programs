package com.javaintro;

public class Cricketer {
	//declaration of instance variables
	int jerseyno;
	String name;
	//declaration of static variables
	static int countryid;
	static String countryname;
	public static void main(String[] args) {
System.out.println("Main method started");
System.out.println("welcome to the indian cricket team");
System.out.println("object 1 info*******");
   //created object
Cricketer dh = new Cricketer();
//intialize the data
countryid=91;
countryname="india";
dh.jerseyno=07;
dh.name="MSD";
System.out.println("country id:"+countryid);
System.out.println("country name:"+countryname);
System.out.println("Jersey NO:"+dh.jerseyno);
System.out.println("Name of the player:"+dh.name);
System.out.println("object 2 info*****");
Cricketer vk = new Cricketer();
vk.name="virat kohil";
vk.jerseyno=18;
System.out.println("country id:"+countryid);
System.out.println("country name:"+countryname);
System.out.println("Jersey NO:"+vk.jerseyno);
System.out.println("Name of the player:"+vk.name);
	}

}
