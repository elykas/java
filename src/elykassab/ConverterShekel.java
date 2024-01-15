package elykassab;

import java.util.Scanner;

public class ConverterShekel {//example

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int PASS=55;
		 final int GOOD_HOMEWORK_AVERAGE=8;
		 final double WEIGHT_OF_5_6_ASSIGNMENTS=.20;
		 final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_PASSED=.30;
		 final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_GOOD_AVERAGE=.25;
		 final double WEIGHT_OF_7_8_ASSIGNMENTS_IF_FAILED_NOT_GOOD_AVERAGE=.20;
		 int examGrade, numberOfAssignments, homeworkAverage;
		 double finalGrade;
		 
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Please enter the exam grade: ");
		 examGrade=scan.nextInt();
		 System.out.println("Please enter the homework average: ");
		 homeworkAverage= scan.nextInt();
		 homeworkAverage*=10;
		 System.out.println("Please enter the number of assignments handed in: ");
		 numberOfAssignments=scan.nextInt();
		 finalGrade= examGrade;
		 
		 if (numberOfAssignments<=4) {
			 finalGrade=0;
		 }else if(numberOfAssignments<=6) {
			 if(examGrade>=PASS)
			 {
				 finalGrade=examGrade*(1-WEIGHT_OF_5_6_ASSIGNMENTS);
			     finalGrade += homeworkAverage*WEIGHT_OF_5_6_ASSIGNMENTS;
			 }
		 
		 }
		 else {
			 if(homeworkAverage>examGrade){
				 if(examGrade>=PASS) {
					 finalGrade= examGrade*(1-WEIGHT_OF_7_8_ASSIGNMENTS_IF_PASSED);
				 }
				 else {
					 
				 }
				 }
			 }
		 }
		 else {
			
		
		
	    	}
		

	}


