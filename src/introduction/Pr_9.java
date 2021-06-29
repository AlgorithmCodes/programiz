package introduction;

import java.util.Scanner;

public class Pr_9 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int second=sc.nextInt();
		System.out.println("Enter third number");
		int third=sc.nextInt();
		
		int result1=(first>second)?first:second;
		int result2=(second>third)?second:third;
		int big=(result1>result2)?result1:result2;
		System.out.println("Big number is:"+big);
	}

}
