package WKVHW;

public class AlternatingDigitSum {
	
	//https://leetcode.com/problems/alternating-digit-sum/description/
	
	
	public static int chk(int N)  
	{
		
		String input = N+"";
		int max =0;
		int temp =0;
		int maxindex =0;
		int res =0;
		
		for (int i = 0; i <= input.length()-1; i++) {
			
			temp = Integer.parseInt(input.charAt(i)+""); 
			if(temp > max) 
			{max =temp;
			maxindex =i;}			
		}
		
		
		for (int i = 0; i <=  input.length()-1; i++) {  //121411   
			
		if(i <= maxindex)
			{
				if((maxindex-i) ==0   || ((maxindex-i)%2)  ==0   )
				{
					res = res + Integer.parseInt(input.charAt(i)+"");
				}
				else if(((maxindex-i)%2)  !=0 )
				{
					res = res - Integer.parseInt(input.charAt(i)+"");
				}
			}
		else if (i > maxindex)
		{
			if(  ((i- maxindex)%2)  ==0 )
			{
				res = res + Integer.parseInt(input.charAt(i)+"");
			}else if (  ((i- maxindex)%2)  !=0 )
			{
				res = res - Integer.parseInt(input.charAt(i)+"");
			}

		}	
		
		}
		
		
		return res;
		
	}

	public static void main(String[] args) {  //5-2+1 ==4 
		
		int chk = chk(886996);
		System.out.println(chk);
		/*
		 * PSUEDO CODE    312813  -3 1 -2 8 -1 3   282 12814
		 * input int
		 * output int 
		 * int max =0;
		 * int temp =0;
		 * int maxindex =0;
		 * int res =0;
		 * convert int to String 
		 * in for loop till String.lenght-1
		 *   get charAT(i) , convert to int 
		 *   if temp > max , max = temp .. 
		 *   like this get the siginificant no and its index 
		 *   
		 * in second for loop till String.lenght-1
		 *  if (index i <= maxindex)
		 *     if (maxindex-index)== 0 ||  (maxindex-index)!2 !=0 
		 *          res = res-Integer.parseint(charAT(i)+"");
		 *      elseif (maxindex-index)!2 ==0 
		 *       res = res+Integer.parseint(charAT(i)+"");
		 *  elseif (index i > maxindex)
		 *     if (  (index-maxindex)%2 !=0 )
		 *          res = res-Integer.parseint(charAT(i)+"");
		 *      elseif(index-maxindex)%2 ==0 )
		 *          res = res+Integer.parseint(charAT(i)+"");
		 */

	}

}
