package Lab5;
import java.util.*;


public class Q1 {

	
	public static void main(String[] args) throws  Q1E, Q2E, Q3E{
		
		//Ex 1
		
		System.out.println("Please enter the age\n");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		

		try {
			if(age<15) {
				throw new Q1E("Age should not be less than 15");
			}
		}
		catch(Q1E e) {
			e.printStackTrace();
		}
		
		Scanner sq= new Scanner(System.in);
		System.out.println("Please Enter the first name\n");
		String first_name= sq.nextLine();
		
		
		
		Scanner sg = new Scanner (System.in);
		System.out.println("Please Enter the last name");
		String second_name= sg.nextLine();
		
		try {
			if(first_name==null || second_name==null) {
				throw new Q2E("First Name or Last Name should not be null");
			}
		}
		catch(Q2E e) {
			e.printStackTrace();
		}
		
		System.out.println("Please Enter the Salary\n");
		int salary = sc.nextInt();
		
		try {
			if(salary<3000) {
				throw new Q3E("Salary is below 3000");
			}
		}
		catch(Q3E e) {
			e.printStackTrace();
			
		}
		
		//Ex 2
		
		
		
		
		//exercise 3
		
		//int salary=sc.nextInt();
		
	}

}


