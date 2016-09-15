
package ejercicio8;

import java.util.Scanner;

/**El elemento mayor de un array entero de n-elementos se puede calcular recursivamente.
 
 * @author JUANPABLORAMIREZ pablo.ram232@gmail.com
 * 1215100282
 * UTNG
 * sistemas
  
 */
public class Ejercicio08 {
    
    
    
    public static void main(String[] args) {
 
        Scanner lectura = new Scanner(System.in);
        int m, n;
        int Menor, Mayor;
 
        System.out.print("Filas : ");
        m = lectura.nextInt();
 
        System.out.print("Columnas : ");
        n = lectura.nextInt();
 
        int Arreglo [][] = new int[m][n];
 
        for(int i=0 ; i<m ; i++){
            System.out.println("Ingrese fila " + i + " Fila : ");
            for(int j=0 ; j<n ;j++){
                Arreglo[i][j] = lectura.nextInt();
            }
        }
        //Inicializamos Mayor y Menor
        Mayor = Arreglo[0][0];
        Menor = Arreglo[0][0];
 
        // Determinar el mayor y el menor
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ;j++){
                 // determinar el menor
                if(Menor > Arreglo[i][j])   Menor = Arreglo[i][j]; 
                 // determinar el mayor
                if(Mayor < Arreglo[i][j])   Mayor = Arreglo[i][j]; 
            }
        }
        // Mostrar los resulados
            System.out.println("El Mayor es : " +  Mayor);
            System.out.println("El Menor es : " +  Menor);
 
    }
    
}
