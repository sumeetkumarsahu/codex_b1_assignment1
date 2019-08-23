import java.util.Scanner;

public class Question_7 
{

	public static void main(String[] args) 
	{Scanner input= new Scanner(System.in);
	System.out.println("Enter two nos");
	int no1= input.nextInt();
	int no2= input.nextInt();
	Scanner input2= new Scanner(System.in);
	System.out.println("Enter the '1for+','2for-','3for*','4for/','5for^'");
	int operation= input.nextInt();
	
	switch(operation)
	{
	case 1:System.out.println("Answer for sum is:"+(no1+no2));break;
	case 2:System.out.println("Answer for subtraction is:"+(no1-no2));break;
	case 3:System.out.println("Answer for multiplication is:"+(no1*no2));break;
	case 4:System.out.println("Answer for division is:"+(no1/no2));break;
	case 5:System.out.println("Answer for power is:"+(no1^no2));break;
	default:System.out.println("Entered Invalid operation");
	
	}

	}
		
	}
