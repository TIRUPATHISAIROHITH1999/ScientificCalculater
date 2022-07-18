package operations.Logof;

import java.util.Scanner;

import mainCalculater.*;



public class logof {
    static Scanner sc=new Scanner(System.in);
    public static double setlogof() {
        double finalResult;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            double x=sc.nextDouble();
            finalResult=Math.log(x);
            calculaterAll.setFinalResult(finalResult);
        }
        else
        {
            finalResult=Math.log(calculaterAll.getFinalResult());
            calculaterAll.setFinalResult(finalResult);
        }
        return finalResult;
       
    }
}
