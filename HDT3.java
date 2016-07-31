import java.util.Scanner;

/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 31/07/16
 */
public class HDT3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] lista = new int[] {10,9,8,5,6,5,4,3,2,1};
        Sort sorting = new Sort(lista);
        System.out.println("Bienvenido. Seleccione el numero del metodo de ordenamiento deseado:\n----------\n1.Insertion Sort\n2.Bubble Sort\n3.Merge Sort\n4.Quick Sort\n----------");
        String comando = teclado.nextLine();
        if(comando.equals("1")){
            sorting.insertionSort();
        }
        if(comando.equals("2")){
            sorting.bubbleSort();
        }
        if(comando.equals("3")){
            sorting.mergeSort();
        }
        if(comando.equals("4")){
            sorting.quickSort();
        }
        System.out.println(sorting.toString());
        System.out.println("Se ha finalizado el programa.");
    }
    
}
