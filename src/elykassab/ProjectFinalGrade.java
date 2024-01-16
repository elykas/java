package elykassab;

import java .util.Scanner;

public class ProjectFinalGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int examGrade,averageHomework,numberOfHomework;
		double finalGrade;
		final double EXAM_PASS=55;// check if the exam is more or lees than 55
		final double NUMBER_OF_5_6_HOMEWORK=0.2;
		final double NUMBER_OF_7_8_HOMEWORK_PASSED_TEST=0.3;
		final double NUMBER_OF_7_8_HOMEWORK_8_UP_HOMEWORK=0.25;
		final double NUMBER_OF_7_8_HOMEWORK_8_DOWN_HOMEWORK=0.2;
		final double GOOD_HOMEWORK=8;
		
		System.out.println("Please enter your exam Grade?");
		examGrade= scan.nextInt();
		System.out.println("Plese enter your homework average?");
		averageHomework=scan.nextInt();
		averageHomework *=10; 
		System.out.println("Please enter the number of homework you did?");
		numberOfHomework= scan.nextInt();
		finalGrade= examGrade;
		
		if(numberOfHomework<=4) {
			finalGrade= 0;
			
		}//curly brackets of number of homework less than 4
		else if(numberOfHomework<=6) {
			if(examGrade > EXAM_PASS) {
				
			finalGrade=examGrade*(1-NUMBER_OF_5_6_HOMEWORK);
				finalGrade+=averageHomework*0.3;
			}//curly brackets of add 0.2
			
		}//curly brackets 0f 5 or 6 homework
	
		System.out.println(finalGrade);
		

		
		

	}

}
