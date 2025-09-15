public class Main {
    public static void main(String[] args) {
        // Bolsa de frutas
        Fruta[] frutas = new Fruta[5];
        frutas[0] = new Fruta("Manzana", 12.5, 0.25, "Rojo");
        frutas[1] = new Fruta("Banana", 8.0, 0.30, "Amarillo");
        frutas[2] = new Fruta("Pera", 10.0, 0.28, "Verde");
        frutas[3] = new Fruta("Naranja", 9.5, 0.35, "Naranja");
        frutas[4] = new Fruta("Uva", 15.0, 0.05, "Morado");

        // Bolsa de limpieza
        Limpieza[] limpieza = new Limpieza[5];
        limpieza[0] = new Limpieza("Cloro", 20.0, "Desinfectante", 1.0);
        limpieza[1] = new Limpieza("Jabón Líquido", 18.5, "Detergente", 0.8);
        limpieza[2] = new Limpieza("Suavizante", 25.0, "Textil", 1.2);
        limpieza[3] = new Limpieza("Desinfectante", 30.0, "Multiusos", 1.5);
        limpieza[4] = new Limpieza("Shampoo", 40.0, "Cuidado personal", 0.6);

        // Bolsa de lácteos
        Lacteo[] lacteos = new Lacteo[5];
        lacteos[0] = new Lacteo("Leche", 18.0, 1, 8);
        lacteos[1] = new Lacteo("Yogurt", 15.0, 1, 5);
        lacteos[2] = new Lacteo("Queso", 40.0, 0, 10);
        lacteos[3] = new Lacteo("Crema", 22.0, 0, 6);
        lacteos[4] = new Lacteo("Mantequilla", 28.0, 0, 4);

        // Bolsa de no perecibles
        NoPerecible[] noPerecibles = new NoPerecible[5];
        noPerecibles[0] = new NoPerecible("Arroz", 30.0, 1000, 3500);
        noPerecibles[1] = new NoPerecible("Frijol", 28.0, 900, 3000);
        noPerecibles[2] = new NoPerecible("Lenteja", 32.0, 850, 2800);
        noPerecibles[3] = new NoPerecible("Pasta", 20.0, 500, 1600);
        noPerecibles[4] = new NoPerecible("Harina", 25.0, 1000, 3400);

        // Mostrar resultados
        System.out.println("=== Frutas ===");
        for (Fruta f : frutas) {
            System.out.println("Nombre: " + f.getNombre() + " | Precio: " + f.getPrecio()
                    + " | Peso: " + f.getPeso() + "kg | Color: " + f.getColor());
        }

        System.out.println("\n=== Limpieza ===");
        for (Limpieza l : limpieza) {
            System.out.println("Nombre: " + l.getNombre() + " | Precio: " + l.getPrecio()
                    + " | Tipo: " + l.getTipo() + " | Litros: " + l.getLitros());
        }

        System.out.println("\n=== Lácteos ===");
        for (Lacteo la : lacteos) {
            System.out.println("Nombre: " + la.getNombre() + " | Precio: " + la.getPrecio()
                    + " | Cantidad: " + la.getCantidad() + " | Proteínas: " + la.getProteinas());
        }

        System.out.println("\n=== No Perecibles ===");
        for (NoPerecible np : noPerecibles) {
            System.out.println("Nombre: " + np.getNombre() + " | Precio: " + np.getPrecio()
                    + " | Contenido: " + np.getContenido() + "g | Calorías: " + np.getCalorias());
        }
    }
}