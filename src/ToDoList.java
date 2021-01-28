import java.util.ArrayList;
import java.util.Scanner;

//----------------------------------------------------------------
//Alexander Aghili
//COMP 232
//February 1st, 2021
//----------------------------------------------------------------

public class ToDoList {
	
	private static ArrayList<String> toDoList = new ArrayList<String>();
	//Initializing global scanner in order to prevent reinitializing it in each method.
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		mainMenu();
	}
	
	//-----------------------------------------------------------
	//mainMenu method that displays possible inputs for user, prompts a response.
	//Uses a while loop that waits for an exit input from the user before exiting.
	//-----------------------------------------------------------
	private static void mainMenu() {
		commandList();
		
		//While true loop to always wait for user command, using a return command if user wants to exit.
		while(true) {
			System.out.print("\nEnter command: ");
			String userCommand = input.nextLine();
			if (userCommand.toLowerCase().trim().equals("exit") || userCommand.toLowerCase().trim().equals("0")) {
				if (verifyUserAction("exit the program")) {
					System.out.println("Program has been terminated.");
					return;
				}
			} 
			else if (userCommand.toLowerCase().trim().equals("add") || userCommand.toLowerCase().trim().equals("1")) {
				addToDoList();
			}
			else if (userCommand.toLowerCase().trim().equals("see") || userCommand.toLowerCase().trim().equals("2")) {
				seeToDoList();
			}
			else if (userCommand.toLowerCase().trim().equals("clear") || userCommand.toLowerCase().trim().equals("3")) {
				if (toDoList.size() == 0) {
					System.out.println("To do list is already empty.");
				}
				else if (verifyUserAction("clear your list")) {
					toDoList.clear();
					System.out.println("To do list has been cleared.");
				}
			}
			else if (userCommand.toLowerCase().trim().equals("commands") || userCommand.toLowerCase().trim().equals("4")) {
				System.out.println("");
				commandList();
			}
			else {
				System.out.print("\nEnter a valid command. (To see valid user commands, enter \'commands\' or 4)\n");
			}
		}
		
	}
	
	//Called when initially run and when the user enters bad commands.
	private static void commandList() {
		//Use printf later
		System.out.println("User Commands are as follow: \n");

		System.out.println("Exit:                 \'exit\'     or 0");
		System.out.println("Add the current list: \'add\'      or 1");
		System.out.println("See the current list: \'see\'      or 2");
		System.out.println("Clear current list:   \'clear\'    or 3");
		System.out.println("See user commands:    \'commands\' or 4");
	}
	
	//Method returns a true boolean if the user does want to continue with their action, false if they do not.
	//Asks for string parameter in order to personalize the message. 
	private static boolean verifyUserAction(String action) {
		System.out.print("\nPress enter if you want to " + action + ", otherwise, press any key and enter: ");
		String userInput = input.nextLine();
		if (userInput.trim().equals("")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//If the user doesn't enter anything, it returns, otherwise it adds the string to the global arraylist.
	private static void addToDoList() {
		System.out.println("\nEnter what you would like to add to the list. (Press enter alone to exit adding to the list): ");
		String userInput = input.nextLine().trim();
		if (userInput.trim().equals(""))
			return;
		toDoList.add(userInput);
		
	}
	
	//Prints formatted to do list with for loop if it isn't empty.
	private static void seeToDoList() {
		if (toDoList.size() == 0) 
			System.out.println("Your to do list is empty");
		else {
			System.out.println("\nYour to do list is as follows:");
			for(int i = 0; i < toDoList.size(); i++) {
				System.out.println(" " + (i+1) + " " + toDoList.get(i));
			}	
		}
	}
	

}
