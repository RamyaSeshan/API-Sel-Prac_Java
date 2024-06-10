package DSA_ClassI;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
/*
 * 3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0 -- Brute Force 

5. Derive Pseudo code in paper (for the best chosen approach)

a.Declare 2 int var --> int start =0 ; next = start+1 ;  //0,1,0,3,12   10  03 12  13 00 12   13 12 00
  
b.Iterate thru while loop -- > while (start < A.lenght && next < A.lenght) 
  if(start ==0 && next ==0) then 
    --> if (next !=   A.lenght-1) then next++
        -->else break;
 else if ((start !=0 && next ==0)  ||  (start !=0 && next !=0)  ) 
   --> if (next != A.lenght-1) then start ++ next ++
        -->else break;
 else if(start ==0 && next !=0) 
   --> temp = A[start] A[start ] = A[next] A[next] = temp   
        if (next != A.lenght-1) then start ++ next ++
        --> else break;
c.After while loop , return A

6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes
 */

import org.junit.Test;

public class MoveZeros {
	
	public int[] moveZero1(int[] A)	{
	 
		int start =0; int next = start+1;int temp; 
		
		while (start < A.length && next < A.length) 
		{
			if(A[start]==0 && A[next] ==0) 
			{ 
		      if (next !=A.length-1) { next++ ;}
		      else break;
			}
			
			else if ((A[start] !=0 && A[next] ==0)  ||  (A[start] !=0 && A[next] !=0)  )
			{
			 if (next != A.length-1) { start++  ; next ++ ;}
				else break;
			}
			
			else if(A[start] ==0 && A[next] !=0)  
			{ 
			  temp = A[start];
			  A[start ] = A[next] ;
			  A[next] = temp ; 
				if (next != A.length-1) { start++;  next++;}
			    else break;
			}
		}
		return A ;
}

	
	
	public int[] moveZero(int[] A)	{
		 
		int start =0; int next = start+1;int temp; 
		
		while (start < A.length && next < A.length) 
		{
			if(A[start]==0 && A[next] ==0) 
			{ 
		     next++ ;		    
			}
			
			else if ((A[start] !=0 && A[next] ==0)  ||  (A[start] !=0 && A[next] !=0)  )
			{
			 start++  ; next ++ ;			
			}
			
			else if(A[start] ==0 && A[next] !=0)  
			{ 
			  temp = A[start];
			  A[start ] = A[next] ;
			  A[next] = temp ; 
			   start++;  next++;			
			}
		}
		return A ;
}

	@Test
public void Test1()
{
	int[] A = {0,1,0,3,12 };
	int[] moveZero = moveZero(A) ;
	
	for (int i : moveZero) {
		System.out.println(i + " ");
	}
	System.out.println( "-------------------");
}

@Test
public void Test2()
{
	int[] A = {0,0,5,3,12 };
	int[] moveZero = moveZero(A) ;
	
	for (int i : moveZero) {
		System.out.println(i + " ");
	}
	System.out.println( "-------------------");
}

@Test
public void Test3()
{
	int[] A = {0};
	int[] moveZero = moveZero(A) ;
	
	for (int i : moveZero) {
		System.out.println(i + " ");
	}
	System.out.println( "-------------------");
}

@Test
public void Test4()
{
	int[] A = {0,0};
	int[] moveZero = moveZero(A) ;
	
	for (int i : moveZero) {
		System.out.println(i + " ");
	}
	System.out.println( "-------------------");
}
	
}
