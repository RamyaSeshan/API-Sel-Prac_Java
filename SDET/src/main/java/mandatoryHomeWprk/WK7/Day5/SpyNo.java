package mandatoryHomeWprk.WK7.Day5;

import org.junit.Test;

import junit.framework.Assert;

public class SpyNo {
	//  "Find  if no is spy number, A number whose sum of the digits of is equal to the product of its digits 		is called syp number "

	public static boolean ChkSpy(int N) // 132 1111 1 1110
	{
		int Sum = 0;
		int Prod = 0;
		int Q, R = 0;
		if (N < 10) {
			return true;
		}
		while (N > 0) {
			Q = N % 10;
			R = N / 10;
			Sum = Sum + Q;
			Prod = Prod * Q;

		}

		// return Sum == Prod;
		
		 if (Sum == Prod) {return true ;} else return false;
		 
		 
		 
	}

	public static void main(String[] args)

	{
		System.out.println(ChkSpy(132));
	}
	/*
	 * @Test public void test1() { //int N = 132; int N = 141;
	 * System.out.println(ChkSpy(132)); Assert.assertEquals(true, ChkSpy(132));
	 * 
	 * }
	 */

	/*
	 * C
	 * 
	 * I . Input -- Int N II . Out Put -- Boolean III .Know Solution -- Yes IV .
	 * Alternate SOl -- NO V .Test Data : 132 -- Pos ; 111 - Neg ; 0 -- Edge PSUEDO
	 * Code dec int sum =0 , int prod =1 dec int input Iterate in while Loop wile N
	 * > 0 Q = N %10 ; R = N / 10 ; Sum = Sum +Q ; Prod = Prod * Q; N = R ;
	 * 
	 * check if Sum == prod , then return true else false
	 * 
	 * 
	 */
}
