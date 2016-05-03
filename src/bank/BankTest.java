package bank;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		boolean done = false;

		Bank myBank = new Bank();

		Path currentFile;
		String userInput;
		do {
			System.out.println("Enter file name (Q to quit): ");
			userInput = myScanner.next();

			if (!userInput.isEmpty() || userInput.equalsIgnoreCase("q")) {
				done = true;
				break;
			}
		
		} while (!done);
			try {
				currentFile = Paths.get(userInput);
				System.out.println(currentFile.toAbsolutePath());
				myBank.readFile(currentFile);
			} catch (FileNotFoundException e) {
				System.out.println("Invalid file input.");
			}
	}
}
