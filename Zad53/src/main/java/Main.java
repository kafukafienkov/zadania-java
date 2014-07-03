import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex = "([1-9]\\d{3})-(\\d{2})-(\\d{2})";

        String datesFromUser = JOptionPane.showInputDialog(null, "Wprowadź datę początkową i końcową w formacie YYYY-MM-DD rozdzielone spacją: ");
        if (datesFromUser == null) {
            JOptionPane.showMessageDialog(null, "Nie podano danych!");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datesFromUser);

        String matchingDates = "";
        ArrayList<String> userDates = new ArrayList<String>();

        while (matcher.find()) {
            matchingDates += " " + matcher.group();
        }
        //System.out.println(matchingDates);

        StringTokenizer st = new StringTokenizer(matchingDates, " ");
        while (st.hasMoreTokens()) {
            userDates.add(st.nextToken());
        }
        //System.out.println("ArrayList userDates " + userDates.toString());


        //System.out.println("Lista userDates długość: " + userDates.size());


        String firstDate = userDates.get(0);
        String lastDate = userDates.get(1);

        //System.out.println("Daty zapisane w liście to: \n ***INDEX 0 - " + firstDate + "\n ***INDEX 1 - " + lastDate);

        ArrayList<String> firstDateArray = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(firstDate, "-");
        while (tokenizer.hasMoreTokens()) {
            firstDateArray.add(tokenizer.nextToken());
        }
        System.out.println("Pierwsza data z tablicy " + firstDateArray.toString());
        for (int i = 0; i < firstDateArray.size(); i++) {
            System.out.println("Index" + " " + i + ": " + firstDateArray.get(i));
        }

        ArrayList<String> secondDateArray = new ArrayList<String>();
        StringTokenizer secondTokenizer = new StringTokenizer(lastDate, "-");
        while (secondTokenizer.hasMoreTokens()) {
            secondDateArray.add(secondTokenizer.nextToken());
        }
        System.out.println("Druga data z tablicy " + secondDateArray.toString());
        for (int i = 0; i < secondDateArray.size(); i++) {
            System.out.println("Index" + " " + i + ": " + secondDateArray.get(i));
        }

        int firstYear = Integer.parseInt(firstDateArray.get(0));
        int firstMonth = Integer.parseInt(firstDateArray.get(1));
        int firstDay = Integer.parseInt(firstDateArray.get(2));

        /*System.out.println("Daty jako zmienne Int to: \nrok:" + " " + firstYear
                + "\nmiesiąc: " + firstMonth + "\ndzień: " + firstDay);

        JOptionPane.showMessageDialog(null, "Daty jako zmienne Int to: \nrok:" + " " + firstYear + "\n"
                + "miesiąc: " + firstMonth + "\ndzień: " + firstDay);*/

        Calendar c = Calendar.getInstance();
        c.setLenient(true);
        c.set(Calendar.YEAR, firstYear);
        c.set(Calendar.MONTH, firstMonth);
        c.set(Calendar.DAY_OF_MONTH, firstDay);
        System.out.println((c.get(Calendar.YEAR)) + '-' + (c.get(Calendar.MONTH)) + '-' + (c.get(Calendar.DAY_OF_MONTH)));


    }


}

