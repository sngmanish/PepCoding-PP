import java.util.*;
       
       public class pattern17{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           int spaces = n/2;
           int stars = 1;
           for(int r = 1; r <= n; r++){
               for(int c1 = 1; c1 <= spaces; c1++){
                   if (r==n/2 +1){
                    System.out.print("*\t");

                   }
                   else{
                       System.out.print("\t");
                   }
                }
               
               for(int c2 = 1; c2 <= stars; c2++){
                   System.out.print("*\t");
               }
       
               if(r <= n / 2){
                   stars++;
               } else {
                   stars--;
               }
       
               System.out.println();
           }
           scn.close(); 
       
        }
       }