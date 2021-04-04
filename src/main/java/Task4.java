import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дано целое число n. Требуется вывести все правильные скобочные последовательности длины 2 ⋅ n,
 * упорядоченные лексикографически (см. https://ru.wikipedia.org/wiki/Лексикографический_порядок).
 * В задаче используются только круглые скобки.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 15);
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        recursivePrint(n, n, "");
    }

    private static void recursivePrint(int leftOpen, int leftClosed, String s) {
        if (leftOpen > 0 && leftClosed > 0) {
            recursivePrint(leftOpen - 1, leftClosed, s+"(");
            if (leftOpen < leftClosed) {
                recursivePrint(leftOpen, leftClosed - 1, s+")");
            }
        }
        if (leftOpen == 0) {
            System.out.print(s);
            for (int i=0;i<leftClosed;i++) {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
