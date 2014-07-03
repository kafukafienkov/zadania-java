import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatesValidator {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public boolean isDateValid(String date) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        try {
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (ParseException exc) {
            return false;
        }
    }
}
