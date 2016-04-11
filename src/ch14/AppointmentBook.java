package ch14;

import java.text.ParseException;
import java.util.ArrayList;

public class AppointmentBook {
	public void add(String date, String description) throws ParseException{
		list.add(new Appointment(date, description));
	}
	
	ArrayList<Appointment> list = new ArrayList<>();
}
