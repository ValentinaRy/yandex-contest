import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
