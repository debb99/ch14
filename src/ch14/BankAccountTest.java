package ch14;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankAccountTest {
	public static void main(String[] args) {
		boolean done = false;
		do{
			try{
				BankAccount account = new BankAccount(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a starting value: ", "Bank Account", JOptionPane.QUESTION_MESSAGE)));	
				done = true;
			} catch (Exception e){
				
			}
		} while (!done);
	}
}
