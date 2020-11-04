package practicalTwo;

import java.util.Scanner;

public class Dictonary {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String word = userInput.next();
		doesFileExist(word);
	}
	
	public static void doesFileExist(String path) {
		if(path.equalsIgnoreCase("Apple")){
			System.out.println("Word: Apple");
			System.out.println("definition: a fruit");
			System.out.println("definition2: a tech firm");
		}
		else if(path.equalsIgnoreCase("Table")){
			System.out.println("Word: Table");
			System.out.println("definition: an object");
			System.out.println("definition2: contains rows and columns when used in context of computers");	
		}
		else{
			System.out.println("file does not exist");
		}
	}
}
