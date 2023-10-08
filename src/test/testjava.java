package test;

import java.util.Random; 
import java.util.Scanner; 


import java.util.Scanner;	
public class testjava { 
 
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	Random random = new Random();  
	
	while (true) {
	//Using while loop with rock, paper, scissors
	System.out.print("Pick 1 for rock, 2 for paper, 3 for scissors"); //User asked to pick a number
	int user = scanner.nextInt(); // User number named here
	int comp = random.nextInt()%3+1; // Computer selects a random number between 1-3

	if ((user !=1) && (user !=2) && (user !=3)) {
		System.out.println("Invalid input. You loose!");
			continue;
	} 
	else { //The user enters 1, 2, or 3. Evaluate conditions
		if (user == comp) { //Condition 1: numbers match
			System.out.println("tie");
		} 
			else if ((comp == 1 && user == 3) || (comp == 2 && user == 1) || (comp == 3 && user  == 2) ) {//Condition 2: computer beats user
				System.out.println("The computer won!"); 
		} 
		else { //Condition 3: doesn't meet either criteria above, so user has entered a number that beats the computer
			System.out.println("You won!"); 
		}

		break; 
	}
		}
		}
	}
 




