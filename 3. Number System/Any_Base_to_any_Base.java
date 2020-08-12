import java.util.*;
/**
 * Any_Base_to_any_Base
 */
public class Any_Base_to_any_Base {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int frombase = scn.nextInt();
        int tobase = scn.nextInt();
       System.out.println(anybasetodecimal(number,frombase,tobase));

        scn.close();
    }
    
        public static int anybasetodecimal(int number,int frombase, int tobase){
            int decimalnumber = 0 ;
            int power = 1;
            while (number!=0){
                int rem = number % 10;
                number /= 10;
                decimalnumber += rem *power;
                power *= frombase;
            }
            return decimaltoanybase(decimalnumber, tobase);
        }
        public static int decimaltoanybase(int decimalnumber, int tobase){
            int tobasenumber = 0 ;
            int power=1;
            while (decimalnumber != 0){
                int rem = decimalnumber % tobase ;
                 tobasenumber +=  power*rem;
                 decimalnumber /= tobase;
                 power *=10; 
            }
            return tobasenumber;
        }
        

        
        
        
        
    
}
    
