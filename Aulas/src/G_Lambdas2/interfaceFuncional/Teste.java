package G_Lambdas2.interfaceFuncional;
import java.util.Locale;


public class Teste {

    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("products:");

        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, whic price is $ %.2f%n", product2, price2);

        System.out.printf("record: %d years old, code %d and gender: $s%n", age, code, gender);

        System.out.printf("measure with eight decimal places: %.8f%n", measure);
        System.out.printf("rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);

        System.out.printf("us decimal point: %.3f%n", measure);

    }
}
