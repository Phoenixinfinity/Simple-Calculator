package practical6;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Small Calculator
	   
		Double a,b,result;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		a = obj.nextDouble();
		System.out.println("Enter the 2nd Number : ");
		b = obj.nextDouble();
		System.out.println("\n Choose the Function : ");
		System.out.println("\n1.Addition (+)");
		System.out.println("\n2.Subtraction (-)");
		System.out.println("\n3.Multiplication (*)");
		System.out.println("\n4.Division (/)");
		char function = obj.next().charAt(0);
		obj.close();
		switch (function)
		{
		case '1':
		{  
		       result = a+b;
		       System.out.println("\na+b = "+result);
			   break;
	    }
		case '2' :
		{
			result = a-b;
			System.out.println("\na-b = "+result);
			break;
			
		}
		case '3':
		{
			result = a*b;
			System.out.println("\na*b = "+result);
			break;
			
		}
		case '4' :
		{
			result = a/b;
			System.out.println("\na/b = "+result);
			break;
		}
		
		
		default :
		
		{
			System.out.println("\nYou have entered wrong option!! ");
			return;
		}
		
		
		}
	}
		
		
}
