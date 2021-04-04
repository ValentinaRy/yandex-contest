import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Даны две строки строчных латинских символов: строка J и строка S.
 * Символы, входящие в строку J, — «драгоценности», входящие в строку S — «камни».
 * Нужно определить, какое количество символов из S одновременно являются «драгоценностями».
 * Проще говоря, нужно проверить, какое количество символов из S входит в J.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String J = reader.readLine();
        String S = reader.readLine();

        Set<Character> charsJ = new HashSet<>(J.length());
        for (int i=0; i<J.length(); i++) {
            charsJ.add(J.charAt(i));
        }

        int result = 0;
        for (int i=0; i<S.length(); i++) {
            if (charsJ.contains(S.charAt(i))) {
                result++;
            }
        }

        System.out.println(result);
    }
}
