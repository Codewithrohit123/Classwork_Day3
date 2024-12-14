package Classwork_Day3;

import java.util.Scanner;

public class largestsmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no: ");
		int one = sc.nextInt();
		
		System.out.println("Enter the two no: ");
		int two = sc.nextInt();
		
		if(one > two) {
			System.out.println(one+" is greater than "+two);
		}else if(one == two) {
			System.out.println(one+" and "+two+" is equal");
		}
		else {
			System.out.println(two+" is greater than "+one);
		}
	}

}
