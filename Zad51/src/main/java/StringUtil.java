import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    private String txt;

    private String subtxt;

    public StringUtil(String txt, String subtxt) {
        this.txt = txt;
        this.subtxt = subtxt;
    }

    public int getLength() {

        return txt.length();
    }

    public String getFirstAndLastLetter() {
        char first = txt.charAt(0);
        char last = txt.charAt(txt.length() - 1);
        return first + " " + last;
    }

    public String substringFromFourthLetter() {
        if (txt.length() >= 4) {
            return txt.substring(3);
        } else {
            return "";
        }
    }

    public String substringFromFourthLetterToLastButOne() {
        if (txt.length() > 4) {
            return txt.substring(3, txt.length() - 1);
        } else {
            return "";
        }
    }

    public int howManyTimesSubtxtInTxt() {
        Pattern pattern = Pattern.compile(subtxt);
        Matcher matcher = pattern.matcher(txt);

        int i = 0;
        while (matcher.find()) {
            i++;
        }
        return i;
    }

    /**
     * Metoda zwraca tablicę wyrazów
     *
     * @return zwraca tablicę wyrazów z tekstu txt
     */
    private String[] getWordsArray() {
        StringTokenizer tokenizer = new StringTokenizer(txt, " ,.;");
        String[] words = new String[tokenizer.countTokens()];

        for (int i = 0; i < words.length; i++) {
            words[i] = tokenizer.nextToken();
        }

        return words;
    }

    public String getWords() {
        String[] words = getWordsArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public boolean ifFirstAndLastWordTheSame() {
        String[] words = getWordsArray();
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        return (firstWord.equals(lastWord));
    }


}