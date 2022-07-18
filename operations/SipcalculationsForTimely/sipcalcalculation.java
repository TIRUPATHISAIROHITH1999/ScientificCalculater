package operations.SipcalculationsForTimely;

import java.util.Scanner;





public class sipcalcalculation {
    static Scanner sc=new Scanner(System.in);
    static double finalResult;
    public static double setsipcalculation() {
        System.out.print("Current amount         : ");
	    double ca=sc.nextInt();
	    System.out.print("Rate of interest in %  : ");
	    double ri=sc.nextInt();
	    System.out.print("Total time in years    : ");
	    double tt=sc.nextInt();
	    double funds=ca*Math.pow((1+ri/100),tt);
	    finalResult=funds;
        return finalResult;
       
    }
}
