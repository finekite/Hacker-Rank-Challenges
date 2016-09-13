import java.util.Scanner;

public class Fibinachi {

	public static void main(String[] args) {
		
		//fibinachi sequence
		int num0 = 0;
		int num1 = 1;
		System.out.print(num0+","+num1+",");
		for (int i=0;i<50;i++){
			int num2 = num0 + num1;
			System.out.print(num2+",");
			num0=num1;
			num1=num2;
		}
		
		//first non repeated character in a string
		Scanner sc = new Scanner(System.in);
		System.out.println("word please");
		String word1 = sc.nextLine();
		word1=word1.toLowerCase();
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word1.length(); j++) {
				if (word1.charAt(i)==word1.charAt(j)){
					count++;
				}
				
			}
			if(count<2){
			System.out.println(word1.charAt(i));	
			break;
			}
			 
			count=0;
		}
		
		//how many times a character appears in string
		System.out.println("sentence please");
		String sent = sc.nextLine();
		System.out.println("target character please");
		String target = sc.next();
		int count1 =0;
		for (int i = 0; i <sent.length(); i++) {
			i = sent.indexOf(target,i);
			if(i<0){
			break;
			}
			count1++;
		}
		
		System.out.println("The word \"in\" appears " + count1 + " times");
		}
		
}
	



