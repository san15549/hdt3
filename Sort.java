/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 31/07/16
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
