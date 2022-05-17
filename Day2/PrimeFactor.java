package com.murali;

public class PrimeFactor {

	public static void main(String[] args) {
		
		int num = 1;
		
		if(num>=2 && num<=100) {
			
			for(byte i=1;i<=num;i++) {
				
				if(num%i == 0) {
					System.out.println(i);
				}
				
			}
			
		}
		else {
			System.out.println("Invalid number");
		}
			
	}

}
