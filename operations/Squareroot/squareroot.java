package operations.Squareroot;

import java.util.Scanner;

import mainCalculater.*;



public class squareroot {
    static Scanner sc=new Scanner(System.in);
    public static double setsquareroot() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            finalResult=Math.sqrt(x);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            finalResult=Math.sqrt(calculaterAll.getFinalResult());
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
