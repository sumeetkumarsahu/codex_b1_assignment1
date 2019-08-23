import java.util.Scanner;

public class Question_6c 
{

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out .print("Enter a Year to check it is leap year or not:");
		int leap_year= input.nextInt();
		if((leap_year%4==0) || (leap_year%100==0) && (leap_year%400==0))
			    	  System.out.println("Year is a leap year:"+leap_year);
	  else if ((leap_year%4!=0) || (leap_year%100!=0) && (leap_year%400!=0))
		  System.out.println("Year is not a leap year:"+leap_year);
			
	}

}
