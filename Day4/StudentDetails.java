package com.murali;

public class StudentDetails {
	
	int roll;
	String name;
	String address;
	String collageName;
	
	StudentDetails() {

	}
	
	StudentDetails(int roll,String name,String address,String collageName){
		this(roll, name, address);
		this.collageName = collageName;
	}
	
	StudentDetails(int roll,String name,String address){
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "NIT";
		
	}
	
	
	public static void main(String[] agrs) {
		
		int roll = 25;
		String name = "Murali";
		String address = "Kurnool";
		String collageName = "NIT";
		StudentDetails S = new StudentDetails();
		
		if(collageName == "NIT") {
			S = new StudentDetails(roll, name, address);
		}
		else {
			S = new StudentDetails(roll, name, address, collageName);
		}
		System.out.println(S.name);
			
	}
	
	
}
