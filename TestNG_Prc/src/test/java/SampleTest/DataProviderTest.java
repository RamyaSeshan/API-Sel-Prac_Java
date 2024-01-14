package SampleTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


	@DataProvider (name = "getData")
	public Object[][] dataGenerator(){

		Object[][] data = new Object[2][2] ;

		data[0][0] = "Ramya";
		data[0][1] =" Level I " ;

		data[1][0] = "Ramya1" ;
		data[1][1] =" Level II " ; 

		return data;

	}



	@Test (dataProvider = "getData")
	public void mulParamTest(String name , String level)
	{
     System.out.println("name is   " +name);
     System.out.println("name is   " +level);
	}

}
