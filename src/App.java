public class App {
    public static void main(String[] args) {
        // Instancia de la clase Metodos
        Metodos metodosOrdenamiento = new Metodos();


        // Arreglo inicial
        int[] arreglo = {5, 7, 30, 12, 9};


        // Ordenamiento ascendente
        System.out.println("Orden Ascendente:");
        int[] arregloOrdenadoAsc = metodosOrdenamiento.sortByBubble(arreglo.clone());
        metodosOrdenamiento.printArreglo(arregloOrdenadoAsc);


        // Ordenamiento descendente
        System.out.println("Orden Descendente:");
        int[] arregloOrdenadoDes = metodosOrdenamiento.sortByBubbleDes(arreglo.clone());
        metodosOrdenamiento.printArreglo(arregloOrdenadoDes);


        // Ordenar las palabras alfabéticamente de la cadena de texto
        String cadena = "este es un ejemplo de texto para ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubbleLet(palabras);
        System.out.println("Palabras ordenadas alfabéticamente:");
        metodosOrdenamiento.printArregloStrings(palabrasOrdenadas);
    }
}