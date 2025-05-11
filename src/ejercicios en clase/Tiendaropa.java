public class Tiendaropa {

    public static void main(String[] args) {
    
        double descuento = 0.15;
        float precioCamiseta = 25;
        float precioPantalon = 30;

        float descuentopantalon = precioPantalon * (1 - (float) descuento);
        float descuentoCamiseta = precioCamiseta * (1 - (float) descuento);

        int cantidadCamiseta = 2;
        int cantidadPantalon = 2;
        float precioTotal = (descuentopantalon * cantidadPantalon) + (descuentoCamiseta * cantidadCamiseta);

        System.out.println("Precio total de todas las prendas: " + precioTotal);
        System.out.println("Precio del pantalón con descuento: " + descuentopantalon);
        System.out.println("Precio de la camiseta con descuento: " + descuentoCamiseta);
    }
}
