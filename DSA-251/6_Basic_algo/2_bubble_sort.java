
import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        // Itrate over the array and when ever you got a situation not sorted just swap it 
        // That way you'll get the element at the end or array sorted and now on  its correct position which is last 
        // repeat the process for the length of array times 
        
        for(int i = 0;i<arr.length;i++){ // looping for the length of array 
            for(int j = 1;j<(arr.length-i);j++){ // loop to check if element is sorted 
                if(arr[j-1]>arr[j]){ // compare 
                    swap(arr, j-1, j); // swap 
                }
            }
            // CHECK SWAP method 
        }
    }

    public static void swap (int[] arr, int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

}
