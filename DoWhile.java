// Jose Guzman
// October 1, 2023
// Description: using while and do loops for number input validations
// File name: DoWhile.java
// To Compile in terminal type: javac DoWhile.java
// To Run in terminal type: java DoWhile

import java.util.Scanner;

public class DoWhile{
	public static void main(String[] args){
		String message = "Invalid age, enter another value between 0-123: ";
		Scanner sc = new Scanner(System.in);

		int age = 10;
		while (age < 0 || age > 123){
			System.out.print(message);
			age = sc.nextInt();
		}
		//I modified the message in the do while loop
		age = -10;
		do{
			System.out.print("Enter another value between 0-123: ");
			age = sc.nextInt();
		} while ( age < 0 || age > 123);

		System.out.println("Valid age entered: " + age);

		sc.close();
	}
}

/*
Enter another value between 0-123: 12
Valid age entered: 12
*/