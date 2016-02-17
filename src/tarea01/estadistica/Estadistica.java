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
public class Estadistica {

    /*
    Metodo: Calcula la media de un listado de registros pasados en un LinkedList
    */
    public static double calcularMedia(LinkedList ll) {
        int cantidadNumeros = 0;
        double sumatoria = 0;
        for (Object valor : ll) {
            if (esNumerico(valor)) {
                cantidadNumeros++;
                sumatoria = (double) sumatoria + Double.valueOf((String) valor);
            }
        }
        return (double) sumatoria / cantidadNumeros;
    }

    /*
    Metodo: Calcula la desviación standart a partir de los valres recibidos en un LinkedList
    */
    public static double calcularDesviacionEstandar(LinkedList ll) {
        double varianza = Estadistica.calcularVarianza(ll);
        return (double) Math.pow(varianza, 0.5);
    }


    /*
    Metodo: Calcular varianza, calcula la varianza a partir de los valores recibidos en un LinkedList
    */
    private static double calcularVarianza(LinkedList ll) {
        int cantidadNumeros = 0;
        double media = Estadistica.calcularMedia(ll);
        double base = 0;
        double sumatoria = 0;
        for (Object valor : ll) {
            if (esNumerico(valor)) {
                cantidadNumeros++;
                base = (double) Double.valueOf((String) valor) - media;
                sumatoria = (double) sumatoria + Math.pow(base, 2);
            }
        }
        return (double) sumatoria / (cantidadNumeros-1);
    }

    /*
    Metodo: verifica si el valor recibido es numerico
    */
    private static boolean esNumerico(Object valor) {
        try {
            Double.valueOf((String) valor);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
