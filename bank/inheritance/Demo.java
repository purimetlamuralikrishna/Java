package bank.inheritance;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		
		if(bank =="axis") {
			AxisBank axis = new AxisBank("Axis","axis00003255");
			return axis;
		}
		else if(bank=="icici") {
			IciciBank icici = new IciciBank("ICICI","ic003587");
			return icici;
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter Bank Name");
		Scanner sc = new Scanner(System.in);
		
		String bank = sc.next();
		
		Bank BankDetails = Demo.getBank(bank);
		BankDetails.displayDetails();
		sc.close();
		
	}

}
