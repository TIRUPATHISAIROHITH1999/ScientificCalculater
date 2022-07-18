package operations.Cosof;

import java.util.Scanner;

import mainCalculater.*;



public class cosof {
    static Scanner sc=new Scanner(System.in);
    public static double setcosof() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            double y=Math.toRadians(x);
            finalResult=Math.cos(y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            double y=Math.toRadians(calculaterAll.getFinalResult());
            finalResult=Math.cos(y);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
