import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String fname = System.getProperty("user.home") + "/Test/iter.txt";
        BufferedReader bufferedReader = null;

        try {
            File file = new File(fname);
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            StringTokenizer st = new StringTokenizer(line);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int limit = Integer.parseInt(st.nextToken());

            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (sum + i > limit) {
                    break;
                }
                sum += i;
            }
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("***");
            System.exit(-1);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}