package WK7.CW;

import org.junit.Test;

import junit.framework.Assert;

public class SortArray {
	
	public static void SortArr(int[] N)  // 4,2,3,6,7,  2,4,3,6,7,  2,3,4,6,7,
	{
		int temp =0;
		
		for (int i = 0; i < N.length-1; i++) {   //  7,2,10,15,1  2 7 10 15 1  1 7 10 15 2  1 2 10 15  7 
			 for (int j = i+1; j < N.length; j++) {
				 if(N[i] > N[j]) { temp =N[i];
					N[i] = N[j];
					N[j] = temp;					
					} 
			}			
				}
		for (int j = 0; j < N.length; j++) {
			System.out.print(N[j] +"");		
		}
			}

			
			 public static void main(String[] args) {
			  
			 int[] N = {4,2,3,6,7}; int[] N1 = {7,2,10,15,1}; SortArr(N1); }
			 


	
}

