public class FindFirstMax {
// WAP to find the 1st maximum number
	public static int findFirstMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		
		for(int i: arr) {
			if(i > max)  //checking weather array element is greater than max
				max = i;  //transfer the arrays values to max
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {23,76,6,4,30};
		System.out.println(findFirstMax(arr));	
	}
}
