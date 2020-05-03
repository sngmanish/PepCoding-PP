/**
 * Gcd_And_Lcm
 */
import java.util.*;
public class Gcd_And_Lcm {
  
  
    
    	    public static void main(String[] args) {
    	    Scanner scn = new Scanner(System.in);
    	    int a = scn.nextInt();
            int b = scn.nextInt();
            
            int t1 = a;
            int t2 = b;
    
            while(t1 % t2 != 0){               
                int rem = t1 % t2;
                t1 = t2;
                t2 = rem;
            }
            
            int gcd = t2;
        
            int lcm = (a * b)/gcd;
    
            System.out.println(gcd);
            System.out.println(lcm);
            scn.close();
          }

         
    }

  
