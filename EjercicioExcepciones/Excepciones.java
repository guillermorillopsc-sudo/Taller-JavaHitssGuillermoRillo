// Clase Alumno
class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad < 18) {
            throw new EdadInvalidaException("El alumno debe tener al menos 18 años");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Edad: " + edad;
    }
}

// Excepción personalizada
class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Clase principal
public class  Excepciones {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        int indice = 0;

        try {
            alumnos[indice++] = new Alumno("Juan", 20);
            alumnos[indice++] = new Alumno("María", 19);
            alumnos[indice++] = new Alumno("Pedro", 17); // Lanza EdadInvalidaException
            alumnos[indice++] = new Alumno("Ana", 21);   // Lanza ArrayIndexOutOfBoundsException
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println(" Edad inválida: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" No puedes registrar más de 3 alumnos.");
        }

        System.out.println("\n--- Alumnos registrados ---");
        for (Alumno a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }
}