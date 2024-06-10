package DSA_CW;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCopyAndClone {

	public static void main(String[] args) {
     
		int[] A = new int[] {1,2,3,4,5};
		int [] B = Arrays.copyOf(A, A.length);
		B[1] = 100;
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		ArrayList C = new ArrayList(Arrays.asList(new Integer[] {5,6,7,8,9,0}));
		ArrayList D = (ArrayList) C.clone();
		
		D.set(1, 200);
		
		System.out.println(C);
		System.out.println(D);
	}

}
