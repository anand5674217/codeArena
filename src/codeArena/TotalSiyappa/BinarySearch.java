package codeArena.TotalSiyappa;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {8,25,34,50,62,75,82,83,88,96};
		int key=34,n=a.length;
		int low=0,high=n-1;
		int mid=(low+high)/2;
		
		while(low<=high){
			if(key> a[mid]){
				low=mid+1;
			}
			if(key<a[mid]){
				high=mid-1;
			}
			if(key==a[mid]){
				System.out.println("Found at "+ mid);break;
				
			}
			mid=(low+high)/2;
		}
	}

}
