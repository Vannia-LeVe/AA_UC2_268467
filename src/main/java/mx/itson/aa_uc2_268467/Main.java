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
         
        int[] arreglo = {5,3,8};

        Ordenamientos.burbuja(arreglo);

        System.out.println("Arreglo ordenado:");

        for (int num : arreglo) {
            System.out.print(num + " ");
        }

    }
}
     
