package Lab2;
import java.util.*;


// accept an array of String objects and sort in alphabetical order

public class Q2 {
	
	public static String sortStrings(String [] a) {
		
		
		Arrays.sort(a);
		int x=0;
		int p = a.length;
		if (p%2==0) {
			
			 x = (p/2);
			
		}
		else {
			 x = (p/2) +1;
		}
				
		
		for (int i=0 ; i<p;i++) {
			if (i< x) {
			a[i]= a[i].toUpperCase();
			}
			else {
				a[i] = a[i].toLowerCase();
				
			}
		}
		
		return Arrays.toString(a);
		
	}
	
	public static void main (String[] args) {
		
		System.out.println("Please Enter the number of Elements\n");
		Scanner sc = new Scanner (System.in);
		int d = sc.nextInt();
		
		System.out.println("Please Enter the Elements\n");
		
		String a[]= new String [d];
		
		for (int i=0; i<d ; i++) {
			
			Scanner sq= new Scanner (System.in);
			a[i]=sq.nextLine();
		}
		
		String n = Q2.sortStrings(a);
	    System.out.println(n);
   	
	}
}