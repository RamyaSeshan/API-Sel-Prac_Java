package Interview_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Destination_city_LC_1436_WK10_Day2
{
	@Test
	public void test1()
	{
		List<List<String>> paths = Arrays.asList( Arrays.asList("London","New York") ,
				Arrays.asList("New York","Lima") , Arrays.asList("Lima","Sao Paulo" )  );

		String destCity = destCity( paths) ;
		System.out.println( " destCity is  " +destCity);
	}
	
	@Test
	public void test2()
	{
		List<List<String>> paths = Arrays.asList( Arrays.asList("B","C") ,
				Arrays.asList("D","B") , Arrays.asList("C","A" )  );

		String destCity = destCity( paths) ;
		System.out.println( " destCity is  test 2 " +destCity);
	}
	
	@Test
	public void test3()
	{
		List<List<String>> paths = Arrays.asList( Arrays.asList("A","Z")   );

		String destCity = destCity( paths) ;
		System.out.println( " destCity is  test 3 " +destCity);
	}

	

	public String destCity(List<List<String>> paths) 
	{
		Set<String> set = new HashSet< String>() ;
		
		for (int i = 0; i < paths.size(); i++) 
		{
			List<String> list = paths.get(i) ;
			set.add(list.get(0)) ;			   
		}
		
		//System.out.println(set);
		
		for (int i = 0; i < set.size(); i++) 
		{
			List<String> list = paths.get(i) ;
			if( ! set.contains(list.get(1))) return list.get(1);
		}
		
		return null;
	}
}
