package operations.Itanof;

import java.util.Scanner;

import mainCalculater.*;



public class itan {
    static Scanner sc=new Scanner(System.in);
    public static double setitan() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            double y=Math.toRadians(x);
            finalResult=Math.atan(y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            double y=Math.toRadians(calculaterAll.getFinalResult());
            finalResult=Math.atan(y);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
