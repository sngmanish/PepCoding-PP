import java.util.*;

/**
 * Inverse_of_an_Array
 */
public class Inverse_of_an_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
            int n = scn.nextInt();
            int [] arr = new int[n];
            for (int i =0; i<arr.length ;i++){
                arr[i] = scn.nextInt();    
            } 
            int inverse [] = inverse(arr);
            display(inverse);
            scn.close();
    }
    public static int[] inverse (int[] arr) {
        int [] val = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i]; // value = index
            val[v] =i; //index =value 
        }
        return val;
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}