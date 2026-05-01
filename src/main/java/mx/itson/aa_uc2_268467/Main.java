package mx.itson.aa_uc2_268467;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Métodos de Ordenamiento");
            System.out.println("2. Árbol Binario de Búsqueda");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            
            int opcionPrincipal = sc.nextInt();
            
            switch (opcionPrincipal) {
                case 1:
                    menuOrdenamiento(sc);
                    break;
                case 2:
                    menuArbolBinario(sc);
                    break;
                case 3:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        sc.close();
    }
    
    // Método para el menú de ordenamiento (tu código original)
    private static void menuOrdenamiento(Scanner sc) {
        int[] arreglo = {19, 2, 36, 8, 1, 24};
        
        System.out.println("\n--- Métodos de Ordenamiento ---");
        System.out.println("1. Burbuja");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("4. Quicksort");
        System.out.println("5. MergeSort");
        System.out.print("Opción: ");
        
        int opcion = sc.nextInt();
        
        // Copia del arreglo original para no afectar otras operaciones
        int[] arregloCopia = arreglo.clone();
        
        switch (opcion) {
            case 1:
                Ordenamientos.burbuja(arregloCopia);
                System.out.println("Ordenado con Burbuja:");
                break;
            case 2:
                Ordenamientos.selectionSort(arregloCopia);
                System.out.println("Ordenado con Selección:");
                break;
            case 3:
                Ordenamientos.insertionSort(arregloCopia);
                System.out.println("Ordenado por Inserción:");
                break;
            case 4:
                Ordenamientos.quickSort(arregloCopia, 0, arregloCopia.length - 1);
                System.out.println("Ordenado con Quicksort:");
                break;
            case 5:
                Ordenamientos.mergeSort(arregloCopia, 0, arregloCopia.length - 1);
                System.out.println("Ordenado con MergeSort:");
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        for (int num : arregloCopia) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Método para el menú del árbol binario
    private static void menuArbolBinario(Scanner sc) {
        Busquedas.ArbolBinario bst = new Busquedas.ArbolBinario();
        
        // Insertar valores iniciales
        int[] valoresIniciales = { 50, 30, 70, 20, 40, 60, 80};
        for (int v : valoresIniciales) {
            bst.insertar(v);
        }
        
        System.out.println("\n--- Árbol Binario de Búsqueda ---");
        System.out.println("Árbol inicial creado con: 50, 30, 70, 20, 40, 60, 80");
        
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- Operaciones del Árbol ---");
            System.out.println("1. Mostrar árbol");
            System.out.println("2. Insertar valor");
            System.out.println("3. Buscar valor");
            System.out.println("4. Eliminar valor");
            System.out.println("5. Volver al menú principal");
            System.out.print("Opción: ");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nEstructura del árbol:");
                    bst.imprimirArbol();
                    break;
                    
                case 2:
                    System.out.print("Ingrese el valor a insertar: ");
                    int valorInsertar = sc.nextInt();
                    bst.insertar(valorInsertar);
                    System.out.println("✓ Valor " + valorInsertar + " insertado");
                    break;
                    
                case 3:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = sc.nextInt();
                    boolean encontrado = bst.buscar(valorBuscar);
                    if (encontrado) {
                        System.out.println(" Valor " + valorBuscar + " ENCONTRADO en el árbol");
                    } else {
                        System.out.println(" Valor " + valorBuscar + " NO encontrado");
                    }
                    break;
                    
                case 4:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valorEliminar = sc.nextInt();
                    bst.eliminar(valorEliminar);
                    System.out.println("✓ Valor " + valorEliminar + " eliminado (si existía)");
                    break;
                    
                case 5:
                    volver = true;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}