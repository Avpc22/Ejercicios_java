import java.util.Scanner;

public class ejercicio3 {
    //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("ingese un numero del 1 al 99: ");
    int numero = input.nextInt();

    if (10>= numero && numero<=99) {
        System.out.println("el numero ingresado es de dos digitos");
    } else {
      System.out.println("el numero ingresado es de un solo digito");
       
    }


}
}