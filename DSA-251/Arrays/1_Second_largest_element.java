import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.


		// check mark for all the same value 

		boolean allsame  = false;

		for(int i= 0;i<arr.length-2;i++){
			if(arr[i]==arr[i+1]&& arr[i] == arr[i+2]){
				allsame = true;
			}	
		}

		if(allsame){
			return -1;
		}


		// Find largest
		int largest = findlargest(arr);

		//Find second largest
		int maxnum = Integer.MIN_VALUE;

		for(int i= 0;i<arr.length;i++){
			if(arr[i]>maxnum && arr[i]!=largest){
				maxnum = arr[i];
			}
		}

		return maxnum;
	}

	public static int findlargest(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
}