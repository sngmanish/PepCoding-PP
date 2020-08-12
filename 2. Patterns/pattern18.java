import java.util.*;
       
       public class pattern18{
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           int spaces = 0;
           int stars = n;
           for(int r = 1; r <= n; r++){
               for(int c1 = 1; c1 <= spaces; c1++){
                       System.out.print("\t");
                   }
               
               for(int c2 = 1; c2 <= stars; c2++){
                   if (r>1 && r<n/2 && c2>1 && c2<stars){
                   System.out.print("\t");
               }
               else {
                System.out.print("*\t");
               }
            }
       
               if(r <= n / 2){
                   stars-=2;
                   spaces++;

               } else {
                   stars+=2;
                   spaces--;
               }
       
               System.out.println();
           }
           scn.close(); 
       
        }
       }
    