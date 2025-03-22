import java.util.Scanner;

public class ejercicio5 {
    //Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("inrese dos numeros ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        if (numero1<numero2) {
            System.out.println("el numero mayor es: " +numero2);
        } else {
            System.out.println("el numero mayor es: " +numero1);
        }
    }
}
