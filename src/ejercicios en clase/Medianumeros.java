import java.util.Scanner;

public class Medianumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("para calcular la media ingrese tres numeros");
        System.out.println("ingrese el primero numero: ");
       
        int num1= scanner.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int num2= scanner.nextInt();
        System.out.println("ingrese el tercer numero: ");
        int num3= scanner.nextInt();

        double media = (num1+num2+num3)/3;

    System.out.println("la media de los tres numeros ingresados es: " +media);

    scanner.close();
    }
}