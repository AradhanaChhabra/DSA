package Array;
import java.util.Scanner;

public class MinmaxArr{
	
	static class Pair{
		int min;
		int max;
		public Pair(int m,int n) {
			this.min=m;
			this.max=n;
		}
		public Pair() {
			
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Pair p=getminmax(a,n);
		System.out.println("min = "+p.min+" max = "+p.max);
		sc.close();
		
	}
	
	static Pair getminmax(int[]a,int n) {
		Pair ans=new Pair();
		int i;
		
		if(n%2==0) {
			if(a[0]<a[1]) {
				ans.min=a[0];
				ans.max=a[1];
			}
			else {
				ans.min=a[1];
				ans.max=a[0];
			}
			i=2;
		}
		else {
			ans.min=a[0];
			ans.max=a[0];
			i=1;
		}
		
		while(i<n-1) {
			if(a[i]<a[i+1]) {
				if(a[i]<ans.min) {
					ans.min=a[i];
				}
				if(a[i+1]>ans.max) {
					ans.max=a[i+1];
				}
			}
			else {
				if(a[i+1]<ans.min) {
					ans.min=a[i+1];
				}
				if(a[i]>ans.max) {
					ans.max=a[i];
				}
			}
			i+=2;
		}
		return ans;
	}
//	Compare in pairs >> less no of comparisons
//	if even initialize min max with the first two elements respectively else with the first and iterate through the loop in pairs.
	
	
//	linear search method 
//	initialize the min and max as first element and then iterate through the array and change the value positively.
	
//	static pair getMinMax(long a[], long n)  
//    {
//        //Write your code here
//        pair p=new pair(a[0],a[0]);
//        for(int i=1;i<n;i++){
//            if(p.second<a[i]){
//                p.second=a[i];
//            }
//            if(p.first>a[i]){
//                p.first=a[i];
//            }
//        }
//        return p;
//    }
}