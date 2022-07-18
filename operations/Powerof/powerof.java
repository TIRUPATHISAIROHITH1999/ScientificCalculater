package operations.Powerof;

import java.util.Scanner;

import mainCalculater.*;



public class powerof {
    static Scanner sc=new Scanner(System.in);
    public static double setpowerof() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number x : ");
            double x=sc.nextDouble();
            System.out.print("Enter the number y : ");
            double y=sc.nextDouble();
            finalResult=Math.pow(x, y);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            finalResult=Math.pow(calculaterAll.getFinalResult(), x);
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
