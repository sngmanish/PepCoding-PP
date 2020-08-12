import java.util.*;
      
      public class pattern7{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
            
         for (int r =1; r <=n; r++){
            for (int c = 1; c<= n; c++){
                if (r==c){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
                }
            
             
             System.out.println();
            }
             
            scn.close(); 
         }
        }
    