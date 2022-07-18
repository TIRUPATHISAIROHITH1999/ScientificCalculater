package operations.Binarytodecimalval;

import java.util.Scanner;

import mainCalculater.*;

public class binarytodecimals {
    static Scanner sc=new Scanner(System.in);
    static int D2bx;
    public static void setbinary2decimal() {
        int finalResult2;
        int B2DF;
         
        try {
            System.out.print("Enter the number: ");
            D2bx=sc.nextInt();
            String dd=Integer.toString(D2bx);
            finalResult2=D2bx;
            calculaterAll.setFinalResult2(finalResult2);
            B2DF=Integer.parseInt(dd,2);
            calculaterAll.setB2DF(B2DF);
        } catch (Exception e) {
            System.out.println();
            System.out.println("Please enter the proper number !!!");
            System.out.println();
        }
    }
}
