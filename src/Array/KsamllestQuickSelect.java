package Array;
import java.util.*;

public class KsamllestQuickSelect {
//	using quick sort
	static int kSmallest(int[]a,int l,int h,int k) {
			int partition=partition(a,l,h);
			System.out.println(partition + " element "+a[partition]);
			if(partition==k-1) return a[partition];
			else if(k-1<partition) return kSmallest(a,l,partition-1,k);
			else return kSmallest(a,partition+1,h,k);
	}
	static int partition(int []a,int l,int h) {
		int pivot=h;
		int i=l;
		for(int j=l;j<h-1;j++) {
			if(a[j]<a[pivot]) {
				swap(a,i,j);
				i++;
			}
		}
//		i will be the index of last element i.e. smaller than pivot ,so pivot must be at its its right i.e. i+1
		swap(a,i,pivot);
		return i;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println(kSmallest(a,0,n-1,k));
		in.close();

	}
	static void swap(int[]a,int x, int y) {
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}


}
