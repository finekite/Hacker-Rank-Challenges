
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

/*
 * This program accepts an integer that determines the amount of key/value pairs to put in a HashMap
 * Once the key/value pairs are placed in HashMap the program accepts a string and checks if the the 
 * string equals one of the keys. If it does it prints out the key/value pair.
 */
public class Phonebook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, String> namenum = new HashMap<String, String>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			String pts = String.valueOf(phone);

			namenum.put(name, pts);

		}
		while (in.hasNext()) {
			String s = in.next();
			if (namenum.containsKey(s)) {
				System.out.println(s + "=" + namenum.get(s));
			} else {
				System.out.println("not found");
			}
		}
		in.close();
	}

}
