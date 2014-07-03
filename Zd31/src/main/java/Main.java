/**
 * Created by Bartłomiej on 2014-06-22.
 */
public class Main {
    public static void main(String[] args) {
        Appender ap = new Appender("Ala");
        ap.append(" ma kota", 3).append( " i psa", 2);
        System.out.println(ap);
        ap.append(" ojej", 3);
        System.out.println(ap);
    }
}
