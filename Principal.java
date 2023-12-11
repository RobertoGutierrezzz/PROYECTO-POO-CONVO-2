
package com.mycompany.ccodigo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos para el Profesor Interino
        System.out.println("Ingrese los datos para el Profesor Interino:");
        System.out.print("Nombre: ");
        String nombreInterino = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidosInterino = scanner.nextLine();
        System.out.print("Edad: ");
        int edadInterino = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("ID de Profesor: ");
        String idInterino = scanner.nextLine();
        System.out.print("Fecha de comienzo de interinidad (año mes día): ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        Calendar fechaInterino = Calendar.getInstance();
        fechaInterino.set(year, month - 1, day);

        // Crear el objeto Profesor Interino
        ProfesorInterino profInterino = new ProfesorInterino(fechaInterino, idInterino, nombreInterino, apellidosInterino, edadInterino);

        // Ingreso de datos para el Profesor Titular
        System.out.println("\nIngrese los datos para el Profesor Titular:");
        System.out.print("Nombre: ");
        String nombreTitular = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidosTitular = scanner.nextLine();
        System.out.print("Edad: ");
        int edadTitular = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("ID de Profesor: ");
        String idTitular = scanner.nextLine();

        // Crear el objeto Profesor Titular
        ProfesorTitular profTitular = new ProfesorTitular(idTitular, nombreTitular, apellidosTitular, edadTitular);

        // Cerrar el scanner
        scanner.close();

        // Crear la lista de profesores y agregar los objetos creados
        ListaProfesores listaProf = new ListaProfesores();
        listaProf.AddProfesor(profInterino);
        listaProf.AddProfesor(profTitular);

        // Imprimir la lista de profesores
        listaProf.ImprimirLista();

        // Calcular e imprimir el importe total de la nómina
        System.out.println("\nImporte total de la nómina: C$ " + listaProf.ImporteNomina());
    }
}
