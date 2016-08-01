import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 31/07/16
 */
public class HDT3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        
        Lector lector = new Lector();
        int[] lista = lector.getText();
        String resultado = "ESA INSTRUCCION NO EXISTE.";
        String resultado1 = "";
        String resultado2 = "";
        
        Sort sorting = new Sort(lista);
        System.out.println("Bienvenido. Seleccione el numero del metodo de ordenamiento deseado:\n----------\n1.Insertion Sort\n2.Bubble Sort\n3.Merge Sort\n4.Quick Sort\n----------");
        System.out.println("NOTAS IMPORTANTES: SU ARCHIVO DE TEXTO DEBE LLAMARSE numeros.txt.\nOSCAR HIZO EL COMENTARIO QUE USTEDES PROVEERAN DICHO ARCHIVO.");
        String comando = teclado.nextLine();
        /*EJECUCION DESORDENADA*/
        if(comando.equals("1")){
            sorting.insertionSort();
            resultado = "EL ARREGLO SE HA ORDENADO POR INSERTION:";
            resultado1 = "EJECUCION DESORDENADA->";
        }
        
        if(comando.equals("2")){
            sorting.bubbleSort();
            resultado = "EL ARREGLO SE HA ORDENADO POR BUBBLE:";
            resultado1 = "EJECUCION DESORDENADA->";
        }
        
        if(comando.equals("3")){
            sorting.mergeSort(lista);
            resultado = "EL ARREGLO SE HA ORDENADO POR MERGE:";
            resultado1 = "EJECUCION DESORDENADA->";
        }
        if(comando.equals("4")){
            sorting.quickSort();
            resultado = "EL ARREGLO SE HA ORDENADO POR QUICK:";
            resultado1 = "EJECUCION DESORDENADA->";
        }
        
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(sorting.toString());
        System.out.println("Presione ENTER para realizar la EJECUCION ORDENADA...");
        String comando2 = teclado.nextLine();
        /*EJECUCION ORDENADA*/
        if(comando2.equals("")){
            if(comando.equals("1")){
                sorting.insertionSort();
                resultado = "EL ARREGLO SE HA ORDENADO POR INSERTION:";
                resultado1 = "EJECUCION ORDENADA->";
            }
        
            if(comando.equals("2")){
                sorting.bubbleSort();
                resultado = "EL ARREGLO SE HA ORDENADO POR BUBBLE:";
                resultado1 = "EJECUCION ORDENADA->";
            }
        
            if(comando.equals("3")){
                sorting.mergeSort(lista);
                resultado = "EL ARREGLO SE HA ORDENADO POR MERGE:";
                resultado1 = "EJECUCION ORDENADA->";
            }
            if(comando.equals("4")){
                sorting.quickSort();
                resultado = "EL ARREGLO SE HA ORDENADO POR QUICK:";
                resultado1 = "EJECUCION ORDENADA->";
            }
        }
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(sorting.toString());
        System.out.println("Fin del Programa");
    }
}
