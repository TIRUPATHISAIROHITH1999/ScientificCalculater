package operations.Nthlog;

import java.util.Scanner;

import mainCalculater.*;



public class nthlog {
    static Scanner sc=new Scanner(System.in);
    public static double setnthlog() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            System.out.print("Enter the nth root: ");
            double y=sc.nextDouble();
            finalResult=Math.pow(x, 1/y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            System.out.print("Enter the nth root: ");
            double y=sc.nextDouble();
            finalResult=Math.pow(calculaterAll.getFinalResult(), 1/y);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
