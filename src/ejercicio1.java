import java.util.Scanner;

public class ejercicio1 {
    //Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("por favor, ingrese dos numeros: ");
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        
        if (numero1>numero2) {
            double adición = (numero1+numero2);
            double diferencia= (numero1-numero2);
            System.out.println("El primer número es mayor que el segundo.");
            System.out.println("Suma: " + adición);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = (numero1*numero2);
            double división = (numero1/numero2);
            System.out.println("El primer número no es mayor que el segundo.");
            System.out.println("Producto: " + producto);
            System.out.println("División: " + división);
        }
    }
}
