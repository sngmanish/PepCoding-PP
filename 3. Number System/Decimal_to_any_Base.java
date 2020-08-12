import java.util.*;
/**
 * Decimal_to_any_Base
 */
public class Decimal_to_any_Base {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int base = scn.nextInt();
    int i =0;
    int newnumber = 0 ;
    // int p=1;
    while (number != 0){
        int rem = number % base ;
         newnumber += Math.pow(10,i)*rem; // p*rem
         number /= base;
         i++;
         //p *=10 
    }
    System.out.print(newnumber);
    scn.close();
}

    
}