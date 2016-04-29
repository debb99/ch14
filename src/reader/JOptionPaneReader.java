package reader;

import javax.swing.JOptionPane;

public class JOptionPaneReader extends JOptionPane {
	public static int readInt(String title, String message){
		int result = 0;
		boolean done = false;
		do{
			try{
				result = Integer.parseInt(showInputDialog(null, message, title, QUESTION_MESSAGE));
					if(result < 0){
						throw new NumberFormatException();
					}
				done = true;
			} catch(NumberFormatException e){
				showMessageDialog(null, "That is not an acceptable input.", "Error", ERROR_MESSAGE);				
			} catch(IllegalArgumentException e){
				showMessageDialog(null, "That is not an acceptable input.", "Error", ERROR_MESSAGE);
			}
		}while(!done);
		
		return result;
	}
}
