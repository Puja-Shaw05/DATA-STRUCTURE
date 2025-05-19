public class FindMissing1ToN {
    public static void findMissingNo(int[] arr){
    	 for(int i=0; i< arr.length; i++) {
 		    	if(arr[i] +1 != arr[i+1]) {
 				     System.out.println(arr[i]+1);
 				      break;
 			    }
 		   }
      }
     
     //Second Approach
     public static int findMissing2(int[] ar) {
    	 int n = ar.length+1;
    	 int sum1 = (n *(n+1))/2;
    	 int sum2 = 0;
    	 
    	 for(int i: ar) {
    		 sum2 += i;
    	 }
    	 
    	 return (sum1 - sum2);
     }
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,6,7,8,9};
		
		//findMissing2(arr);
		
		System.out.println(findMissing2(arr));
	}

}
