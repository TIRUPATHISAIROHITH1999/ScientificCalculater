package operations.Isineof;

import java.util.Scanner;

import mainCalculater.*;



public class isin {
    static Scanner sc=new Scanner(System.in);
    public static double setisineof() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            double y=Math.toRadians(x);
            finalResult=Math.asin(y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            double y=Math.toRadians(calculaterAll.getFinalResult());
            finalResult=Math.asin(y);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
