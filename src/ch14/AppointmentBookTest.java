package ch14;

import java.nio.file.Path;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppointmentBookTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		//add that user input for the data file
	}
}
