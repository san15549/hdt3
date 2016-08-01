import java.util.Arrays;

/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 31/07/16
 * Referencias: 
 * JorgeP.(2010). Ordenacion Rapida - Quick Sort. http://jorgep.blogspot.com/2010/09/ordenacion-rapida-quick-sort.html [29/07/2016]
 * Archer, Jon, et. al. (2009). QuickSort. http://www.algolist.net/Algorithms/Sorting/Quicksort [30/07/2016]
 * Lars V. (2012). Merge Sort Java Tutorial. http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html [31/07/2016]
 */
public class Sort implements iSort {

    private int[] lista;

    public Sort(int[] lista) {
        this.lista = lista;
    }
    
    @Override
    public int[] insertionSort() {
        
        int[] arrayParaOrdenar = lista;
        int largo = arrayParaOrdenar.length;
        int[] arrayOrdenado = new int[largo];
        int i = 0;
        
        while(i < largo){
            int iResta = 0;
            int n1 = arrayParaOrdenar[i];
            
            while(iResta < largo){
                int n2 = arrayParaOrdenar[iResta];
                
                int nr = n1 - n2;
                if (nr < 0){
                    iResta++;
                } else {
                    iResta = largo + 1;
                }
                
                if (iResta == largo){
                    arrayOrdenado[i] = n1;
                    arrayParaOrdenar[i] = 0;
                    i++;
                }
            }
        }
                
        
        return arrayOrdenado;
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
    public int[] mergeSort(int[] lista){
    /*Problemas con MergeSort, sin encontrar el error, por más que corre en una computadora bien y en las otras no*/   
    int i = 0;
    int[] p = new int[lista.length /2];
    int[] s = new int[lista.length - p.length];
    
    mergeSort(p);
    mergeSort(s);
    
    System.arraycopy(lista, 0, p, 0, p.length);
    System.arraycopy(lista, p.length, s, 0, s.length);
   
    merge(p,s,lista);
    return lista;
    }
    
    private static void merge(int[] p, int[] s, int[] fin) {

        int pp = 0;
        int ss = 0;
        int r = 0;

        while (pp < p.length && ss < s.length) 
        {
            if (p[pp] <= s[ss])
            {
                fin[r] = p[pp];
                pp++;
            } else 
            {
                fin[r] = s[ss];
                ss++;
            }
            r++;
        }
        System.arraycopy(p, pp, fin, r, p.length - pp);
        System.arraycopy(s, ss, fin, r, s.length - ss);
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
        return Arrays.toString(lista);
    }
    
}
