/*
 * [CSCI 1301].java
 * Author:  [Pearl Takeda] 
 * Submission Date:  [01/24/2020]
 *
 * Purpose: The purpose of Lab 2 is to create a program that 
 *		calculates gross pay from hours worked per week, the amount of
 *		taxes (federal, state, social security, medicare) with given tax percentages
 * 		and ultimately net pay from deducting taxes from gross pay.
 * 
 * 
 * 
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
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
