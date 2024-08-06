package Lab2;

import java.util.Arrays;
import java.util.Scanner;


//a method which accepts an array of integer elements and return the second smallest element in the array

public class Q1 {
	
	public static int second_Small(int [] x) {
		
		
		Arrays.sort(x);
			
		return x[1];
	}
	
	public static void main (String [] args) {
		
		System.out.println("Please Enter number of elements\n");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int [] a ;
	    
		a = new int [d];
		
		System.out.println("Please Enter the elements\n");
		
		for (int i=0;i<d;i++) {
			
			a[i]=sc.nextInt();			
		}
		
		int o=second_Small(a);
		
		System.out.println(o);
	    
	}
}