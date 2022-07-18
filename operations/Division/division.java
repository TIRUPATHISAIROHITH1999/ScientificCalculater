package operations.Division;

import java.util.Scanner;

// New imports
import mainCalculater.*;

public class division {
    
   static Scanner sc=new Scanner(System.in);
    public static double setdivisions() { 
        double finalResult;
        double x;
        double y;
        if(calculaterAll.getFinalResult()==0)
        {
            System.out.print("Enter the number: ");
            x=sc.nextDouble();
            System.out.print("Enter the number: ");
            y=sc.nextDouble();
            finalResult=x/y; 
        }
        else
        {
            finalResult=calculaterAll.getFinalResult();
            System.out.print("Enter the number: ");
            x=sc.nextDouble();
            finalResult=finalResult/x;
        }
        return finalResult ;
       
    }
   
}
