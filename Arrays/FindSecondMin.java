public class FindMinimum {
	//WAP to find 2nd minimum values
	public static int findSecondMin(int [] ar) {
		int min1 = Integer.MAX_VALUE;
		for(int i: ar) {
			if(i < min1)
				min1 = i;
		}
		int min2 = Integer.MAX_VALUE;
		for(int i: ar) {
			if( i < min2 && i != min1)
				min2 = i;
		}
		
		return min2;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};	
		System.out.println("Second minumum value : "+ findSecondMin(arr));
	}

}
