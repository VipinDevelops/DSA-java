import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {

        // Dutch National Flag Algorithm 
        //partitioning algorithm that separates an array containing three distinct values into three sections based on a pivot value
        
        // . Initially, low and mid point to the beginning of the array, and high points to the end of the array.
    int low = 0;
    int mid = 0;
    int high = arr.length - 1;
    //Iterate through the array using the mid pointer until it reaches or crosses the high pointer.
    while (mid <= high) {
        //If the element at the mid pointer is 0, swap it with the element at the low pointer, increment both low and mid pointers by one.
        if (arr[mid] == 0) {
            swap(arr, low, mid);
            low++;
            mid++;
        //If the element at the mid pointer is 1, simply increment the mid pointer by one.
        } else if (arr[mid] == 1) {
            mid++;
        //If the element at the mid pointer is 2, swap it with the element at the high pointer,
        // decrement the high pointer by one (since we know the swapped element is either 0 or 1),
        // and do not increment the mid pointer. This step is necessary to handle the case when the element swapped from the high pointer is 0 or 1,
        // which should be further examined in the next iteration.    
        } else if (arr[mid] == 2) {
            swap(arr, mid, high);
            high--;
        }
    }
}
    
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


    }
