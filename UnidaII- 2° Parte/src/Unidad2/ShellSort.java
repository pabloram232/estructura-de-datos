
package Unidad2;


public class ShellSort {
    public static void ordenacionShell(int [] arreglo){
        int salto,i,j,k,auxiliar;
        salto=arreglo.length/2;
        while (salto>0) {
            for (i =salto; i <arreglo.length; i++) {
                j=i-salto;
                while (j>0) {
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        j=-1; 
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto; //j=j-salto
                    }
                }
            }
            salto = salto/2;
        }
    }
    public static void main(String[] args) {   
        int arreglo[]={10,80,50,95,70,95,17,87,65};
        ordenacionShell(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
    }
}
