package mandatoryHomeWork.Week13.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FlipImage_LC_832 {
	
	// https://leetcode.com/problems/flipping-an-image/
	
	/*
	 * Psuedo code
	 * traverse thur the image in first for loop for row lenght 
	 *   traverse thru image in second loop for col lengtn 
	 *     add image[i][j] to an list 
	 *     traverse thru the list usogn 2 pointeres , reverse the values and add an int[] of same size image 
	 * finally rrturn result int array
	 */
	
public int[][] flipAndInvertImage(int[][] image) { // took 2 ms 
	
	int[][] result = new int[image.length][image.length] ;
	
	List<Integer> list = new ArrayList<Integer>();
	
	for (int i = 0; i < image.length; i++) {
		
		for (int j = 0; j < image[i].length; j++) {			
			list.add(image[i][j]);			
		}
		//System.out.println("-------------------------------------------"); 
		//System.out.println(list); 
		int k =0;
		for (int j2 = image[i].length-1; j2 >=0; j2--) {
			//result[i][j2] = list.get(k) ;
			if(list.get(k) ==1 ) result[i][j2] =0;
			else result[i][j2] =1;
			k++;
		}	
		//System.out.println("-------------------------------------------"); 
		//System.out.println(Arrays.deepToString(result)); 
		list.clear();
	}		
	return result;        
    }


@Test
public void test1()
{ 
	int[][] image = {{1,1,0},{1,0,1},{0,0,0}}	;
	int[][] flipAndInvertImage = flipAndInvertImage(image) ;
	System.out.println(Arrays.deepToString(flipAndInvertImage)); 	
}


@Test
public void test2()
{ 
	int[][] image = {{1,1,0,0},{1,0,0,1	},{0,1,1,1} , {1,0,1,0} }	;
	int[][] flipAndInvertImage = flipAndInvertImage(image) ;
	System.out.println(Arrays.deepToString(flipAndInvertImage)); 
	
}
}
