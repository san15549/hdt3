import java.util.Arrays;

/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 31/07/16
 * Referencias: 
 * JorgeP.(2010). Ordenacion Rapida - Quick Sort. http://jorgep.blogspot.com/2010/09/ordenacion-rapida-quick-sort.html [29/07/2016]
 */
public class Sort implements iSort {

    private int[] lista;

    public Sort(int[] lista) {
        this.lista = lista;
    }
    
    @Override
    public int[] insertionSort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int[] bubbleSort() {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 1; j < lista.length - i; j++) {
                if (lista[j - 1] > lista[j]) {
                    int nuevo = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = nuevo;
                }
            }
        }
        return lista;
    }

    @Override
    public int[] mergeSort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int[] quickSort() {
        return quicksort2(lista,0,lista.length-1);
    }
    
    public int[] quicksort2(int arreglo[],int left,int right){
        
        int medio=left+(right-left)/2;
        int pivote=arreglo[medio];
        int i=left;
        int j=right;
        
        while (i<=j){
            while (arreglo[i]<pivote){
                i=i+1;
            }while(arreglo[j]>pivote){
                j=j-1;
            }
            if (i<=j){
                int num1=arreglo[i];
                int num2=arreglo[j];
                arreglo[i]=num2;
                arreglo[j]=num1;
                i=i+1;
                j=j-1;
            }
        }
        
        if (left<j)
        quicksort2(arreglo,left,j);
        if (right>i)
        quicksort2(arreglo,i,right);
        
        return arreglo;
    }

    @Override
    public String toString() {
        return "\nEl arreglo se ha ordenado:\n" + Arrays.toString(lista);
    }
    
}
