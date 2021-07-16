//01/24/2020
import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Hours per week: \t");
		double hours = keyboard.nextInt();
		double fedtax = 10.00;
		double statetax = 4.5;
		double sstax = 6.2;
		double meditax = 1.45;
		double pph = 7.25;
	
		double grosspay = hours * pph;
		double federal = grosspay * fedtax/100;
		double state = grosspay * statetax/100;
		double ss = grosspay * sstax/100;
		double medicare = grosspay * meditax/100;
		double netpay = grosspay - federal - state - ss - medicare;
		
		System.out.println("Gross Pay: \t\t" + hours * 7.25);		
		System.out.println("Net Pay: \t\t" + netpay);
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + grosspay * fedtax/100);
		System.out.println("State: \t\t\t" + grosspay * statetax/100);	
		System.out.println("Social Security:\t" + grosspay * sstax/100);
		System.out.print("Medicare: \t\t" + grosspay * meditax/100);
		
		
	}

}
