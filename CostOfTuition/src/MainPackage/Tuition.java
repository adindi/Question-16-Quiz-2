package MainPackage;

import java.util.Scanner;

public class Tuition {
	
	public static void main(String[] args) {
		
		double totalTuition;
		Scanner userinput = new Scanner(System.in);
		System.out.println("How much is your first year tuition?");
		totalTuition = userinput.nextInt();
		int terms = 4;
		
		while(terms>0){
			
			double tuitionInterest;
			System.out.println("How much is your interest for this semester?");
			tuitionInterest = userinput.nextDouble();
			double extraTuition = totalTuition*tuitionInterest;
			totalTuition =+ extraTuition + totalTuition;
			System.out.println("Your Tuition for this year: $" + totalTuition);
			terms--;
			
			totalTuition = totalTuition;
		}

	}

}

