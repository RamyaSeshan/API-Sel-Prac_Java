package mandatoryHomeWork.Week7.Day6;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SummaryRange_2Point_LC228 {
	
    public List<String> summaryRanges(int[] nums) { // nums = [0,1,2,4,5,7]
    	
    	 List<String> list = new ArrayList<String> ();
    	 int temp ;
         if (nums.length ==0 ) return list;
         else 
         { temp = nums[0] ;}
         
         int cnt=0 ; // 0 ,4 ,7
         
    	for (int i=0 ; i < nums.length ; i ++ )
    	{
    		if (i ==nums.length -1 ||  nums[i+1] != nums[i] +1 )
    		{
    			if (cnt ==0)
    			{
    				list.add(nums[i]+"");
    			}
    			else  {list.add(temp+"->"+nums[i]) ; } 
    			if ( i !=nums.length -1 ) {temp = nums[i+1] ; cnt =0; }
    		}
    		else {cnt++ ;}  		 
    	    }
    	 return list;
}
    
    
    @Test
    public void Test1()
    {  int [] nums = {0,1,2,4,5,7 };
      List<String> summaryRanges = summaryRanges(nums);
      System.out.println(summaryRanges);      
    }
    

    @Test
    public void Test2()
    {  int [] nums = {0,2,3,4,6,8,9};
      List<String> summaryRanges = summaryRanges(nums);
      System.out.println(summaryRanges);      
    }
    

    @Test
    public void Test3()
    {  int [] nums = {0,1,2,3,5,7,8,9};
      List<String> summaryRanges = summaryRanges(nums);
      System.out.println(summaryRanges);      
    }
    

    @Test
    public void Test4()
    {  int [] nums = { };
      List<String> summaryRanges = summaryRanges(nums);
      System.out.println(summaryRanges);      
    }
}
