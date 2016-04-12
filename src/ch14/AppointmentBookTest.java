package ch14;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AppointmentBookTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		AppointmentBook myBook = new AppointmentBook();

		FileReader fr = null;
		Scanner scanner = null;
		try {
			JFileChooser fc = new JFileChooser("H:/workspace/ch14");
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");
			fc.setFileFilter(filter);
			fc.showOpenDialog(null);
			Path filePath = fc.getSelectedFile().toPath();
			
			
			scanner = new Scanner(filePath);
			
			while(scanner.hasNextLine()){
				myBook.add(scanner.nextLine(), scanner.nextLine());
				//not secure
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
