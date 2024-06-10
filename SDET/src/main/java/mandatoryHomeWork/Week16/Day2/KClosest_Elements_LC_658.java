package mandatoryHomeWork.Week16.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KClosest_Elements_LC_658 {
	
	// https://leetcode.com/problems/find-k-closest-elements/
	
	/*
	 * Psuedo code
	 * 
	 */

	
	 public List<Integer> findClosestElements1(int[] arr, int k, int x) // dummy code --- ignore 
	    {			
		 List<Integer> list = new  ArrayList<Integer>();
		 int temp;
		 
		 for (int i = 0; i < arr.length; i++) 
		 
		  {
			temp = arr[i] - x ;
			arr[i] = temp;
		  }
		
		 for (int i = 0; i < k; i++) {
			list.add(arr[i] +x);
		  }		 
		 return list;	        
	    }

	 
	 public List<Integer> findClosestElements(int[] arr, int k, int x)
	 {		
		 int left =0 , mid ;
		 int right = arr.length - k ;
		 
		 while(left < right) 
		 {
			 mid = (left +right ) /2 ;
			 if(x - arr[mid]  > arr[mid+k] -x ) { left = mid + 1; }
			 else { right = mid ; }			 
		 }
		 
		 List<Integer> list = new  ArrayList<Integer>();
		 for (int i = left; i < left+k ; i++) {
			list.add(arr[i] );
			}
		 
		 return list ;
	 }
	 
	 
	 
@Test
public void test1()
{
	int[] arr = {1,2,3,4,5} ;
	int  k = 4, x = 3 ;
	List<Integer> findClosestElements = findClosestElements(arr,  k,  x) ;
	System.out.println(findClosestElements);
	}


@Test
public void test2	()
{
	int[] arr = {1,2,3,4,5} ;
	int  k = 4, x = -1 ;
	List<Integer> findClosestElements = findClosestElements(arr,  k,  x) ;
	System.out.println(findClosestElements);
	}

}
