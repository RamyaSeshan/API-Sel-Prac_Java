package Interview_Practise;

import org.junit.Test;

public class SpyNO_WK7_Day5
{
	//"Find  if no is spy number, A number whose sum of the digits of is equal to the product of its digits 		is called syp number "

	@Test
	public void test1()
	{
		//int num = 121 ;  // 4 , 
		int num = 132 ;  // 4 , 
		Boolean spyNo = spyNo(num) ;
		System.out.println(" the result is "  +spyNo);
	}

	public Boolean spyNo(int num) {

		if (num < 10) return true;
		int quo , rem , sum = 0 , prod = 1;

		while (num > 0) 
		{
			quo = num %10;
			rem = num /10 ;
			System.out.println(" quo is   " +quo);
			System.out.println(" rem is   " +rem);
			sum = sum + quo ;
			prod = prod * quo ;
			num = rem ;			
		}

		if (sum == prod ) return true ;
		else return false;		
	}


}
