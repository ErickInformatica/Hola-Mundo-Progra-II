package edu.umg;

import java.util.Scanner;

public class Hola_Mundo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Bienvenido a Progra 2 2022 " + nombre);

    }
}
