import java.util.*;
      
      public class pattern5{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
          int stars =1;
          int spaces = n/2;
            
         for (int r =1; r <=n; r++){
            for (int c2 = 1; c2<= spaces; c2++){
                System.out.print("\t");
                }
             for (int c1 = 1; c1<= stars; c1++){
             System.out.print("*\t");
             }
             
             if (r <= n/2){
                spaces--;
                stars+=2;
             }
             else {
                 spaces++;
                 stars-=2;
             }
             
             System.out.println();
            }
             
            scn.close(); 
         }
        }
    
