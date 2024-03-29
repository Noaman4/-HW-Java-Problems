// UCID: ns87@njit.edu
// Date: 2024-02-05

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        //Don't edit anything here
        int[] a1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = new int[]{0, 1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] a3 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] a4 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        
        processArray(a1);
        processArray(a2);
        processArray(a3);
        processArray(a4);
    }

    static void processArray(int[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        System.out.println("Odds output:");

        // Loop through each element in the array
        for (int value : arr) {
            // Check if the value is odd
            if (value % 2 != 0) {
                // Print odd values
                System.out.print(value + " ");
            }
        }

        // End add/edit section
        System.out.println();  // Move this line outside of the loop
        System.out.println("End process");
    }
}
