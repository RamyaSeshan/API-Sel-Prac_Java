package DSA_DailyConnect;

import org.junit.Test;

public class GreatString {

	public String makeGood(String s) {
		if (s.length() ==0 ) {return "-1"; }

		StringBuffer sb = new StringBuffer(s);
		//int i=0;
		boolean flag =true;
		while (flag) { //"aAcC"
           if(sb.length() !=0 )
           {
        	   System.out.println(sb.toString());
        	   for (int i = sb.length()-1; i >0; i--) 
        	   {
            	   if(String.valueOf(sb.charAt(i)).toLowerCase().equals(String.valueOf(sb.charAt(i-1)).toLowerCase()) )        		 
       			   {
            		   flag =true;
       				if (Character.isUpperCase(sb.charAt(i)) )
       				  { if (Character.isLowerCase(sb.charAt(i+1)))
       				     { sb = sb.delete(i,i+2) ;}	

       				  } 
       				else if (Character.isLowerCase(sb.charAt(i)) )
       				  {	{ if (Character.isUpperCase(sb.charAt(i+1)))
       				     { sb = sb.delete(i,i+2) ;}	
       				  System.out.println("not the sting is " +sb.toString());
       				 System.out.println("now the flag is  " +flag);
       				    }	
       				   }	
       		       	} 	
            	   else
       		       	{flag =false;}
    		   }
           } 
           else
		   {flag =false;}
         
		}

		return sb.toString();
	}


	/*@Test
	public void Test1()
	{
		String s = "leEeetcode";
		String makeGood = makeGood( s);
		System.out.println(makeGood);		

	}

	@Test
	public void Test2()
	{
		String s = "abBAcC";
		String makeGood = makeGood(s);
		System.out.println(makeGood);
	}*/
	
	@Test
	public void Test3()
	{
		String s = "aAbBZ";
		String makeGood = makeGood(s);
		System.out.println(makeGood);		

	}
}
