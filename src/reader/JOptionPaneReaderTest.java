package reader;

import javax.swing.JOptionPane;

public class JOptionPaneReaderTest {
	public static void main(String[] args) {
		JOptionPaneReader reader = new JOptionPaneReader();
		String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
		
	}
}
