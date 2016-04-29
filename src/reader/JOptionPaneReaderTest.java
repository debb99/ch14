package reader;

import javax.swing.JOptionPane;

public class JOptionPaneReaderTest {
	public static void main(String[] args) {
		JOptionPaneReader reader = new JOptionPaneReader();
		String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
		int age = JOptionPaneReader.readInt("Input", "What is your age?");
		int money = JOptionPaneReader.readInt("Input", "How much money do you have?");
		
		reader.showMessageDialog(null, String.format("%s is %d years old, and has $%d.", name, age, money), "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
