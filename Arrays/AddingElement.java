public class AddingElement {
	//adding a element at specific index
	static int[] addingAtSpecificIndex(int [] arr, int n , int index) {
		if(index <0 || index>= arr.length) {
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		}else {
			int[] res = new int[arr.length+1];
			for(int i=0; i<res.length; i++) {
				if(i<index) 
					res[i] = arr[i];
				else if(i == index)
					res[i] = n;
				else 
					res[i] = arr[i-1];
			}
			return res;
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {7,3,5,2,9};
		
		int [] res = addingAtSpecificIndex(arr,13, 3);
		System.out.println(Arrays.toString(res));
		
	}

}
