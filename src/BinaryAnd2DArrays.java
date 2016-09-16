import java.util.Scanner;

public class BinaryAnd2DArrays {

	public static void main(String[] args) {
		/*
		 * This challenge requires you to take a number and convert it to a binary 
		 * number. It then calculates the max consecutive times the number 1 appears. 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Number");
		int n = sc.nextInt();
		int remainder = 0;
		int s = 0;
		int count = 0;
		while (n > 0) {
			remainder = n % 2;
			n = n / 2;
			if (remainder == 1) {
				count++;
				if (count >= s)
					s = count;

			} else {
				count = 0;
			}
		}
		System.out.print(s);
		/*
		 * this challenege requires you to find all the hour glass shapes add up 
		 * the numbers in each shape. The program will output the hour glass shaope 
		 * that has the max value
		 */
		 Scanner in = new Scanner(System.in);
		 	int i=0;
		 	int j=0;
	        int arr[][] = new int[6][6];
	        for(i=0; i < 6; i++){
	            for(j=0; j < 6; j++){
	                arr[i][j] = j;
	                System.out.print(arr[i][j]);
	            	arr[i][j] = in.nextInt();
	            }
	            System.out.println();
	        }
	        
	        int sum =0;
	      for (int k = 0; k <4; k++) {
				for (int m = 0; m < 4; m++) {
				int currentSum = arr[k][m]+arr[k][m+1]+arr[k][m+2]+
						arr[k+1][m+1]+
						arr[k+2][m]+arr[k+2][m+1]+arr[k+2][m+2];
				if (currentSum>sum){
					sum = currentSum;
				}
					
			}
	      }  
	      System.out.println(sum);
	}
	
}
	

