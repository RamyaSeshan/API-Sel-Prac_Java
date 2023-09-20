package mandatoryHomeWork.Week8.Day2;

import org.junit.Test;

public class LC_1343 {
	//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	
public int numOfSubarrays( int[] arr, int k, int threshold  ) 
    {
	
	int avg = 0, pointer = 0, currentSum = 0 , cnt=0 ;
	
	while (pointer <k )
	{
		currentSum += arr[pointer++] ;
	}
	
	while( pointer < arr.length)
	{
		avg = currentSum /k;
		if (avg >= threshold) cnt++ ;
		
		currentSum = currentSum+arr[pointer];
		currentSum = currentSum- arr[pointer-k];
		pointer ++;	
	}
	
	avg = currentSum /k;
	if (avg >= threshold) cnt++ ;		
	return cnt;
    }


@Test
public void Test1()
{
	int[] arr = {2,2,2,2,5,5,5,8} ; int  k = 3 ;int  threshold = 4;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}

@Test
public void Test2()
{
	int[] arr = {11,13,17,23,29,31,7,5,2,3} ; int  k = 3 ;int  threshold = 5;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}


@Test
public void Test3()
{
	int[] arr = {11,13,17,23,29,31,7,5,2,3} ; int  k = 1 ;int  threshold = 0;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}

@Test
public void Test4()
{
	int[] arr = {11,13,17,23,29,31,7,5,2,3} ; int  k = 10 ;int  threshold = 0;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}

@Test
public void Test5()
{
	int[] arr = {11,13,17,23,29,31,7,5,2,3} ; int  k = 10 ;int  threshold = 15;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}

@Test
public void Test6()
{
	int[] arr = {11,13,17,23,29,31,7,5,2,3} ; int  k = 10 ;int  threshold = 14;
	int numOfSubarrays = numOfSubarrays(arr,k,threshold);
	System.out.println(numOfSubarrays);
}

}
