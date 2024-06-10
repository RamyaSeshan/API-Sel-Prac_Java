package mandatoryHomeWork.Week13.Day2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Partition_labels_LC_763 {
	
	// https://leetcode.com/problems/partition-labels/
	
	/*
	 * Psuedo code 
	 * 
	 * add the last occurance of all alphapets in an int array
	 * have variabe start =0 , end =0 intially
	 * declare an list result
	 * iterate thru the input string 
	 *   --> take end as Math.max (end , A[s.charAt[i] - 'a' ] )
	 *   -- > if (i == max  ) then add to list result end-start +1 , increment start bt end +1 
	 *  
	 *  
	 *  finally return list result 
	 *   -
	 */
public List<Integer> partitionLabels(String s) {
	
	List<Integer> list = new ArrayList<Integer>();	
	if (s.length() ==0 || s== null)  return list ;
	
	int[] A = new int[26] ;
	
	for (int i = 0; i < s.length(); i++)
	{
		A[s.charAt(i) - 'a'] = i;
	}
	
	int start = 0 , end = 0;
	
	for (int i = 0; i < s.length(); i++) 
	{
		end = Math.max(end, A[s.charAt(i) - 'a']) ;
		if(end == i )
		{
			list.add(end-start+1) ;
			start = end + 1 ;
		}
	}	
	return list;    
    }


@Test
public void test1()
{
	String s = "ababcbacadefegdehijhklij" ;
	List<Integer> partitionLabels = partitionLabels( s) ;
	System.out.println(partitionLabels);	
}

@Test
public void test2()
{
	String s = "eccbbbbdec" ;
	List<Integer> partitionLabels = partitionLabels( s) ;
	System.out.println(partitionLabels);	
}

}
