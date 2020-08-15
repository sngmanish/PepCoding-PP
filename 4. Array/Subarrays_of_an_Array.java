import java.util.*;
/**
 * Subarrays_of_an_Array
 */
public class Subarrays_of_an_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<arr.length ;i++){
            arr[i] = scn.nextInt();    
        }
        scn.close();
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
               for(int k = i; k <= j; k++){
                 System.out.print(arr[k] + "\t");
               }
               System.out.println();
            }
         }
    }
}