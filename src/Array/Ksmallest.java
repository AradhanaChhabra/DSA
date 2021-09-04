package Array;
import java.util.*;

class Ksmallest {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    
	    int k=sc.nextInt();
	    System.out.println(kthSmallest(arr,n,k));
	    sc.close();
	}
	
//	Max-heap
 public static int kthSmallest(int[] arr,int n, int k) 
 { 
     PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
     for(int i=0;i<n;i++){
         pq.add(arr[i]);
         if(pq.size()>k){
             pq.poll();
         }
     }
     return pq.peek();
 } 
}

//O(nlog(k))