package Array;
import java.util.*;

class KthLargestInStream {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
            
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();

            int[] ans = kthLargest(k,arr,n);
            for(int i=0; i<n; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
            sc.close();
        }
 
    static int[] kthLargest(int k, int[] arr, int n) {
//    	the Kth largest element for each element in the stream
        int []ans=new int[n];
//        min heap
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
//            if size exceeds then remove the smallest 
            if(pq.size()>k){
                pq.poll();
            }
//            size of ans array less than k
            if(i<k-1){
                ans[i]=-1;
            }
//            THE SMALLEST ELEMENT IN THE PQ OF K SIZE IS THE KTH LARGEST ELEMENT OF THE ARRAY AT THAT POINT
            else{
                ans[i]=pq.peek();
            }
        }
        return ans;
        
    }
};

//O(n log(K)