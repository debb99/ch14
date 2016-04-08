package ch14;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankAccountTest {
	public static void main(String[] args) {
		boolean done = false;
		BankAccount account = null;
		do {
			try {
				account = new BankAccount(Double.parseDouble(JOptionPane.showInputDialog(null,
						"Enter a starting value: ", "Bank Account", JOptionPane.QUESTION_MESSAGE)));
				done = true;
			} catch (Exception e) {

			}
		} while (!done);

		done = false;

		do {
			try {
				account.deposit(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a deposit amount: ",
						"Current Balance: " + NumberFormat.getCurrencyInstance().format(account.getBalance()),
						JOptionPane.QUESTION_MESSAGE)));
				done = true;
			} catch (Exception e) {

			}
		} while (!done);

		do {
			try {
				account.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a withdrawal amount: ",
						"Current Balance: " + NumberFormat.getCurrencyInstance().format(account.getBalance()),
						JOptionPane.QUESTION_MESSAGE)));
				done = true;
			} catch (Exception e) {

			}
		} while (!done);
	}
}
