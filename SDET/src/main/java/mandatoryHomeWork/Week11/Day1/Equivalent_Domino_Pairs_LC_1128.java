package mandatoryHomeWork.Week11.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
// https://leetcode.com/problems/number-of-equivalent-domino-pairs/

public class Equivalent_Domino_Pairs_LC_1128 {
	
public int numEquivDominoPairs(int[][] dominoes) {
	
	Map<List<Integer>, Integer> map = new HashMap<List<Integer> , Integer>() ;
	int count = 1;
	
 for (int[] value : dominoes) {	 
	 Arrays.sort(value);	
	 //System.out.println(Arrays.toString(value));
   } 
 
 for (int i = 0; i < dominoes.length; i++) 
 {	 
	 List<Integer> list = new ArrayList<Integer>()	;
	 
	 for (int j = 0; j < 2; j++) {
		 list.add(dominoes[i][j]) ;		
	  } 
	// System.out.println(list);
	 
	 if(map.containsKey(list))
	 {
	  count ++;
	  map.put(list, map.getOrDefault(list, 1) +1) ;	
	 }else  map.put(list, 0) ;	
		 
  }
return count;
 
}
	



@Test
public void Test1()
{
	int[][] dominoes =  {{1,2},{2,1},{3,4},{5,6} } ;
	int numEquivDominoPairs = numEquivDominoPairs( dominoes);
	System.out.println(numEquivDominoPairs);
}

@Test
public void Test2()
{
	int[][] dominoes =  {{1,2},{1,2},{1,1},{1,2} ,{2,2} } ;
	int numEquivDominoPairs = numEquivDominoPairs( dominoes);
	System.out.println(numEquivDominoPairs);
}


@Test
public void Test3()
{
	int[][] dominoes =  {{1,2},{1,2},{1,2},{1,2} ,{2,2} } ;
	int numEquivDominoPairs = numEquivDominoPairs( dominoes);
	System.out.println(numEquivDominoPairs);
}

}
