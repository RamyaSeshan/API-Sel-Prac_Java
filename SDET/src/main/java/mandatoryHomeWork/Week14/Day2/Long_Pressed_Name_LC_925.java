package mandatoryHomeWork.Week14.Day2;

import org.junit.Test;

public class Long_Pressed_Name_LC_925 {

	
	// https://leetcode.com/problems/long-pressed-name/
	
	/*
	 * Psuedo code 
	 * get the frequency of charatcer in name and typed in 2 diffrent int[] arrays 
	 * Iterate thru any one of the int array
	 *  if value at index of name ==0 and types >=1 return false 
	 *  if value at index of name > types  return false 
	 *  if value at index of name <= types continue
	 * 
	 * finally return true
	 * 
	 */
	
public boolean isLongPressedName1(String name, String typed) { // This did not satisfy few of the tets data 
	
	int[] name_Arr = new int[26];
	int[] name_Typed = new int[26];
	
	for (int i = 0; i < name.length(); i++) 
	{ name_Arr[name.charAt(i) - 'a'] ++; }	 
		
	for (int i = 0; i < typed.length(); i++) 
	{ name_Typed[typed.charAt(i) - 'a'] ++; }	
	
	for (int i = 0; i < name_Arr.length; i++)
	{
		if(name_Arr [i] > name_Typed [i] )  {return false ;}
		if(name_Arr [i] == 0 &&  name_Typed [i] >=1 )  {return false ;}
		if(name_Arr [i] <= name_Typed [i] )  {continue ;}
	}	
	return true;        
    }

public boolean isLongPressedName(String name, String typed) { // THis is optimized , took 0 ms
	if(typed.length() < name.length()) return false ;
	if(name.charAt(0) != typed.charAt(0) )  return false;
	
	int name_P = 0 , typed_P =0;	
	char[] name_Arr = name.toCharArray() ;
	char[] typed_Arr = typed.toCharArray() ;
	
	while (typed_P < typed.length()) // "p y p  l rz", typed = "p p y y  p l l r" 
	{
		if (name_P < name.length() && name_Arr[name_P] == typed_Arr[typed_P]) { name_P++ ;typed_P++ ; }
		else 
			{
			 if (typed_P !=0 && typed_Arr[typed_P] == typed_Arr[typed_P -1]) { typed_P++ ; }
		     else return false;
			}
	}
	
	return name_P == name.length() ;
}



@Test
public void test6()
{
	String name = "pyplrz", typed = "ppyypllr" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 6 is  " +longPressedName);
}

@Test
public void test5()
{
	String name = "vtkgn", typed = "vttkgnn" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 5 is  " +longPressedName);
}
@Test
public void test1()
{
	String name = "alex", typed = "aaleex" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 1 is  " +longPressedName);
}

@Test
public void test2()
{
	String name = "saeed", typed = "ssaaedd" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 2 is  " +longPressedName);
}

@Test
public void test3()
{
	String name = "ramya", typed = "name" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 3 is  " +longPressedName);
}

@Test
public void test4()
{
	String name = "erik", typed = "krie" ;
	boolean longPressedName = isLongPressedName( name,  typed) ;
	System.out.println("from test 4 is  " +longPressedName);
}

}
