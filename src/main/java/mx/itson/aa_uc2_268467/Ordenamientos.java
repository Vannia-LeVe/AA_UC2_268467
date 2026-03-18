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
    
    public static void burbuja(int[] arreglo) { //complejidad de big O(n^2)
           
        int n = arreglo.length; //n= 3 
                           //3-1=2
        for (int i = 0; i < n - 1; i++) { // 
            // i=0 el arreglo esta como [4,5,4]
            // i=1 el arreglo esta como [4,4,5]
            
                              //3-0-1=2
            for (int j = 0; j < n - i - 1; j++) {
                //arreglo es igual a {4,5,4}
                                  // 0 1 2 ---indice 
                // i=0, j=0 se compara posición 0 y 1
                // i=0, j=1: compara posición 1 y 2 
                // i=1, j=0: compara posición 0 y 1

                if (arreglo[j] > arreglo[j + 1]) {
                        //1.-4        >   5, falso por lo tanto no entra al if
                        //2.-5        >   4, verdadero por lo tanto entra al if
                        //3.- 4       >   4, falso, no entra 
                    
              //Cambiar los la posición de los valores 
                    int aux = arreglo[j]; //1.- no entró  2.- aux= 5
                    arreglo[j] = arreglo[j + 1]; //1.- no entró  2.- arreglo[j] =4
                    arreglo[j + 1] = aux;//1.- no entró 2.- arreglo[j + 1] = 5
                    
              //RESULTADOS: 
                    //1.-{4,5,4}
                    //2.-{4,4,5}
                    //3.-{4,4,5}
                }

            }
        }
    }
    
      public static void selectionSort(int[] arr){ //complejidad de big O(n^2)

        int n = arr.length;//n= 3 
                            //3-1=2
        for (int i = 0; i < n - 1; i++){ //1.- i=0 arreglo {5,3,4}  2.- i=1  arreglo{ 3,4,5}
     
            int indiceMinimo = i;//1.- i=0 indiceMinimo= 0, 2.- i=1 indiceMinimo= 1,

            
            for (int j = i + 1; j < n; j++){
                
                if (arr[j] < arr[indiceMinimo]){// 1.- 3<5 (verdadero) entra al indice 2.- 4<3 (falso) no cambia 
                                               // 1.- 4<5 verdadero
                                               
                    indiceMinimo = j; // se cambia la posición del número menor 
                }

            }
             // se hace el intercambio 
             
            int aux = arr[indiceMinimo]; // 1,.aux =3   2.- 4
           
            arr[indiceMinimo] = arr[i]; //donde el la posisción donde estaba 3(1) se le cambia el valor a 5
            
            
            arr[i] = aux; // arr[0] = 3

        }
        
    }
      public static void insertionSort(int[] arr){ //BIG O(n^2)
          
        int n = arr.length; //n= 3
        
        for (int i = 1; i < n; i++){
            // 1.- i = 1  arreglo {5,3,4}
            // 2.- i = 2  arreglo {3,5,4}
            
            int key = arr[i];
            // key= 3
            // key= 4
            
            int j = i - 1;
            // 1.- j = 0 (que en el arreglo es 5
            // 2.- j = 1 (que en la segunda i sería el 5 ya que ca,bió a la posición 1) 
            
            while (j >= 0 && arr[j] > key){
                //1.- es verdadero porque j es igual que 0 y 5>3
                //2.- es verdadero porque j es mayor que 0 y 5>4
                
                arr[j + 1] = arr[j]; //1.- se inserta en la 1 el 5 //2.- Se inserta en la posición 2 el 5
                
                
                j = j - 1; //1.- j = -1  // 2.- j= 0
            }
            arr[j + 1] = key; //1.- -1+1= 0 , el index 0 será igual 3 // 2.- 0+1=1 el index 1 será igual 4
        }
    }
        
}
    
    

