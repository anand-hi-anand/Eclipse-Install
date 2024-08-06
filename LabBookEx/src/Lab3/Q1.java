package Lab3;
import java.util.*;
import java.util.regex.Pattern;

public class Q1 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String str=sc.nextLine();
			StringTokenizer st=new StringTokenizer(str);
			int sum=0,ele;
			while(st.hasMoreTokens()) {
				
				ele=Integer.parseInt(st.nextToken());
				sum+=ele;
				System.out.println(ele);
			}
			System.out.println("Sum is : "+sum);
		}

	}

