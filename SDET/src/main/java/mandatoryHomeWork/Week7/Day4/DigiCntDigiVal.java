package mandatoryHomeWork.Week7.Day4;

import org.junit.Test;

public class DigiCntDigiVal {

	
public boolean digitCount(String num) {
	
	int[] chararr = new int[num.length()];
	String charAt ;
	int parseInt;
	int cnt =0; int total =0;
	
	for (int i = 0; i < num.length(); i++)  
	{	
	 parseInt = Integer.parseInt(num.charAt(i)+"");
	 chararr[i] =parseInt;	 
	}
	
	for (int i = 0; i < chararr.length; i++) {
		cnt = chararr[i];
		
		for (int j = 0; j < chararr.length; j++) 
		{
			if(i == chararr[j]) { total++;}		
        }
	
		if (cnt == total ) { total =0;	}
		else return false ;	
	}		
	return true;  
}

@Test
public void Test1()
{
	String num = "1210";
	boolean digitCount = digitCount( num);
	System.out.println(digitCount);	
}

@Test
public void Test2()
{
	String num = "030";
	boolean digitCount = digitCount( num);
	System.out.println(digitCount);	
}

}
