package mx.itson.aa_uc2_268467;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vanni
 */
public class Busquedas {
    
    // Clase interna Nodo
    static class Nodo {
        int valor;
        Nodo izq;
        Nodo der;
        
        public Nodo(int valor) {
            this.valor = valor;
            this.izq = null;
            this.der = null;
        }
    }
    
    // Clase interna ArbolBinario 
    public static class ArbolBinario {
        Nodo raiz;
        
        public void insertar(int valor) {
            raiz = insertarRecursivo(raiz, valor);
        }
        
        private Nodo insertarRecursivo(Nodo actual, int valor) {
            if (actual == null) {
                return new Nodo(valor);
            }
            
            if (valor < actual.valor) {
                actual.izq = insertarRecursivo(actual.izq, valor);
            } else if (valor > actual.valor) {
                actual.der = insertarRecursivo(actual.der, valor);
            }
            
            return actual;
        }
        //la función busca por medio de la clave el valor solicitado por el usuario
        public boolean buscar(int clave) {
            return buscarRecursivo(raiz, clave);
        }
        
        //Se encarga de buscar de forma recursiva, cuantas veces sean necesarias, el valor siempre y cuado el actual no sea igual a null
        
        private boolean buscarRecursivo(Nodo actual, int clave) {
            if (actual == null) return false;
            if (clave == actual.valor) return true;
            
            if (clave < actual.valor) {
                return buscarRecursivo(actual.izq, clave);
            } else {
                return buscarRecursivo(actual.der, clave);
            }
        }
        // Se encarga de eliminar llamando a la función recursiva(o sea llamandose a sí misma las veces que sean necesarias) el valor que el usuario ingrese
        //recibe el parametro valor de tipo intero que es el que ingresa el usuario
        public void eliminar(int valor) {
            raiz = eliminarRecursivo(raiz, valor);
        }
        /**
        *Elimina de forma recursiva utilizando el nodo actual y
        * el valor como parametros, se hace principalmente una comparación dónde si el actual no es null procede la operación
        * Y proccede a hacerce comparaciones para determinar si esta en la izquierda o derecha 
        *
        */
        private Nodo eliminarRecursivo(Nodo actual, int valor) {
            if (actual == null) return null;
            
            if (valor < actual.valor) {
                actual.izq = eliminarRecursivo(actual.izq, valor);
            } else if (valor > actual.valor) {
                actual.der = eliminarRecursivo(actual.der, valor);
            } else {
                if (actual.izq == null && actual.der == null) {
                    return null;
                }
                if (actual.izq == null) return actual.der;
                if (actual.der == null) return actual.izq;
                
                actual.valor = encontrarMinimo(actual.der);
                actual.der = eliminarRecursivo(actual.der, actual.valor);
            }
            return actual;
        }
        
        // se usa para la funcion de eliminar y es principalmente para buscar el menor 
        private int encontrarMinimo(Nodo actual) {
            int min = actual.valor;
            while (actual.izq != null) {
                min = actual.izq.valor;
                actual = actual.izq;
            }
            return min;
        }
        
        public void imprimirArbol() {
            //se imprime el arbol, se hace con cada elemento mediante el uso de la def 
            imprimirJerarquico(raiz, 0);
        }
         //se imprime según la Jerarquía
        private void imprimirJerarquico(Nodo actual, int nivel) {
            if (actual == null) return;
            
            imprimirJerarquico(actual.der, nivel + 1);
            
            if (nivel != 0) {
                for (int i = 0; i < nivel - 1; i++) System.out.print("|\t");
                System.out.println("|-------" + actual.valor);
            } else {
                System.out.println(actual.valor);
            }
            
            imprimirJerarquico(actual.izq, nivel + 1);
        }
    }
}