import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Даны две строки, состоящие из строчных латинских букв.
 * Требуется определить, являются ли эти строки анаграммами, т. е. отличаются ли они только порядком следования символов.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 15);
        int start = 'a';
        int end = 'z';
        int c = 0;
        boolean readingFirst = true;
        int[] counts = new int[end-start+1];
        while ((c = reader.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                readingFirst = false;
            } else {
                if (readingFirst) {
                    // counting number of chars by incrementing
                    counts[ch - start]++;
                } else {
                    // counting number of similar chars by decrementing
                    counts[ch - start]--;
                }
            }
        }
        reader.close();
        for (int i=0; i< counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
