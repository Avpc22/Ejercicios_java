import java.util.Scanner;

public class ejercicio2 {
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la primera nota ");
        double nota1= input.nextDouble();
       
        System.out.println("ingrese la segunda nota ");
        double nota2= input.nextDouble();
        
        System.out.println("ingrese la tercera nota ");
        double nota3= input.nextDouble();
        
        double promedio = (nota1+nota2+nota3)/3 ;
        System.out.println("su promedio es: " +promedio);
         if (promedio>= 70) {
            System.out.println("promocionado");
        }
       


    }
}
