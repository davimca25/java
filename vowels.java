import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(vogalRun(word));
    }
    static String vogalRun(String word) {
        String vogaisWord = "";
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (char v : vogais) {
                if (c == v) {
                    vogaisWord += c;
                }
            }
        }
        return vogaisWord;
    }
}