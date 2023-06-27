import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		 for(int i = 0;i<arr.length;  i++){
			 //find the max item in the remaining array and swap with correct index 

			int last = arr.length - i - 1; // new last

			int maxIndex = getMaxIndex(arr, 0, last); // get max element

			swap(arr,maxIndex,last);

		 }
		 
	}
	public static int getMaxIndex(int[] arr,int start,int end){
		int max = start;
		for(int i = start; i<= end; i++){
			if(arr[i]>arr[max]){
				max = i;
			}
		}
		return max;
	}

	public static void swap (int arr[], int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
 	}
}
