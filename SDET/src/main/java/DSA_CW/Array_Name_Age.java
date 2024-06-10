package DSA_CW;

import java.util.Arrays;

public class Array_Name_Age {
	
	

	public static void main(String[] args) {
	 
		int[] Age_M = {1,2,3,4,5,6,7,8,9,0};
		String[] Name_M = {"A","b","c","d","e","f","g","h","i" ,"j"};
		
		Employee[] A = new Employee[10];
		
		for (int i = 0; i < A.length; i++) {
		  A[i] = new Employee(Name_M[i] ,Age_M[i]) ;				
			}	
		
			/*
			 * for (Employee employee : A) { System.out.println(employee.Name+ "-----" +
			 * employee.Age ); }
			 */
		
		System.out.println(Arrays.toString(A));
		}
		
	}
