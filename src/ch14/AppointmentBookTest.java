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

		Scanner scanner = null;
		try {
			JFileChooser fc = new JFileChooser("H:/workspace/ch14");
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");
			fc.setFileFilter(filter);
			fc.showOpenDialog(null);
			Path filePath = fc.getSelectedFile().toPath();
			
			
			scanner = new Scanner(filePath);
			
			while(scanner.hasNextLine()){
				String tempDate = scanner.nextLine();
				String tempDesc;
				if(scanner.hasNextLine()){
					tempDesc = scanner.nextLine();
					myBook.add(tempDate, tempDesc);
				} else {
					break;
				}
			}
		} catch (IOException | ParseException e) {
			
		} finally {
			scanner.close();
		}
		
		for(Appointment a : myBook.list){
			System.out.println(a.toString());
		}
	}
}
