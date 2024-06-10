package SEP10_CWSession;

import org.junit.Test;

/*
 * PSUEDO CODE 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes 
int[] , output int 

2.Frame Test data (valid, invalid, complex and edge cases)
Input: a[] = {1,2,3,4,5} k=1 U =1 L =3
Output: -1-1+0+1+1 =0 

Input: a[] = {1,4,3,4,6} k=2 U =1 L =4 
Output: 1+1+1+1


Input: a[] = {1,1,2,3,2} k=2 U =1 L =4 
Output: 1+1+1+1

3.Do you know the Solution?
yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
N0

5. Derive Pseudo code in paper (for the best chosen approach)
Yes   Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3   
declare int cnt ,sum
Iterate till lenght < than input array lenght [ i < input.lenght -k ] for (int i=0 ; i <input.lenght -k ;i++)
 Iterate from j=0 till less than j+k  for(int j=i; j < j+k ; j++)
      add the values sum = sum+input[j]
         if  sum > U cnt = cnt = cnt+1
         if sum < L cnt = cnt  = cnt -1
            
return cnt 
     
6. Dry run the pseudo code with all test data from step #2 --Yes

7.Write the code on notepad --Yes

8. Dry run the code with all test data from step #2  --Yes 

9. Write code on IDE (remember to add comments and practice coding standards) --yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE --Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9) --yes

 */
public class Calories {
	
	public int caloriChk(int[] input , int k , int u, int l)
	{
		
		int cnt =0 , sum=0;
		for (int i = 0; i <= input.length-k; i++) {  //Input: calories = [1,2,3,4,5], k = 2, lower = 3, upper = 3 
			for (int j = i; j < i+k; j++) {
				 sum = sum+input[j];				 
			}
			
			if(sum < l) { cnt = cnt-1;}
			else if (sum >u ) { cnt = cnt+1;}
			sum=0;
		} 
			return cnt;
		
	}

	
	@Test
	public void caloriChk()
	{
		int[] input = {1,2,3,4,5};
		 int k =1;
		 int u =3 ;int l=3;
		 
		  int caloriChk = caloriChk(input ,  k ,  u,  l);
		 System.out.println(caloriChk);
	}
	
	@Test
	public void caloriChk1()
	{
		int[] input = {3,2};
		 int k =2;
		 int u =0 ;int l=1;
		 
		  int caloriChk = caloriChk(input ,  k ,  u,  l);
		 System.out.println(caloriChk);
	}
	
	@Test
	public void caloriChk2()
	{
		int[] input = {6,5,0,0};  
		 int k =2;
		 int u =5 ;int l=1;  
		 
		  int caloriChk = caloriChk(input ,  k ,  u,  l);
		 System.out.println(caloriChk);
	}
}
