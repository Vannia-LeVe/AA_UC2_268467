package mx.itson.aa_uc2_268467;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vanni
 */
public class Ordenamientos {
    
    public static void burbuja(int[] arreglo) {

        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }

            }
        }
    }
}
    
    

