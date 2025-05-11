public class Retiro {
        public static void main(String[] args) {
            int cantidadDinero = 1000;
            System.out.println("el dinero en cuenta es: "+cantidadDinero);
            int cantidadRetiro = 200;
            System.out.println("la cantidad de dinero que se retira semanalmente es: "+cantidadRetiro);
            byte semanas = 4;
            int total;
            total= cantidadDinero-(cantidadRetiro * semanas);
            System.out.println("El total de dinero que queda despues de retirar 200 semanalmente es: "+total);
            
        
        }
    
}
