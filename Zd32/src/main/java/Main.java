import javax.swing.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String in = JOptionPane.showInputDialog(null, "Podaj 3 liczby rozdzielone spacją");
        Scanner scan = new Scanner(in);
        String msg = "";
        try {
            msg += NumTeller.say(scan.nextInt()) + '\n';
            msg += NumTeller.say(scan.nextInt()) + '\n';
            msg += NumTeller.say(scan.nextInt()) + '\n';
        } catch (InputMismatchException e) {


            System.out.println("Wprowadź liczby a nie litery");
        } catch (NoSuchElementException e) {
            System.out.println("Wprowadź 3 liczby");
        }

        System.out.println(msg);

    }
}
