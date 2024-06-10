package HackerRankAss_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


/*
 * 
 */
public class Problem_1 {
	
	  public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) { // 1,2,3    || 5,6,7   1,2,3,5,6,7
		   List<Integer > list = new ArrayList<Integer>();
		   int aPoint =0 , bPoint =0 ,   A,B;
		   
		   while (aPoint < a.size() && bPoint < b.size()) // 3,3 
		   {
			   A = a.get(aPoint) ;	 B =  b.get(bPoint) ;
		       if(A < B)
		       {
		    	   list.add(A) ;   aPoint++;   // 3
		    	   
		            if(aPoint >= a.size()) 
		           { 
		               while(bPoint < b.size())
		               { list.add(b.get(bPoint)) ; bPoint++; } // 3
		           }		            
		       }
		       else if (A >B)
		       {
		           list.add(B) ;   bPoint++;         
		           if(bPoint >= b.size())  
		           { 
		               while(aPoint < a.size())
		               { list.add(a.get(aPoint)) ; aPoint++; }
		           }
		       }
		       else 
		       {
		            list.add(A) ; list.add(B) ;          
		              aPoint++; bPoint++; 
		       }
		   }
		   
		   return list ;
		    }


@Test
public void Test1()
{
	
	List<Integer> a = new ArrayList<Integer>( ){{
        add(1);
        add(2);
        add(3);
          } };
          
      	List<Integer> b = new ArrayList<Integer>( ){{
            add(2);
            add(5);
            add(5);
              } };
              
List<Integer> mergeArrays = mergeArrays (a,  b) ;
System.out.println(mergeArrays);
  
} 	

@Test
public void Test2()
{
	
	List<Integer> a = new ArrayList<Integer>( ){{
        add(1);
        add(5);
        add(7);
        add(7);
          } };
          
      	List<Integer> b = new ArrayList<Integer>( ){{
            add(0);
            add(1);
            add(2);
            add(3);
              } };
              
List<Integer> mergeArrays = mergeArrays (a,  b) ;
System.out.println(mergeArrays);
  
} 	
}
