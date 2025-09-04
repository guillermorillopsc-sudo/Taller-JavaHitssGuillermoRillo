package test;

import mamiferos.*;

public class TestMain {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sabana Africana", 1.2, 2.1, 190, "Panthera leo", 7.5, 80, 15, 114);
        Mamifero tigre = new Tigre("Selva Asiática", 1.1, 2.5, 220, "Panthera tigris", 8.0, 65, "Bengala");
        Mamifero guepardo = new Guepardo("Sabana", 0.9, 1.5, 72, "Acinonyx jubatus", 5.0, 115);
        Mamifero lobo = new Lobo("Bosques", 0.8, 1.6, 80, "Canis lupus", "Gris", 4.5, 6, "Ártico");
        Mamifero perro = new Perro("África", 0.75, 1.2, 30, "Lycaon pictus", "Manchado", 3.5, 317);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero animal : mamiferos) {
            System.out.println("----------------------------------");
            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
