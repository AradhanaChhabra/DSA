package Array;
import java.util.*;

class IntersectionArr{
	//function to find no of intersecting elements
	public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        Set<Integer> s=new HashSet<Integer>();
        int ct=0;
        for(int i=0;i<n;i++){
            
            s.add(a[i]);
        }
        for(int i=0;i<m;i++){
            if(s.contains(b[i])){
                ct++;
            }
            s.remove(b[i]);
//            so that we do not count this element twice 
        }
        return ct;
    }
	
	//main function
	public static void main (String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		//Taking count of total testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n, m;

			//taking count of elements in array a
			n = sc.nextInt();

			//taking count of elements in array b
			m = sc.nextInt();

			int a[] = new int[n];
			int b[] = new int[m];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			System.out.println(NumberofElementsInIntersection(a, b, n, m));
		}
		sc.close();
	}
	
};
