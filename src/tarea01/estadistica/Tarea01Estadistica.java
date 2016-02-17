/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01.estadistica;

import java.util.LinkedList;

/**
 *
 * @author Dito
 */
public class Tarea01Estadistica {

    /**
     * @param args the command line arguments
     */
    /*
    Metodo: Main, metodo principal de ejecución
    */
    public static void main(String[] args) {
        // TODO code application logic here

        // Lectura del archivo
        String ruta = null;

        ruta = "src/Archivos/archivo00.txt";
        ejecucion(ruta);
        ruta = "src/Archivos/archivo01.txt";
        ejecucion(ruta);
        ruta = "src/Archivos/archivo02.txt";
        ejecucion(ruta);
        ruta = "src/Archivos/archivo03.txt";
        ejecucion(ruta);

    }

    /*
    Metodo: Ejecución, metodo auxiliar de ejecución
    */
    public static void ejecucion(String ruta) {
        Archivo archivo = new Archivo();
        double valorOperacion = 0;
        LinkedList ll;
        System.out.println("===================================");
        System.out.println("Archivo: " + ruta);
        ll = archivo.leerArchivo(ruta);
        if (ll == null) {
            System.out.println("El archivo no existe");
        } else {
            System.out.println("El archivo leido es: " + ll.toString());
            // Operaciones estadisticas 
            valorOperacion = Estadistica.calcularMedia(ll);
            System.out.println("El valor de la media es: " + valorOperacion);
            valorOperacion = Estadistica.calcularDesviacionEstandar(ll);
            System.out.println("El valor de la desviacion estandar es: " + valorOperacion);
            System.out.println("===================================");
        }
    }
}
