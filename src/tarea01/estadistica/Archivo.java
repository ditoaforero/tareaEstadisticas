/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01.estadistica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dito
 */
public class Archivo {

    /*
    Metodo: Metodo para leer el archivo, trae la informacion en LinkedList
    */
    public LinkedList leerArchivo(String ruta) {
        // Se crea una linkedlist auxilar 
        LinkedList ll = null;
        // Se valida si existe el archivo
        File fichero = new File(ruta);
        if(!fichero.exists()){
            return ll;
        }
        ll = new LinkedList();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String line;
            // Se recorre el archivo y se va llenando el LinkedList
            while ((line = br.readLine()) != null) {
                ll.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ll;
    }
}
