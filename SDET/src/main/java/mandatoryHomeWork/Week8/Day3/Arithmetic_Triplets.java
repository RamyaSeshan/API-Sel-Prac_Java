package mandatoryHomeWork.Week8.Day3;

import org.junit.Test;
//https://leetcode.com/problems/number-of-arithmetic-triplets/submissions/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] nums, int diff| output int

2.Frame Test data (valid, invalid, complex and edge cases)
Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2

Input: nums = [4,5,6,7,8,9], diff = 2
Output: 2


3.Do you know the Solution?
yes , 2 pointers

4.Do you have any alternate approaches? (Thing of alternate approaches)
No

5. Derive Pseudo code in paper (for the best chosen approach)  //xyzzaz"

declare 2 pointers ; P1 =P2 =0 , P3
Itetare thur while loop till less than nums.lenght [ While  (P1 < nums.lenght-1 )
   -- > intiate P2 = P1+1 
   --> check if P1+diff < P2  , then increment P2 [ if (P1+diff < P2) { P2++;}
   -->else check if P1+diff > P2 , then increment P1 [ else if (P1+diff > P2) { P1++;}
   --> else check if P1+diff ==P2  ,then iterate thru while loop   [ else if (P1+diff == P2) 
      --> while (P2 < nums.lenght-1 )
           -- > intiate P3 = P2+1
           --> check if P2+diff < P3  , then increment P3 [ if (P2+diff < P3) { P3++;}
            -->else check if P2+diff > P3 , then increment P2[ else if (P2+diff > P3) { P2++;}


7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes


 */
  // Time & Space Complexity O[nxm]
public class Arithmetic_Triplets {
	
public int arithmeticTriplets(int[] nums, int diff) {
        int P1 = 0 ,P3 , i ,count = 0 ;
        int P2 = P1+1 ;
       
        while (P1 < nums.length-1 && P2 < nums.length )   
        {
            if (nums[P1]+diff < nums[P2]) 
                { 
            	P1++;
            	if(P1==P2 ) { P2++;} 
            	continue ;}      
          
        	else if (nums[P1]+diff > nums[P2])  {P2++; continue ;}
        	
        	else if (nums[P1]+diff ==nums[P2])   
            	{        		   
        		    i = P2 ;
        		    P3 = P2+1; // p3 =5
        		    while (P2 < nums.length-1 && P3 <nums.length) 
        		       {        		    	
        		    	if (nums[P2] + diff < nums[P3]) 
        		    	{ break;
        		    	}
        		    	else if(nums[P2] + diff > nums[P3])         		    		
        		    	   {
        		    		{P3 ++;continue ;}        		    	
        		    		}  // p3=5
        		    	
        		    	else if (nums[P2] + diff ==nums[P3]) {count++; break;}
			}
        	     }
            
             P1 = P1+1;
             P2 =P1+1;            
        }        
        
        return count;
        
    }

@Test
public void Test1()
{
	int[] nums = {0,1,4,6,7,10} ; int diff = 3 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}

@Test
public void Test2()
{
	int[] nums = {4,5,6,7,8,9} ; int diff = 2 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}

@Test
public void Test3()
{
	int[] nums = {4,5,6} ; int diff = 1 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}


@Test
public void Test4()
{
	int[] nums = {4,5,6} ; int diff = 2 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}

@Test
public void Test5()
{
	int[] nums = {4,6,7,8} ; int diff = 1 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}

@Test
public void Test6()
{
	int[] nums = {2,4,5,7,8} ; int diff = 1 ;
	int arithmeticTriplets = arithmeticTriplets( nums, diff);
	System.out.println(arithmeticTriplets);
}
}
