/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arboles_binarios_clase6;

/**
 *
 * @author misael.perilla
 */
public class Arboles_Binarios_Clase6 {

    public static void main(String[] args) {
        Arbol_Binario arbol = new Arbol_Binario();
          arbol.insertar (100);
          arbol.insertar (50);
          arbol.insertar (25);
          arbol.insertar (75);
          arbol.insertar (150);
          
          System.out.println("Impresion en preorden: ");
          arbol.imprimirPreorden();
          System.out.println("Impresion en Inorden: ");
          arbol.imprimirInorden();
          System.out.println("Impresion en Postorden: ");
          arbol.imprimirPostOrden ();       
    }
}
