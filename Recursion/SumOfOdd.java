public class SumOfOdd {
   static int sumOfOdd(int n) {
       if(n == 1)
         return n;

         if(n % 2 !=0) {  //if odd numbers then add and do recursive call for another numbers
						return (n + sumOfOdd(--n));
					}else {
						return (sumOfOdd(--n)); //if not jsut do recursive call fro another number
					}
						
			}

     public static void main(String[] args) {
         System.out.println("sum of odd : "+ sumOfOdd(6));
     }
}
