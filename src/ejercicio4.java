import java.util.Scanner;
//Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("ingrese su sueldo en dolares: ");
        int sueldo= input.nextInt();
        if (sueldo> 3000) {
            System.out.println("usted debe pagar impuestos");
        }
    }
}