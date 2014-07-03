import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String pathname = System.getProperty("user.home") + "\\test\\daty.txt";

        FileUtil fileUtil = new FileUtil();
        DatesValidator validator = new DatesValidator();
        DatesRegexUtil datesRegexUtil = new DatesRegexUtil();

        try {
            String textFromFile = fileUtil.getTextFromFile(pathname);
            List<String> validDates = datesRegexUtil.getValidDatesFromText(textFromFile);

            for (String date : validDates) {
                if (validator.isDateValid(date)) {
                    System.out.print(date + " ");
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("***");
            System.exit(-1);
        }
    }

}

//String patt = "((?:19|20)\\d\\d)[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])";

