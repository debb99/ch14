package ch14;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Appointment
{
   public Appointment(String aDate, String aDescription) throws ParseException
   {
      description = aDescription;
      date = formatter.parse(aDate);
   }
   
   public String toString()
   {
      return "Appointment:  date:        " + formatter.format(date) + "\n"
                                    + "              description: " + description + "\n";
   }
   
   private Date date;
   private String description;
   private static DateFormat formatter
                     = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
}

