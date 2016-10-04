
package Unidad2;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Scanner lector2=new Scanner(System.in);
        int tam;
        System.out.println("Ingresa tamaño del arreglo");
        tam=lector.nextInt();
        String[] arreglo=new String[tam];
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Ingresa el texto["+i+"]: ");
            arreglo[i]=lector2.nextLine();
        }
        //Imprimir el arreglo desordenado
       for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Ingresa el texto["+i+"]:"+arreglo[i]);
        }
       
       //
       String aux; //auxiliar para ordenar el arreglo
       for (int i = 0; i <arreglo.length; i++) {
           System.out.println("");
           for (int j = 0; j <arreglo.length-i; j++) {
            if(arreglo[j].compareTo(arreglo[j+1])>0){
                aux=arreglo[j];
                //intercambio de datos o posiciones
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=arreglo[j];
            }
           }
        }
       for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Ingresa el texto["+i+"]:"+arreglo[i]);
           }
    }
}
