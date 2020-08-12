import java.util.* ;
/**
 * Any_Base_to_Decimal
 */
public class Any_Base_to_Decimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        int newnumber = 0 ;
        int power = 1;

        while (number!=0){
            int rem = number % 10;
            number /= 10;
            newnumber += rem *power;
            power *= base;
        }
        System.out.print(newnumber);
        scn.close();
    }
}