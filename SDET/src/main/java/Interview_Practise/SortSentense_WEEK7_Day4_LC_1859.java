package Interview_Practise;

import org.junit.Test;

public class SortSentense_WEEK7_Day4_LC_1859 
{

	@Test
	public void test1()
	{
		String s = "is2 sentence4 This1 a3" ;
		String sortSentence = sortSentence( s)  ;
		System.out.println(sortSentence);
	}

	@Test
	public void test2()
	{
		String s = "Myself2 Me1 I4 and3" ;
		String sortSentence = sortSentence( s)  ;
		System.out.println(sortSentence);
	}

	public String sortSentence(String s) 
	{
		String[] split = s.split(" ");
		String[] val = new String[split.length]  ;
		StringBuffer sb = new StringBuffer();
		int index ;
		char charAt ;

		for (int i = 0; i < split.length; i++)
		{
			charAt = split[i].charAt( split[i].length() -1 );			
			index = Integer.parseInt(charAt+"") ;			
			val[index -1 ] = split[i].substring(0, split[i].length() - 1 ) ;			
		}


		for (int j = 0; j < val.length; j++)
		{
			if(j !=  val.length -1 ) { sb.append(val[j] + " " ) ; }
			else sb.append(val[j]  );
		}
		return sb.toString() ;

	}
}
