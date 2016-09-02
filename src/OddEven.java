import java.io.*;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		/*
		 * This code will take a specific amount of strings (decided by the user) and output the even letters
		 * first followed by a space then the odd letters
		 * for example "Hacker" would be  "Hce akr"
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
