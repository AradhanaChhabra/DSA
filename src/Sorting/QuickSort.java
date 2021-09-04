package Sorting;

import java.util.*;

public class QuickSort {
	
	static void quickSort(int[]a,int l,int h) {
//		at least contains two elements
		if(l<h) {
			int partioning_index=partition(a,l,h);
//			before mid
			quickSort(a,l,partioning_index-1);
//			after mid
			quickSort(a,partioning_index+1,h);
		}
	}
	static int partition(int a[],int l,int h) {
//		code for randomized pivot
		Random rand=new Random();
		int pivot=rand.nextInt(h-l)+l;
//		System.out.println(pivot);
		swap(a,l,pivot);
//		partition code
		pivot=l;
		int i=l;
		int j=h;
		while(i<j) {
			while(a[i]<=a[pivot]&&i<h) i++;
//			until we get the element greater than pivot element form the left
			while(a[j]>a[pivot])j--;
//			until we get the element smaller than pivot element form the right		
			if(i<j) {
				swap(a,i,j);
			}
		}
//		j will be the index of element just smaller than pivot, so this element must be before pivot at its place
		swap(a,j,pivot);
		return j;
		
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
	
	static void swap(int[]a,int x, int y) {
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}

}
//  best and average time complexity >>O(n) 
// worst case >> o(n^2)
