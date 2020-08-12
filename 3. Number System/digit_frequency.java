import java.util.*;

/**
 * digit_frequency
 */
public class digit_frequency {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int digit  = scn.nextInt();
    int f = get_digit_frequency(number,digit);
    System.out.println(f);
    scn.close();
}
 public static int get_digit_frequency (int n, int  d){
    
    int counter =0;
    while (n !=0){
        int dig = n % 10;
        if (dig== d){
            counter++;
        }
        n= n /10 ;
    }
    return counter;
    
    
 }

} 
 
    
