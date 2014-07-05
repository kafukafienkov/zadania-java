import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatesValidator {

    final static String DATE_FORMAT = "yyyy-MM-dd";

    public boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
