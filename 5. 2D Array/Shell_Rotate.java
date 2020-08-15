import java.util.*;
/**
 * Shell_Rotate
 * 
 * Too much
 */
public class Shell_Rotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int [][]  arr = new int [n][m];

        // taking input 
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }

       int s = scn.nextInt();  // shell number 
       int r = scn.nextInt();  // rotation
       shellrotate(arr, s, r);
       display(arr);

        scn.close();
    }

    public static void shellrotate(int[][] arr, int s, int r) {
        int[] larr = fillOnefromShell(arr, s);
        rotate(larr, r);  
        fill2d(arr, larr, s);
     }
  
     public static int[] fillOnefromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - 1 - (s - 1);
        int maxc = arr[0].length - 1 - (s - 1);

    
        int noe = 2 * (maxr -minr + maxc - minc) ; 
  
        int[] larr = new int[noe];
        // left wall
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
           larr[idx] = arr[i][minc];
           idx++;
        }
  
        // bottom wall
        for (int j = minc + 1; j <= maxc; j++) {
           larr[idx] = arr[maxr][j];
           idx++;
        }
  
        // right wall
        for (int i = maxr - 1; i >= minr; i--) {
           larr[idx] = arr[i][maxc];
           idx++;
        }
  
        // top wall
        for (int j = maxc - 1; j >= minc + 1; j--) {
           larr[idx] = arr[minr][j];
           idx++;
        }
  
        return larr;
     }
   // making 2d array
     public static void fill2d(int[][] arr, int[] larr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - 1 - (s - 1);
        int maxc = arr[0].length - 1 - (s - 1);
  
        // left wall
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
           arr[i][minc] = larr[idx];
           idx++;
        }
  
        // bottom wall
        for (int j = minc + 1; j <= maxc; j++) {
           arr[maxr][j] = larr[idx];
           idx++;
        }
  
        // right wall
        for (int i = maxr - 1; i >= minr; i--) {
           arr[i][maxc] = larr[idx];
           idx++;
        }
  
        // top wall
        for (int j = maxc - 1; j >= minc + 1; j--) {
           arr[minr][j] = larr[idx];
           idx++;
        }
     }
  
     public static void rotate(int[] larr, int r) {
        r = r % larr.length;
        if (r < 0) {
           r += larr.length;
        }
        reverse(larr, 0, larr.length - 1 - r);
        reverse(larr, larr.length - r, larr.length - 1);
        reverse(larr, 0, larr.length - 1);
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
  
     public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[0].length; j++) {
              System.out.print(arr[i][j] + " ");
           }
           System.out.println();
        }
     }
}