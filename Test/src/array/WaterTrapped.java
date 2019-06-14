package array;

public class WaterTrapped {

	public static void main(String[] args) {
		int [] ar = {7,4,0,9};
		find(ar,ar.length);

	}

	private static void find(int[] a, int n) {
		
		 int i,j,temp;
		 int sum=0;
	     
		    int left[]=new int[n];
		    int right[]=new int[n];
		    left[0]=a[0];
		    right[n-1]=a[n-1];
		    for(i=1;i<n;i++)
		    left[i]=Math.max(a[i],left[i-1]);
		        for(i=n-2;i>=0;i--)
		    right[i]=Math.max(a[i],right[i+1]);
		       for(i=0;i<n;i++)
		    sum=sum+Math.min(left[i],right[i])-a[i];
		    
		     System.out.println(sum);
		
	}

}
