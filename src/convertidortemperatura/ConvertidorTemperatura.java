package convertidortemperatura;

/**
 *
 * @author tracher
 *
 * Este programa convierte temperaturas de grados Fahrenheit a grados Celsius
 *
 *
 */
import java.util.Scanner;

public class ConvertidorTemperatura {

    public static void main(String[] args) {

        final double PUNTO_CONGELACION = 32.0;
        final double FACTOR_CONVERSION = 5.0 / 9.0;
        double fahrenheit; // temperatura en Fahrenheit
        double celsius; // temperatura en Celsius

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELACION);
        System.out.println(fahrenheit + " grados Fahrenheit = "
                + celsius + " grados Celsius.");
    }
}

