package elykassab;
	
	

import java.util.Scanner;

public class elykassabproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);
	  
	int optionNumber;
	double measurement;
	double cm;

	
	final double CM_IN_INCH= 2.54;
	final double CM_IN_FEET=30.48;
	final double CM_IN_YARD=91.44;
	final double CM_IN_MILE=160934;
	  System.out.println("This program reads user's measurement converters to CM unit IN");
	  System.out.println("What units of measurement do you want converter to cm?");
	  
	  System.out.println("      1. Inches");
	  System.out.println("      2. feet");
	  System.out.println("      3. yard");
	  System.out.println("      4. miles");
	  System.out.println();
	  System.out.println("Enter the number of your choice:");
	  
	  optionNumber= scan.nextInt();
	  
	  switch (optionNumber) {
	  case 1:System.out.println("Enter the number of inches:");
	  measurement= scan.nextDouble();
	  cm=measurement * CM_IN_INCH;
			  System.out.println("There are " + cm + "cm in" + measurement + "inches");
			  break;
			  
	  case 2:System.out.println("Enter the number of feet:");
	  measurement= scan.nextDouble();
	  cm=measurement * CM_IN_FEET;
			  System.out.println("There are" + cm + "cm in" + measurement + "feet");
			  break;
			  
	  case 3:System.out.println("Enter the number of yard:");
	  measurement= scan.nextDouble();
	  cm=measurement * CM_IN_YARD;
			  System.out.println("There are" + cm + "cm in" + measurement + "yard");
			  break;
			  
	  case 4:System.out.println("Enter the number of mile:");
	  measurement= scan.nextDouble();
	  cm=measurement * CM_IN_MILE;
			  System.out.println("There are" + cm + "cm in" + measurement + "mile");
			  break;
			  default:System.out.println("Error");
	  }
	    		 
	        	
	        		
	
	  }
	  
	}


