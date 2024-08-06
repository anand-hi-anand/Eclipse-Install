package Lab2;

import java.util.*;
// accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
public class Q3 {

	public static int getSorted(int [] p) {
		
		String g = Arrays.toString(p);
		
		Arrays.sort(p);
		
		
		
		return ;
	}
	
	public  static void main (String [] args) {
	
		System.out.println("Please Enter number of elements\n");
		Scanner sc = new Scanner (System.in);
	    int d = sc.nextInt();
	    
	    System.out.println("Please Enter the elements\n");
	    int a[] = new int[d];
	    
	    for (int i=0; i<d; i++) {
	    	
	    	Scanner sq = new Scanner (System.in);
	    	a[i] = sq.nextInt();
	    	
	    }
	
	   
	    Q3.getSorted(a);
	    System.out.println();
	
	
	}
	}