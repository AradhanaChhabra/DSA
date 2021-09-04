package Array;

import java.util.*;


class RotateArrByOne {
	static void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        
    }
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            

            rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            sc.close();
            
        }
    
}