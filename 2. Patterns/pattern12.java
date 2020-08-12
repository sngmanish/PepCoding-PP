import java.util.*;
      
      public class pattern12{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int stars =1;
          int a = 0;
          int b = 1;

            
         for (int r =1; r <=n; r++){
             for (int c1 = 1; c1<=stars; c1++){
             System.out.print( a +"\t");
             int c = a+b;
             a=b;
             b=c;
             }
             stars++;
             
             System.out.println();
             
            scn.close(); 
         }
         
        }
    }