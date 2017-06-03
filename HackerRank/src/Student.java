import java.util.Scanner;

public class Student extends Person {
	Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int idNumber = scan.nextInt();
		int totalSubject = scan.nextInt();
		int[] testScores = new int[totalSubject];
		for(int i=0; i<totalSubject; i++) {
			int score = scan.nextInt();
			testScores[i] = score;
		}
		
		Student stuObj = new Student(firstName, lastName, idNumber);
		stuObj.printPerson();
		stuObj.calculateGrade(testScores);
	}
	
	public void calculateGrade(int[] scores){
	 	int totalScore = 0;
	 	int avgScore = 0;
	 	for (int i=0; i<scores.length; i++) {
	 		totalScore = totalScore + scores[i];
	 	}
	 	if (totalScore > 0) {
	 		avgScore = totalScore/scores.length;
	 	}
	 	if (avgScore >= 90 && avgScore <=100) {
	 		System.out.println("Grade: O");
	 	} else if (avgScore >= 80 && avgScore <90) {
	 		System.out.println("Grade: E");
	 	} else if (avgScore >= 70 && avgScore <80) {
	 		System.out.println("Grade: A");
	 	} else if (avgScore >= 55 && avgScore <70) {
	 		System.out.println("Grade: P");
	 	} else if (avgScore >= 40 && avgScore <55) {
	 		System.out.println("Grade: D");
	 	} else if (avgScore < 40) {
	 		System.out.println("Grade: T");
	 	}
	 	}
}
