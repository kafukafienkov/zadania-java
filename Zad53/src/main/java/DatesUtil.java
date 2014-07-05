import org.joda.time.LocalDate;

import java.util.StringTokenizer;

public class DatesUtil {
    private final String[] daysOfWeek = {"Pn", "Wt", "Śr", "Cz", "Pt", "So", "N"};

    public LocalDate convertDate(String date) {
        try {
            StringTokenizer tokenizer = new StringTokenizer(date, "-");
            int year = Integer.parseInt(tokenizer.nextToken());
            int month = Integer.parseInt(tokenizer.nextToken());
            int day = Integer.parseInt(tokenizer.nextToken());
            return new LocalDate(year, month, day);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void printDatesBetween(LocalDate firstDate, LocalDate secondDate) {
        while (firstDate.compareTo(secondDate) <= 0) {
            int dayOfWeek = firstDate.getDayOfWeek();
            System.out.println(firstDate.toString("dd.MM.yyyy ") + daysOfWeek[dayOfWeek-1]);
            firstDate = firstDate.plusDays(1);
        }
    }
}
