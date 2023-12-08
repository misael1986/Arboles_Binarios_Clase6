/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles_binarios_clase6;

/**
 *
 * @author misael.perilla
 */
public class Arbol_Binario {

    Nodo raiz;

    public Arbol_Binario() {
        raiz = null;
    }

    public void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (info < reco.info) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;
                }
            }
            if (info < anterior.info) {
                anterior.izq = nuevo;
            } else {
                anterior.der = nuevo;
            }
        }
    }

    private void imprimirPre(Nodo reco) {
        if (reco != null) {
            System.out.print(reco.info + " ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }

    public void imprimirPreorden() {
        imprimirPre(raiz);
        System.out.println();
    }

    private void imprimirInorden(Nodo reco) {
        if (reco != null) {
            imprimirInorden(reco.izq);
            System.out.print(reco.info + " ");
            imprimirInorden(reco.der);
        }
    }

    public void imprimirInorden() {
        imprimirInorden(raiz);
        System.out.println();
    }

    private void imprimirPostOrden(Nodo reco) {
        if (reco != null) {
            imprimirPostOrden(reco.izq);
            imprimirPostOrden(reco.der);
            System.out.print(reco.info + " ");
        }
    }

    public void imprimirPostOrden() {
        imprimirPostOrden(raiz);
        System.out.println();
    }

}
