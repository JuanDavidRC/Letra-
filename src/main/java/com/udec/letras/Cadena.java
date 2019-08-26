/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.letras;

import java.util.Scanner;

/**
 * clase cadena que contiene la logica del programa
 * @author Alejandro torres
 * @author JUAN DAVID REYES
 */
public class Cadena {
    Scanner  entrada = new Scanner(System.in);
    /**
     * variable que contiene la frase 
     */
    char [] cadena;
    /**
     * costructor con los metodos creados 
     * y la exepcion para el retaso en la impresion
     * @throws InterruptedException 
     */
    public Cadena() throws InterruptedException {
        llenar();
        obtenerLetra();
    }
    
    /**
     * metodo vacio que pide los datos de el 
     * programa y convierte la frase a un arreglo 
     * frase contiene la frase a compara
     * cadena contiene el arreglo convertido
     */
    
    public void llenar() {
   
    String frase = "";
    
    System.out.println("Escribe una frase: ");

    frase = entrada.nextLine();
    cadena = frase.toCharArray();
       
    }
    /**
     * metodo en el que se compara la frase y se obtiene
     * la letra que no se repite
     * @throws InterruptedException
     * catidad se compara con el contador para reemplazar al contenedor
     * caracter reemplazo 
     * conteo contabiliza las letras que no se repiten
     * reempplazo toma caracter por caracter y lo compara
     */
    public void obtenerLetra() throws InterruptedException{
    int cantidad = 0;
    char caracter =0;
    int conteo;
    char reemplazo;
    for(int i=0; i<cadena.length; i++){
            reemplazo = cadena[i];
             conteo = 0;
        for (int j =0; j<cadena.length; j++){
            if (cadena[j] != reemplazo)
                conteo++;
        }
        if(cantidad < conteo) {
            cantidad = conteo;
            caracter = reemplazo;
        }
        System.out.println("\nLeyendo caracter..."+cadena[i]);
        Thread.sleep(1000);
        System.out.println("Comparando con caracter... "+caracter);
        Thread.sleep(1000);
    }
    System.out.println(caracter+":Primer letra en no repetirse ");
    }
}
