class Metodos {
    // Método de ordenamiento por burbuja en orden ascendente
    public int[] sortByBubble(int[] arreglo) 
    {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) 
                {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }


    // Método de ordenamiento por burbuja en orden descendente
    public int[] sortByBubbleDes(int[] arreglo) 
    {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) 
            {
                if (arreglo[j] < arreglo[j + 1]) 
                {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }


    public String[] sortByBubbleLet(String[] palabras) 
    {
        int tamanio = palabras.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) 
            {
                if (palabras[j].compareToIgnoreCase(palabras[j + 1]) > 0) 
                {
                    String aux = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = aux;
                }
            }
        }
        return palabras;
    }


    // Método para imprimir el arreglo de enteros
    public void printArreglo(int[] arreglo) 
    {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }


    // Método para imprimir el arreglo de cadenas
    public void printArregloStrings(String[] palabras) 
    {
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}