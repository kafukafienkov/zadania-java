import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String txt = JOptionPane.showInputDialog("Wprowadź łańcuch znaków");
        if (txt == null) {
            System.out.println("Nie podano wymaganych danych");
            System.exit(-1);
        }

        String subtxt = JOptionPane.showInputDialog("Wprowadź łańcuch znaków który chcesz sprawdzić");
        if (subtxt == null) {
            System.out.println("Nie podano wymaganych danych");
            System.exit(-1);
        }
        /*String txt = "ala ma kota, ale ala nie ma psa; kota ma ala";
        String subtxt = "al";*/

        StringUtil stringUtil = new StringUtil(txt, subtxt);

        System.out.println("1) " + stringUtil.getLength());
        System.out.println("2) " + stringUtil.getFirstAndLastLetter());
        System.out.println("3) " + stringUtil.substringFromFourthLetter());
        System.out.println("4) " + stringUtil.substringFromFourthLetterToLastButOne());
        System.out.println("5) " + stringUtil.howManyTimesSubtxtInTxt());
        System.out.println("6) " + stringUtil.getWords());
        System.out.println("7) " + stringUtil.ifFirstAndLastWordTheSame());
    }
}