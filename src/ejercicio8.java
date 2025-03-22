import java.util.Scanner;

public class ejercicio8 {
    /*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            
         System.out.println("ingrese el numero de preguntas realizadas: ");
        int numeroPreguntas= input.nextInt();
        System.out.println("ingrese el total de preguntas que respondio bien: ");
        int respuestasCorrectas = input.nextInt();

        double porcentaje = (respuestasCorrectas/numeroPreguntas*100);
        if (porcentaje>=90) {
            System.out.println("el asppirante esta en nivel maximo" +porcentaje + "%");
        } else  {
           if (porcentaje >=75 && porcentaje <90) {
            System.out.println("Nivel medio"  +porcentaje + "%");
           } else {
            if (porcentaje >=50 && porcentaje<75 ) {
                System.out.println("nivel regular"  +porcentaje + "%");
            } else {
                if (porcentaje<50) {
                    System.out.println("aspirante fuera de nivel"  +porcentaje + "%");
                }
            }
           }
        }
    }
}
