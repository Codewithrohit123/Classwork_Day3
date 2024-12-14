package Classwork_Day3;
import java.util.*;

public class arithmaticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no: ");
		int one = sc.nextInt();
		
		System.out.println("Enter the two no: ");
		int two = sc.nextInt();
		
		System.out.println(one + two);
		System.out.println(one - two);
		System.out.println(one * two);
		System.out.println(one / two);
		System.out.println(one % two);
		System.out.println(one < two);
		System.out.println(one > two);
		System.out.println(one <= two);
		System.out.println(one >= two);
		System.out.println(one == two);
		System.out.println(one != two);
	}
}
