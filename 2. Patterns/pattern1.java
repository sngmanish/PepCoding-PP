import java.util.*;
      
      public class pattern1{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int counter =1;
            
         for (int r =1; r <=n; r++){
             for (int c = 1; c<=counter; c++){
             System.out.print("*	");
             }
             counter++;
             System.out.println();
             
            scn.close(); 
         }
        }
    }