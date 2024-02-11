package FreshWorks_Babu_10Feb;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class MultiThread 
{
	
	 // https://www.geeksforgeeks.org/multithreading-in-java/
	// https://www.tutorialspoint.com/java/java_multithreading.htm
	
	// Thread Local --  https://www.geeksforgeeks.org/java-lang-threadlocal-class-java/
	 //  https://www.javatpoint.com/java-threadlocal-class
	
	/*
	 * ThreadLocal in Java is another way to achieve thread-safety apart from writing immutable classes. Thread local can be considered as a scope of access like session scope or request scope. In thread local, you can set any object and this object will be local and global to the specific thread which is accessing this object.

Java ThreadLocal class provides thread-local variables. It enables you to create variables that can only be read and write by the same thread. If two threads are executing the same code and that code has a reference to a ThreadLocal variable then the two threads can't see the local variable of each othe
	 */
	public static void main(String[] args) 
	{
		
		int n= 10 ;
		
		for( int i =0 ; i  <= n ;i++)
		{
			//MultiThreading obj = new MultiThreading();
			Thread obj = new Thread( new MultiThreadingUsingRunanable()  );
			obj.start();
		}
	}
	
}

