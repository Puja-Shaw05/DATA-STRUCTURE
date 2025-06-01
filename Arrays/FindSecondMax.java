public class FindFirstMaximum {

	//WAP to find the 2nd maximum value
	public static int findSecondMax(int [] arr) {
		int max1 = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if( i> max1 )
				max1 = i;
		}
		
		int max2 = Integer.MIN_VALUE;
		for(int i: arr) {
			if(i > max2 && i!= max1)
				max2 = i;
		}
		
		return max2;
	}
	
	public static void main(String[] args) {
		int arr[] = {23,76,6,4,30};
		
		System.out.println(findSecondMax(arr));
		
	}
}
