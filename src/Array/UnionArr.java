package Array;
import java.util.*;

//Set only contains unique elements 
//O((m+n)log(m+n))
//S: O(m+n)

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {

        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<Math.max(n,m);i++){
            if(i<n)
            s.add(a[i]);
            if(i<m)
            s.add(b[i]); 
        }
        return s.size();
        
    }
}

class UnionArr {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    //calling doUnion method and printing the results
		    System.out.println(Solution.doUnion(a,n,b,m));
		    sc.close();
		}
		
	}


