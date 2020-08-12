import java.util.*;
      
      public class pattern3{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int stars =1;

          int spaces = n-1;
            
         for (int r =1; r <=n; r++){
             for (int c1 = 1; c1<= spaces; c1++){
             System.out.print("\t");
             }
             for (int c2 = 1; c2<= stars; c2++){
                System.out.print("*\t");
                }
             spaces --;
             stars++;
             System.out.println();
             
            scn.close(); 
         }
        }
    }