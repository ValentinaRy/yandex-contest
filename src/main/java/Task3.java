import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения.
 * Желательно получить решение, которое не считывает входной файл целиком в память,
 * т.е., использует лишь константный объем памяти в процессе работы.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 15);
        int n = Integer.parseInt(reader.readLine());
        if (n < 1) return;
        int prevNum = Integer.parseInt(reader.readLine());
        System.out.println(prevNum);
        for (int i=1; i<n; i++) {
            int curNum = Integer.parseInt(reader.readLine());
            if (curNum != prevNum) {
                System.out.println(curNum);
                prevNum = curNum;
            }
        }
        reader.close();
    }
}
