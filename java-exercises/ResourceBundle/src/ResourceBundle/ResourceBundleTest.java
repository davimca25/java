package ExerciciosCurso.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {

        int option = 2;
        Locale language = null;

        try {
            switch (option) {
                case 1:
                    language = new Locale("pt", "BR");
                    break;
                case 2:
                    language = new Locale("en", "US");
                    break;
                default:
                    System.err.println("INVALID LANGUAGE");


            }
            ResourceBundle bundle = ResourceBundle.getBundle("messages", language);

            System.out.println(bundle.getString("greetings"));
            System.out.println(bundle.getString("day.greeting"));

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
