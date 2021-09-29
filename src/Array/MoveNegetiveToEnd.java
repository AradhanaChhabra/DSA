package Array;
import java.util.*;

class MoveNegetiveToEnd {
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
            sc.close();
        }
	
    
    static void segregateElements(int arr[], int n)
    {
        int j=0;
        int []t=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                t[j]=arr[i];
                j++;
            }
        }
        
        if(j==n){
            return;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                t[j]=arr[i];
                j++;
            }
        }
        // arr=t.clone();
        // arr=Arrays.copyOf(t,n);
        // BOTH OF THESE METHODS CHANGE THE VALUE OF arr TO REFER TO ANOTHER ARRAY
        //SO THE ORIGINAL ARRAY REMAINS UNCHANGED 
        // WHEREAS System.arraycopy() COPIES THE ELEMENT OF t to arr
        
        System.arraycopy(t,0,arr,0,n);
    }
}
// We can also use DNF method for constant space complexity
// two pointer algo