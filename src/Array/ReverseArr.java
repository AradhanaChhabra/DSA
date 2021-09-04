package Array;
import java.util.*;

class ReverseArr {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n/2;i++){
		        int temp=a[i];
		        a[i]=a[n-i-1];
		        a[n-i-1]=temp;
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		    
		}
		sc.close();
	}
}
//just swap first and last element till we get to the middle of the array