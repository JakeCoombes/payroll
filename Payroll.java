/* 
 * Jake Coombes
 * 9/18/2018
 * Lab2a Payroll:
 * this code calculates the gross pay of an employee
 */

public class Payroll 
{

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		int hours = 40;
		double grossPay, payRate = 25.0;
		
		grossPay = hours * payRate;
		System.out.println("your gross pay is $" + grossPay);		
	}
}
