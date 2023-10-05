package test;

import java.util.Random;  
import java.util.Scanner;	
public class testjava { 
 
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);	

	System.out.println("Hello World!");
	//Implement the classic rock, paper, scissors game. 
	//Ask the user for a 1 (rock), 2 (paper), or 3 (scissors). 
	//Then generate a random number between 1 and 3 using the random class. 
	//Output the user's choice and your choice, 
	//then tell the user who won.
	Random random = new Random();  
	System.out.print("Pick 1 for rock, 2 for paper, 3 for scissors");
	int comp = random.nextInt()%3+1;
	int user = scanner.nextInt();
	//If statements
	if ((user !=1) && (user !=2) && (user !=3)); { //Condition 1
		System.out.print("Invalid input. You loose!");
	} 
	else (user == comp) { //Condition 2
		System.out.println("tie");
		}
		if ((comp == 1 && user == 3) || (comp == 2 && user == 1) || (comp == 3 && user  == 2) ) {
			System.out.println("The computer won!");
		}
			else 
				System.out.println("You won!");
	}

	}

