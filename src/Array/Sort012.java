package Array;
import java.util.*;

class Sort012 {
	// DUTCH NATIONAL FLAG PROBLEM
	//  so the objects of colors(that satisfy the same condition are adjacent)  
    public static void main (String[] args)  {
    	Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            sort012(arr, n);
            for(int i=0; i<n; i++){
            	 System.out.println(arr[i]);
            }
            sc.close();
           
        }
    
    public static void sort012(int a[], int n)
    {
        
//    	array be divided in these four sections
//    	a[0..l]=>0
//    	a[l..i]=>1
//    	a[i..r-1]=>unknown
//    	a[r..n-1]=>2
    	
        int l=0;
        //left
        int r=n-1;
        //right
        int i=0;
        //mid
        while(i<=r){
            if(a[i]<1){
                swap(a,i,l);
                l++;
                i++;
            }
            else if(a[i]>1){
                swap(a,i,r);
                r--;
                // no increment in i
            }
            else if(a[i]==1){
                i++;
            }
        }//while loop ends
    }
        
	    static void swap(int []a, int x,int y){
	        int temp=a[x];
	        a[x]=a[y];
	        a[y]=temp;;
	    }
}

//O(n) S(1)