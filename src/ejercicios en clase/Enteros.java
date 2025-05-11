import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int inicio = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int fin = scanner.nextInt();

        System.out.println("El primer número es: " + inicio + ", el segundo número es: " + fin);

        if (inicio < 0 || fin < inicio) {
            System.out.println("Rango no válido");
            scanner.close();
            return;
        }

        int contPrimos = 0;

        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                contPrimos++;
                System.out.println(i); 
            }
        }

        // Mostrar el total de números primos encontrados
        System.out.println("Total de números primos en el rango: " + contPrimos);

        
        scanner.close();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) return false;
        }
        return true;
    }
}
