import java.io.*;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int f = sc.nextInt();
		int v=0;
		String [] word = new String [f];
		while (v<f) {
			word[v] = sc.next();
			v++;
		}
		for (int i = 0; i < word.length; i++) {
			getOE(word[i]);
			System.out.println();
		}
		
		

	}

	public static void getOE(String s) {
		int f = 0;
		String array1[] = s.split("");

		String even = "";
		String odd = "";
		for (int i = 0; i < array1.length; i++) {
			if ((i % 2) == 0) {
				even += array1[i];

			} else {
				odd += array1[i];
			}
		}
		System.out.print(even + " " + odd);
		f = f + 1;
	}
}
