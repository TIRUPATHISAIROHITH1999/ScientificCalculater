package operations.Sineof;

import java.util.Scanner;

import mainCalculater.*;



public class sineof {
    static Scanner sc=new Scanner(System.in);
    public static double setsineof() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            double y=Math.toRadians(x);
            finalResult=Math.sin(y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            double y=Math.toRadians(calculaterAll.getFinalResult());
            finalResult=Math.sin(y);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
