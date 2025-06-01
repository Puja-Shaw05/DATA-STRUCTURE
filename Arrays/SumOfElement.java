class SumOfElement 
{
   static int sumOfArraysElement(int [] arr) 
   {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
         { 
             sum += arr[i];
          }
        return sum;
    }
  public static void main(String [] args)
  {
     int arr[] = {1,5,8,4,9,3,75,43,87,92};
     System.out.println("Sum of elements : "+ sumOfArraysElement(arr));
  }
}
