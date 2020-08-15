import java.util.*;
/**
 * Rotate_by_90_degree 
 * Don't take extra spaces
 */
public class Rotate_by_90_degree {

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
        // Transpose 
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){ // swapping will only occur fow lower or upper triagle of matrix so that swapping dont occur two times 
               int temp = arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i] = temp;
            }
         }

    //    rotate, first row == last row, last row == first row
         for(int i = 0; i < arr.length; i++){
            int last = 0;
            int first = arr[0].length - 1;
            while(last <= first){
               int temp = arr[i][last];
               arr[i][last] = arr[i][first];
               arr[i][first] = temp;
   
               last++;
               first--;
            }
         }
        //  print 
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}