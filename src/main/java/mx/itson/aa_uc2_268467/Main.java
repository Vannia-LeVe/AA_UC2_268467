/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_268467;


/**
 *
 * @author Vanni
 */
public class Main {
    
     public static void main(String[] args) {
         
        //int[] arreglob = {4,5,4};
        int[] arreglosort = {5,3,4};

        //Ordenamientos.burbuja(arreglob);
        
       Ordenamientos.selectionSort(arreglosort);
        
        //System.out.println("Arreglo ordenado con algoritmo de burbuja:");

       //for (int num : arreglob) {
       //     System.out.print(num + " ");
       // }
       System.out.println("Arreglo ordenado con algoritmo de Selección:");

       for (int num : arreglosort) {
            System.out.print(num + " ");
           
       }
 

    }
}
     
