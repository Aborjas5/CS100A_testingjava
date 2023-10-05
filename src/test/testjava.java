package test;

import java.util.Random;  
import java.util.Scanner;	
public class testjava { 
 
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);	

	System.out.println("Hello World!");
	
	Random random = new Random();  
	System.out.print("Pick 1 for rock, 2 for paper, 3 for scissors");
	int comp = random.nextInt()%3+1;
	int user = scanner.nextInt();
	
	

	}
}
