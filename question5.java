import java.util.Scanner;

public class Question_5 
{

	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out .print("Enter an salary:$");
		float sal_rn= input.nextInt();
		
		if((sal_rn>0.00)&&(sal_rn<=14999.99))
		System.out.println("tax due="+ (0.00+(sal_rn-0.00)*0.18));
		
		if ((sal_rn>=15000.00)&&(sal_rn<=29999.00))
        System.out.println("tax due="+ (2250.00+(sal_rn-15000.00)*0.18));
        
        if((sal_rn>=30000.00)&&(sal_rn<=49999.99))
		System.out.println("tax due="+ (5400.00+(sal_rn-30000.00)*0.22));
		
		if((sal_rn>=50000.00)&&(sal_rn<=79999.00))
        System.out.println("tax due="+ (11000.00+(sal_rn-50000.00)*0.27));
        
        if((sal_rn>=80000.00)&&(sal_rn<=150000.00))
		System.out.println("tax due="+ (21600.00+(sal_rn-80000.00)*0.33));
		
	}

}
