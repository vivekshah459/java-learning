package learnjava;

import java.util.Scanner;

public class ConditionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : " );
		int age=sc.nextInt();
		
		if(age >= 58) {
			System.out.print("Seems you are Seniot citizan");
		}else if (age >= 18) {
			System.out.print("YOu are Eligible");
		}else if (age < 5 ){
			System.out.print("YOu are child");
		}
		
	}

}
