/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_268467;

import java.util.Scanner;


/**
 *
 * @author Vanni
 */
public class Main {
    
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        int[] arreglo = {4,1, 3, 4};

        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Burbuja");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("4. Quicksort");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            Ordenamientos.burbuja(arreglo);
            System.out.println("Ordenado con Burbuja:");
        } else if (opcion == 2) {
            Ordenamientos.selectionSort(arreglo);
            System.out.println("Ordenado con Selección:");
        } else if (opcion == 3) {
            Ordenamientos.insertionSort(arreglo);
            System.out.println("Ordenado por Inserción:"); 
        }else if (opcion == 4) {
            System.out.println("Ordenado por : Quicksort "); 
            Ordenamientos.quickSort(arreglo, 0, arreglo.length -1);
            
        } else {
            System.out.println("Opción no válida");
            return;
        }

        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
     
