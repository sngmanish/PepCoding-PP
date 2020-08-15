    import java.util.*;

    /**
     * Rotate_an_Array
     */
    public class Rotate_an_Array {

        public static void main(String[] args) {
            Scanner scn = new Scanner (System.in);
            int n = scn.nextInt();
            int [] arr = new int[n];
            for (int i =0; i<arr.length ;i++){
                arr[i] = scn.nextInt();    
            }
            int r = scn.nextInt(); //by how much
            rotate(arr,r);
            display(arr);
            scn.close();
        }
        public static void rotate(int[] a, int r) {
            r = r % a.length;
            if (r < 0) {
            r += a.length;
            }
            reverse(a, 0, a.length - 1 - r); //rotate form 0 to array length - r 
            reverse(a, a.length - r, a.length - 1);//rotate form array length - r  to last 
            reverse(a, 0, a.length - 1); //rotate entire thing again 
        }
        
        public static void reverse(int[] arr, int i1, int i2) {
            int li = i1;
            int ri = i2;
            while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
            }
        }

        public static void display(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }