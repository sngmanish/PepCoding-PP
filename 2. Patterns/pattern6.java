import java.util.*;
      
      public class pattern6{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
          int stars =n/2 + 1;
          int spaces = 1;
          
         for (int r =1; r <=n; r++){
            for (int c1 = 1; c1<= stars; c1++){
                System.out.print("*\t");
                }
            for (int c2 = 1; c2<= spaces; c2++){
                System.out.print("\t");
                }
            for (int c3 = 1; c3<= stars; c3++){
                    System.out.print("*\t");
                    }
            
             
             if (r <= n/2){
                spaces+=2;
                stars--;
             }
             else {
                 spaces-=2;
                 stars++;
             }
             
             System.out.println();
            }
             
            scn.close(); 
         }
        }
    
