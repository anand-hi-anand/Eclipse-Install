package Lab1;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {               
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		
		if(n<2)System.out.println("no prime number ");     // Prime Number logic
		for(int num=2;num<=n;num++) {
			boolean prime=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					prime=false;
					break;
				}
			}
			if(prime)
			System.out.println(num);
		}
		
	}

}


