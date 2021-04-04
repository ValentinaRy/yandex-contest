import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.
 * Желательно получить решение, работающее за линейное время и при этом проходящее по входному массиву только один раз.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int result = 0;
        int curNumOfOnes = 0;
        for (int i=0; i<n; i++) {
            int curNum = Integer.parseInt(reader.readLine());
            if (curNum == 1) {
                curNumOfOnes++;
            } else { // curNum == 0
                if (curNumOfOnes > result) {
                    result = curNumOfOnes;
                }
                curNumOfOnes = 0;
            }
        }
        if (curNumOfOnes > result) {
            result = curNumOfOnes;
        }

        System.out.println(result);
    }
}
