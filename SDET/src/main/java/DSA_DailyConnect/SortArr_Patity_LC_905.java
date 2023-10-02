package DSA_DailyConnect;

import org.junit.Test;

//// Time Complexity O[N] Space Complexity O[N] -- as it depends on the lenght of input array
 //https://leetcode.com/problems/sort-array-by-parity/description/

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] nums  ; output  int[] result

2.Frame Test data (valid, invalid, complex and edge cases)

nums ={ 1,2,3,4,5}
 out -- {2,4,1,3,5 }

nums ={ 1,3,7,9}
 out -- {1,3,7,9}
 
nums ={ 8,16,2,12}
 out -- { 8,16,2,12
 
nums ={ 1}
 out -- {1}

nums ={2}
 out -- {2}

3.Do you know the Solution?
yes , 2 Pointers 

4.Do you have any alternate approaches? (Thing of alternate approaches)
Yes -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)

P1 %2  != 0  && P2 !2 == 0  swap inc & dec
P1 %2  != 0  && P2 %2!= 0  dec P2
P1 %2  == 0  && P2 %2 != 0 inc & dec  //nums ={ 1,2,3,4,5}   4 2 3 1 5    { 1,3,7,9}   { 8,16,2,12}

1.declare int var  start = 0 , next = nums.lenght-1 , int temp =0
1a. if the lenght of nums ==1 , retrun nums  [ if (nums.lenght == 1 ) return nums )]

2.Iterate while start < = end  [ while (start < = end) && (end >=0 ) ]  

if(nums[start] %2 !=0 && nums[next] %2 == 0
 swap the 2 values -- temp = nums[start] ;  nums[start] = nums[next] , nums[next] = temp
  inc start , dec next -- [ start ++ , next -- ]

else if(nums[start] %2  ) !=0 && nums[next] %2 != 0
  next --

else if(nums[start] %2  ) ==0 && nums[next] %2 != 0
     inc start , dec next -- [ start ++ , next -- ]

if(nums[start] %2  ) ==0 && nums[next] %2 == 0
  next --

return nums
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

=============


 */

public class SortArr_Patity_LC_905 {
	
	// BY 2 Pointers -- reduced code 
	 public int[] sortArrayByParity_lesscode(int[] nums) {  // 0,1,2 
		
		 if (nums.length == 1 ) return nums; 
		 int start = 0 ; int next = nums.length-1 ; int temp =0 ;
		
		 
		 while (start <next )
		 {
			if(nums[start]%2==0)
			{
				start++;
			}
			else if(nums[next]%2!=0)
			{
				next--;
			}else 
			{
				temp = nums[start];
				nums[start++] = nums[next];
				nums[next--] =temp;
				//next--;
				//start++;
			}
		 }		
		 return nums; 
	    }

	// BY 2 Pointers 
	 public int[] sortArrayByParity_1(int[] nums) {  
		  // Time Complexity O[N] Space Complexity O[N] -- as it depends on the lenght of input array
			
		 int start = 0 ; int next = nums.length-1 ; int temp =0 ;  // Constant 
		 if (nums.length == 1 ) return nums;   // Constant 
		 
		 while (start <= next && next >=0 ) // O [N] 
		 {
			 if((nums[start] %2 !=0 ) && nums[next] %2 == 0)
             {
			 temp = nums[start] ; 
			 nums[start] = nums[next] ;
			 nums[next] = temp ;
		     start ++ ; next -- ;			 
		    }
			 else if (nums[start] %2!=0 && nums[next] %2 != 0)
			 {
				 next -- ;	
			 }
			 else if ((nums[start] %2==0 && nums[next] %2 != 0))
			 {
				 start ++ ; next -- ;
			 }
			 else if (nums[start] %2==0 && nums[next] %2 == 0)  // { 2,4,6,8,12}
                   {
				start++;
                   }
		 }		
		 return nums; 
	    }

	 // onePOinter 
	 /*
	  * 
5. Derive Pseudo code in paper (for the best chosen approach)

a.declare a int temp , index
b.iterate thur for loop till less than nums.lenght  //{ 1,3,2,3,4,5,8}  2,3,1,3,4,5,8  2,4,1,3,3,5,8 
  --> check if nums[i] %2 !=0 
     --> then assign nums[i] to temp [ temp =nums[i] ]  // temp = 3
     -->assign i to index  [ index =i ] // index =1
     -->i++; //4
     -->iterate thru while loop till nums[i] %2 !=0 && i <= nums.lenght -1
        -- > i++;
     -->nums[index]  = nums[i] //nums[0] =2
     -->nums[i] = temp; //1
     --> i = index+1; //1
	  */
	 
	 public int[] sortArrayByParity(int[] nums) { // 3,1,2,4   2,1,3,4
		 if (nums.length == 1 ) return nums; 
		 int temp=0, index =0, i=0;
		 
		 while (i < nums.length )
		 {			
			 if(nums[i]%2 !=0)
			 {
			    temp =nums[i]; // 1
			    index =i; //1
			    
				while( i <= nums.length-1 && nums[i] %2 !=0  ) 
				 {
					if( i !=nums.length-1 )  { i=i+1; }
					else break;
				 }
			
				nums[index]  = nums[i];
				nums[i] = temp;	
				i = index;
			    }	
			 i++;
		 } 		  
		 return nums;
	 }
	 
@Test
public void Test1()
{
	int[] nums ={ 1,2,3,4,5};
	int[] sortArrayByParity = sortArrayByParity(nums);
for (int i = 0; i < sortArrayByParity.length; i++) {
	System.out.println(sortArrayByParity[i]);
    }

} 

@Test
public void Test2()
{
	int[] nums ={ 0};
	int[] sortArrayByParity = sortArrayByParity(nums);
for (int i = 0; i < sortArrayByParity.length; i++) {
	System.out.println(sortArrayByParity[i]);
    }
}

@Test
public void Test3()
{
	int[] nums ={ 3,1,2,4};  //2,1,3,4
	int[] sortArrayByParity = sortArrayByParity(nums);
for (int i = 0; i < sortArrayByParity.length; i++) {
	System.out.println(sortArrayByParity[i]);
    }
}

@Test
	 public void Test4()
	 {
	 	int[] nums ={0,1,2};
	 	int[] sortArrayByParity = sortArrayByParity(nums);
	 for (int i = 0; i < sortArrayByParity.length; i++) {
	 	System.out.println(sortArrayByParity[i]);
	     }
	 } 

}
