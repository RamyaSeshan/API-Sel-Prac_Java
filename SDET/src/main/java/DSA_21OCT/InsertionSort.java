package DSA_21OCT;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	
	public int[]  sort_Insertion(int[] A )
	{
	int temp ;
	
	for (int i = 1; i < A.length  ; i++) { // 4,2,1,5,6,  2 4 1 5 6  1 4 2 5 6    1 2 4 5 6 
		
		for (int j = 0; j <=i ; j++) {
		if(A[i] <A[j])
		{
			temp =A[i] ;
			A[i] = A[j];
			A[j] = temp;			
		}				
			}
	}
	return A;
	}
	
@Test
public void Test1()
{
	int[] A = { 4,2,1,5,6};
	int[] sort_Insertion = sort_Insertion(A ) ;
	System.out.println(Arrays.toString( sort_Insertion));
	}

@Test
public void Test2()
{
	int[] A = { 10,4,6,2,1,3,7,7};  // 4,10,6,2,1,3,7,7  4,6,10,2,1,2,7,7,  2,4,6,10,1,2,7,7, 1,2,4,6,10,7,7,
	int[] sort_Insertion = sort_Insertion(A ) ;
	System.out.println(Arrays.toString( sort_Insertion));
	}


@Test
public void Test3()
{
	int[] A = { 10,4,6,2,8,3,7,12,1};  // 4,10,6,2,1,3,7,7  4,6,10,2,1,2,7,7,  2,4,6,10,1,2,7,7, 1,2,4,6,10,7,7,
	int[] sort_Insertion = sort_Insertion(A ) ;
	System.out.println(Arrays.toString( sort_Insertion));
	}

@Test
public void Test4()
{
	int[] A = { 2,0,2,1,1,0};  // 4,10,6,2,1,3,7,7  4,6,10,2,1,2,7,7,  2,4,6,10,1,2,7,7, 1,2,4,6,10,7,7,
	int[] sort_Insertion = sort_Insertion(A ) ;
	System.out.println(Arrays.toString( sort_Insertion));
	}


@Test
public void Test5()
{
	int[] A = {2,0,1};  // 4,10,6,2,1,3,7,7  4,6,10,2,1,2,7,7,  2,4,6,10,1,2,7,7, 1,2,4,6,10,7,7,
	int[] sort_Insertion = sort_Insertion(A ) ;
	System.out.println(Arrays.toString( sort_Insertion));
	}



}
