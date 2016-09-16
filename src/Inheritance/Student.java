package Inheritance;
/*
 * See solution class for explation
 */
class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName,String lastName,int identification,int [] scores){
      super(firstName, lastName, identification);
      testScores=scores;
    }
   
    public char calculate(){
    	int total = 0;
    	char grade;
    	for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
    	int sum = total/testScores.length;
        if (sum<40){
        	grade ='T';
        } else if (sum>=40&&sum<55){
        	grade ='D';
        }else if (sum>=55&&sum<70) {
        	grade = 'P';
        } else if (sum>=70&&sum<80){
        	grade = 'A';
        } else if (sum>=80&&sum<90){
        	grade ='E';
        } else {
        	grade = 'O';
        }
        return grade;
    }
}
