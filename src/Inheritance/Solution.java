package Inheritance;
import java.util.Scanner;
/*
 * A Simple Inheritance exercise. Student class extends Person class and invokes 
 * the superclass constructor. User enters their firstname, lastname,id,number of tests
 * and each ones test score. The program first invokes the printPerson() method from 
 * the superclass using the reference from the Student object. It uses the calculate()
 *  method that calculates the Average and outputs the correct letter grade.
 */
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
