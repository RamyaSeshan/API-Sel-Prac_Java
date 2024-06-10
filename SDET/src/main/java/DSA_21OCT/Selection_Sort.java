package DSA_21OCT;

import java.util.Arrays;

import org.junit.Test;

public class Selection_Sort {

	
	public int[] sort_Custom(int[] A )
	{
	int temp , tempIndex =0  , minValue =  Integer.MAX_VALUE  ;
	
	for (int i = 0; i < A.length -1 ; i++) { // 4,2,1,5,6,
		
		for (int j = 0; j < A.length; j++) {
		if(A[i] > A[j])
		{
			minValue = Math.min(minValue, A[j] ) ;
			if ( minValue == A[j] ) tempIndex = j;	
		}					
		}
		if (minValue !=  Integer.MAX_VALUE ) 
		{
			temp = A[i]  ;
			A[i] = A[tempIndex] ;
			A[tempIndex] = A[i] ;
		}
		minValue =  Integer.MAX_VALUE  ;
	}
	return A;
		
	}
	
	@Test
	public void Test1()
	{
		int[] A = { 4,2,1,5,6};
		int[] sort_Insertion = sort_Custom(A ) ;
		System.out.println(Arrays.toString( sort_Insertion));
		}
}
