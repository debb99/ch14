package bank;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bank {
	public void readFile(Path file) throws FileNotFoundException{
		FileReader reader = new FileReader(file.toFile());
		Scanner myScanner = new Scanner(reader);
		myScanner.useDelimiter("\\d+\\s+\\d+(\\.\\d+)?$");
		while(myScanner.hasNext()){
			
		}
	}
	
	ArrayList<BankAccount> BankAccounts = new ArrayList<>();
}
