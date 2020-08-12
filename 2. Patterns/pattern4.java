import java.util.*;
      
      public class pattern4{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int stars =n;

          int spaces = 0;
            
         for (int r =1; r <=n; r++){
            for (int c2 = 1; c2<= spaces; c2++){
                System.out.print("\t");
                }
             for (int c1 = 1; c1<= stars; c1++){
             System.out.print("*\t");

             }
             
             spaces ++;
             stars--;
             System.out.println();
             
            scn.close(); 
         }
        }
    }