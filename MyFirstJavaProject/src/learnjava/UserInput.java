package learnjava;

import java.util.Scanner;

public class UserInput {

	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Name : ");
	String name =sc.nextLine();
	
	System.out.println("Enter Your Age : ");
	int age =sc.nextInt();
	
	System.out.println("Your Name is : " + name + " and Age is : " + age);
	
	}
}
