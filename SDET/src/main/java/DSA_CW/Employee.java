package DSA_CW;

public class Employee {

		 String Name ;
		 int Age;
		
		public Employee(String Name, int Age)
		{
			this.Age = Age;
			this.Name =Name;
		}
		
		public String toString()
		{
			return Name+ "---------" +Age ;
		}
}
