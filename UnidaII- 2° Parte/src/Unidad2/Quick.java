
package Unidad2;

public class Quick {
    public static void ordenaQuick(int vect[],int izq,int der){
        int i=0,j=0;
        int x=0,aux=0;
        i=izq;
        j=der;
        x=vect[(izq+der)/2]; //pivote
        do{                
                while((vect[i]<x) && (j<=der)){
                    i++;}
                    while ((x<vect[j]&&(j>izq))) {
                        j--;}
                    if(i<=j){
                        aux=vect[i];
                        vect[i]=vect[j];
                        vect[j]=aux;
                        i++;  j--;
                    }
            } while (i<=j);
              if(izq < j)
                  ordenaQuick(vect,izq,j); //recursividad
              if(i < der)
                  ordenaQuick(vect,i,der);
         }
            public static void main(String[] args) {
             int arreglo[]={10,80,50,95,70,5,95,17,87,65};
                ordenaQuick(arreglo, 0,arreglo.length-1);
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println(arreglo[i]+",");
                }
    }
       
}
