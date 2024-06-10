package WK7.CW;

public class ArrayAdd {
	
 /*PROBLEM STATEMENT 
  * Given two array, arr1, and arr2    
  *  Subtract the sum of arr2 with arr1 respective index value, and also the
  *   sum should exclude the respective index in arr2 arr1 = {1,2,3,4} , arr2 = {2,3,4,5}          
  *   output = {      3+4+5-1,      2+4+5-2,      2+3+5-3,      2+3+4-4           */

	
	public static int[] AddArrVAl(int[] A , int[] B)
	{
		 //     arr1 = {1,2,3,4} , arr2 = {2,3,4,5} 
		for (int i = 0; i < A.length; i++) {
			int sum=0;
			for (int j = 0; j < B.length; j++) {				
			 if (i != j)
			 { sum = sum + B[j]; }	 		
		}
			 sum = sum -A[i];
			 A[i] = sum;
	}
		return A;
	}

	public static void main(String[] args) {
		int[] A =  {1,2,3,4}; // 11,9,7,5
		int [] B = {2,3,4,5} ;
		int[] addArrVAl = AddArrVAl(A , B);
		
		for (int i = 0; i < addArrVAl.length; i++) {
			System.out.println(addArrVAl[i] +"--");
		}
	}

}
