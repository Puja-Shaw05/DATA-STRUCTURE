public class FindFirstMin {

	//WAP to find 1st minimum element
	public static int findFirstMin(int [] ar) {
		int min = Integer.MAX_VALUE;
		for(int i: ar) {
			if(i < min)
				min = i;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		System.out.println("First minimum value : "+ findFirstMin(arr));
	
	}

}


