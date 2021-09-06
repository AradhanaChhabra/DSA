package Array;

//import java.lang.*;
import java.io.*;
import java.util.*;
class MinJumps
{
	static int minJumpsDP(int[] arr){
//        DP Approach
//		 Time Complexity =O(n^2)
//		Space Complexity=0(n)
        int n=arr.length;
        if(n<=1){
            return 0;
        }
        if(arr[0]==0)
        return -1;
        // jumps array holds the minimun no of jumps needed to reach ith position from 0
        int jumps[] = new int[n];
        Arrays.fill(jumps,Integer.MAX_VALUE);
        jumps[0]=0;
        // Longest Increasing Subsequnce 
        for(int i=1;i<n;i++){
            // jumps[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(i<=j+arr[j] && jumps[j]!=Integer.MAX_VALUE)
                // if ith position is reachable from j
                {
                    jumps[i]=Math.min(jumps[i],(jumps[j]+1));
                    break;
                }
            }
        }
        if(jumps[n-1]!=Integer.MAX_VALUE)
        return jumps[n-1];
        else return -1;
    }
	
//	Linear Approach O(n) Space(1)
	static int minJumps(int[] arr){
        int n=arr.length;
        if(n<=1) return 0;
        if(arr[0]==0) return -1;
        int maxReach=arr[0];
        // maximum reachable index in the array at all the time
        int steps=arr[0];
        // no of steps we can still take
        int jumps=1;
        // necessary jumps to reach max && the current jump we're making
        for(int i=1;i<n;i++){
            // if it's the end of the array
            if(i>=n-1) return jumps;
            maxReach=Math.max(maxReach,arr[i]+i);
            steps--;
            if(steps==0){
                // if no more step is left 
                jumps++;
                // check f not possible to go further
                if(i>=maxReach){
                   return -1; 
                } 
                steps=maxReach-i;
            }
        }
        return -11;
    }
	public static void main (String[] args) throws IOException
	 {
	 
	     Scanner sc=new Scanner(System.in);
         int size = sc.nextInt();
         int[] arr= new int[size];
         for(int i = 0;i<size;i++){
             arr[i] = sc.nextInt();
         }
//         System.out.println(minJumpsDP(arr));
         System.out.println(minJumps(arr));
         sc.close();
	 }
	 
}
