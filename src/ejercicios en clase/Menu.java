import java.util.Scanner;

public class Menu {
     public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
       System.out.println("ingrese el número del menú que desea ordenar: 1. sopa, 2.ensalada, 3.frijoles");
         int menú = input.nextInt();
        switch (menú) {
            case 1:
                System.out.println("pedido recibido, usted ordenó: sopa");
                break;
            case 2:
                System.out.println("pedido recibido, usted ordenó: ensalada");
                break;
            case 3:
                System.out.println("pedido recibido, usted ordenó: frijoles");
                break;
            default:
                System.out.println("esa opcion no está en el menú de hoy, vuelva aintentarlo");
                break;

             
        }
        input.close();

    }
}