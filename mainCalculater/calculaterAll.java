// We are adding to package
package mainCalculater;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// Other imports after test
import operations.Addition.*;
import operations.Subtraction.*;
import operations.Multiplication.*;
import operations.Division.*;
import operations.Powerof.*;
import operations.Squareroot.*;
import operations.Nthlog.*;
import operations.Logof.*;
import operations.Naturallog.*;
import operations.Sineof.*;
import operations.Cosof.*;
import operations.Tanof.*;
import operations.Isineof.*;
import operations.Icosof.*;
import operations.Itanof.*;
import operations.SipcalculationsForTimely.*;
import operations.Binarytodecimalval.*;

public class calculaterAll  {
    public static double finalResult=0.0;
    public static int finalResult2=0;
    public static int B2DF=0;
    public static int choice;
    public static int D2by;
    public static int D2bx;
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        while(true)
        {     
        System.out.println("_____________________________________________");
        if(choice!=19 && choice!=18)
        {
            System.out.println(finalResult);
        } 
        else if(choice==18){
        System.out.println(finalResult);
        System.out.print("Binary: ");
        toBinary(D2bx);
        }
        else if(choice==19)
        {
            System.out.println(finalResult2);
            System.out.printf("Decimal: "+B2DF);
        }
        System.out.println();
        System.out.println("_____________________________________________");
        // operations
        System.out.println("________________OPERATIONS___________________");
        System.out.println();
        System.out.println("1.  ADD        2.  SUB     3.  MULTI");
        System.out.println("4.  DIVIDE     5.  POWER   6.  SQUAREROOT");
        System.out.println("7.  Nth LOG    8.  LOG     9.  NATURAL LOG");
        System.out.println("10. SIN        11. ISIN    12. COS");
        System.out.println("13. ICOS       14. TAN     15. ITAN");
        System.out.println("16. STOR       17. RECALL  18. D2B");
        System.out.println("19. B2D        20. SIP     21. CLEAR");
        System.out.println("___            22. HISTORY       ___");
        System.out.println();
        System.out.println("_____________________________________________");
    
        System.out.println();
            System.out.printf("Enter your operations:");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("ADDITIONS");
                finalResult=additions.setaddition();
                resultStorage();  
            }
            else if(choice==2)
            {
                System.out.println("SUBTRACTION");  
                finalResult=subtractions.setsubtraction();   
                resultStorage();
            }
            else if(choice==3)
            {
                System.out.println("MULTIPLICATION");
                finalResult=multiplication.setmultiplications();
                resultStorage();                            
            }
            else if(choice==4)
            {
                System.out.println("DIVIDE");
                finalResult=division.setdivisions();
                resultStorage();
            }
            else if(choice==5)
            {
                System.out.println("POWER");
                finalResult=powerof.setpowerof();
                resultStorage();
            }
            else if(choice==6)
            {
                System.out.println("SQUAREROOT");
                finalResult=squareroot.setsquareroot();
                resultStorage();
            }
            else if(choice==7)
            {
                System.out.println("NTHLOG");
                finalResult=nthlog.setnthlog();
                resultStorage();
            }
            else if(choice==8)
            {
                System.out.println("LOG");
                finalResult=logof.setlogof();
                resultStorage();
            }
            else if(choice==9)
            {
                System.out.println("NATURAL LOG");
                finalResult=naturallog.setnaturallog();
                resultStorage();
            }
            else if(choice==10)
            {
                System.out.println("SIN");
                finalResult=sineof.setsineof();
                resultStorage();
            }
            else if(choice==11)
            {
                System.out.println("ISIN");
                finalResult=isin.setisineof();
                resultStorage();
            }
            else if(choice==12)
            {
                System.out.println("COS");
                finalResult=cosof.setcosof();
                resultStorage();
            }
            else if(choice==13)
            {
                System.out.println("ICOS");
                finalResult=icos.setcosof();
                resultStorage();
            }
            else if(choice==14)
            {
                System.out.println("TAN");
                finalResult=tanof.setsineof();
                resultStorage();
            }
            else if(choice==15)
            {
                System.out.println("ITAN");
                finalResult=itan.setitan();
                resultStorage();
            }
            else if(choice==16)
            {
                System.out.println("STOR");
                specialResultStorage();
                finalResult=0.0;
                finalResult2=0;
            }
            else if(choice==17)
            {
                System.out.println("RECALL");
                specialWatchHistory();
               
            }
            else if(choice==18)
            {
                System.out.println("DECIMAL TO BINARY");
                decimal2binary();
                resultStorage();
                finalResult=0.0;
                finalResult2=0;
            }
            else if(choice==19)
            {
                System.out.println("BINARY TO DECIMAL");
                binarytodecimals.setbinary2decimal();
                resultStorage();
                finalResult=0.0;
                finalResult2=0;
            }
            else if(choice==20)
            {
                System.out.println("SIP");
                finalResult=sipcalcalculation.setsipcalculation();
                 resultStorage();
            }
            else if(choice==21)
            {
                System.out.println("CLEAR");
                finalResult=0.0;
                finalResult2=0;
                
            } 
            else if(choice==22)
            {
                System.out.println("HISTORY");
                System.out.println("HISTORY FROM: (OLD TO NEW)");
                watchHistory();
                finalResult=0.0;
                finalResult2=0;
            }
          
        }
    


     // Methods 
    }
    private static void watchHistory() {
        String HistoryContent;
        File file1=new File("History\\resultHistory.txt");
        try {
            BufferedReader br=new BufferedReader(new FileReader(file1));
            System.out.println();
            while((HistoryContent=br.readLine())!=null)
            {
                System.out.print("     "+HistoryContent);
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void resultStorage() {
         // _____________________File part____________________

         File file1=new File("History\\resultHistory.txt");
         String storeResult=String.valueOf(finalResult);
         try {
             BufferedWriter bw=new BufferedWriter(new FileWriter(file1,true));
             bw.write(storeResult);
             bw.newLine();
             bw.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }

    // SPECIAL RESULT STORAGE
    private static void specialResultStorage() {
        // _____________________File part____________________
        
        File file1=new File("History\\specialResultHistory.txt");
        String storeResult=String.valueOf(finalResult);
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(file1));
            bw.write(storeResult);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
// Special watch history
   private static void specialWatchHistory() {
    String HistoryContent;
    File file1=new File("History\\specialResultHistory.txt");
    try {
        BufferedReader br=new BufferedReader(new FileReader(file1));
        System.out.println();
        while((HistoryContent=br.readLine())!=null)
        {
            System.out.print("     "+HistoryContent);
            double HistoryOld=Double.parseDouble(HistoryContent);
            // System.out.println("risk sheep "+HistoryOld);
            finalResult=HistoryOld;
        }
        System.out.println();
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

//__________________________decimal to binary start___________________________ 
    private static void decimal2binary() {
        
        try {
            System.out.print("Enter the number: ");
            D2bx=sc.nextInt();
            finalResult=D2bx;
            // finalResult=y;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Please enter the proper number !!!");
            System.out.println();
        }
           
    }
    // d2b support method
    private static void toBinary(int x) {
        int binary[] = new int[40];    
        int index = 0;    
       while(x > 0){    
       binary[index++] = x%2;    
       x = x/2;    
     } 
    //  System.out.print("                         ");  
     for(int i = index-1;i >= 0;i--){    
       
       System.out.print(binary[i]);   
     }    
     
     System.out.println();//new line  
        // return x;
    }
    
    // _________________________________decimal to binary end__________________

    // Getters and Setters
    public static double getFinalResult() {
        return finalResult;
    }
    public static void setFinalResult(double finalResult) {
        calculaterAll.finalResult = finalResult;
    }
    

    public static int getFinalResult2() {
        return finalResult2;
    }
    public static void setFinalResult2(int finalResult2) {
        calculaterAll.finalResult2 = finalResult2;
    }

    public static int getB2DF() {
        return B2DF;
    }
    public static void setB2DF(int b2df) {
        B2DF = b2df;
    }

    
}
