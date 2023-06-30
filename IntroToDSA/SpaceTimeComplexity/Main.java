package SpaceTimeComplexity;

public class Main {
    public static void main(String[] args) {
        // Space and time Complexity
        // Time complexity - Time taken by code to execute a particular task as function of length of input
        // Space complexity - Additional space taken by code to execute a particular task as function of length of input


        // Big - O  upper bound
        // Theta - O average bound
        // omega - O lower bound

        // BIG-O.......
        //constant - O(1)
        //Linear - O(n)
        //Log - O(log n)
        //Quad = O(n^2)
        //Cubic = O(n^3)

        // Drop the constand and non dominating constants

        int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        //______ BigO(1) // Constant Time
//       System.out.println(arr[0]);

        //_______BigO(n) // Linear Time
//        for(int i= 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        // _____ BigO(log N) // Quad Time
        // Binary search

//        int start = 0;
//        int end = arr.length-1;
//        int find = 14;
//
//        while(start<=end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == find) {
//                System.out.println("Found the Element " + find);
//                break;
//            } else if (arr[mid] < find) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }

        // _____ BigO(N^2) // Quad Time

        // Pair whose sum is = target
//        int target = 10;
//
//        for(int i = 0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]+arr[j] == target){
//                    System.out.println("Pair "+arr[i]+" "+arr[j]);
//                }
//            }
//        }

    }
}
