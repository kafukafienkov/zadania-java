import org.joda.time.LocalDate;

import javax.swing.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        DatesValidator dateValidator = new DatesValidator();
        DatesUtil dateUtil = new DatesUtil();
        String dates = JOptionPane.showInputDialog(null, "Podaj datę początkową oraz datę końcową");

        if (dates == null) {
            System.out.println("Musisz podać dane");
            System.exit(-1);
        }

        StringTokenizer tokenizer = new StringTokenizer(dates);
        String firstDate = tokenizer.nextToken();
        String secondDate = tokenizer.nextToken();

        if (!dateValidator.isDateValid(firstDate) || !dateValidator.isDateValid(secondDate)) {
            System.out.println("Podano nieprawidłowe daty");
            System.exit(-1);
        }

        LocalDate firstLocalDate = dateUtil.convertDate(firstDate);
        LocalDate secondLocalDate = dateUtil.convertDate(secondDate);

        dateUtil.printDatesBetween(firstLocalDate, secondLocalDate);

    }
}

