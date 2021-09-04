package Array;
import java.util.*;

class KadaneAlgoMaxSumSubArr{
	
 //Function to find the sum of contiguous subarray with maximum sum.
 static int maxSubarraySum(int a[], int n){
     
     // Brute Force Method
     // int max=a[0];
     // for(int i=0;i<n;i++){
     //     int currMax=0;
     //     for(int j=i;j<n;j++){
     //         currMax+=a[j];
     //         if(max<currMax){
     //             max=currMax;
     //         }
             
     //     }
     // }
     
//      Kadane Algo
//	 keep a track of positive contiguous segments of array. 
//	 (if the segment becomes negative, current max becomes 0, while the max will be max positive sub-array till now)
     int max=Integer.MIN_VALUE,currMax=0;
     for(int i=0;i<n;i++){
         currMax+=a[i];
         if(currMax>max){
             max=currMax;
         }
         if(currMax<0){
             currMax=0;
         }
     }
 
     
     // Another Approach
     //local_maximum at index i is the maximum of A[i] and the sum of A[i] and local_maximum at index i-1.
     
     // int max=Integer.MIN_VALUE,currMax=0;
     // for(int i=0;i<n;i++){
     //     currMax=Math.max(a[i],currMax+a[i]);
     //     if(currMax>max){
     //         max=currMax;
     //     }
     // }
     
     return max;
     
 }
 
 public static void main(String arg[]) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++){
	        arr[i] =in.nextInt();
	    }
	    
     System.out.println(maxSubarraySum(arr, n));
     in.close();
		
	}
 
}

