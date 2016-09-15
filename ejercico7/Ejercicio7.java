/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico7;

import java.util.Scanner;

   /**
 *
 * @author JUANPABLORAMIREZ pablo.ram232@gmail.com
 * 1215100282
 * UTNG
 * sistemas
 * 
 * 
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    
    
     static String string = "";
    static int i = 0;
    
    public static String entraNumero(int n){
        String numero = String.valueOf(n);
        char num = numero.charAt(i);
        
        switch (num){
            case '0':
                string = string + "cero";
                break;
            case '1':
                string = string + "uno";
                break;
            case '2':
                string = string + "dos";
                break;
            case '3':
                string = string + "tres";
                break;
            case '4':
                string = string + "cuatro";
                break;
            case '5':
                string = string + "cinco";
                break;
            case '6':
                string = string + "seis";
                break;
            case '7':
                string = string + "siete";
                break;
            case '8':
                string = string + "ocho";
                break;
            case '9':
                string = string + "nueve";
                break;
        }
        i++;
        if (i < numero.length()) {
            Ejercicio7.entraNumero(n);
        }
        
        return string.toLowerCase();
    }
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa numeros: ");
        int numero = dato.nextInt();
        
        if (numero > 0 && numero < 10000) {
            Ejercicio7 object = new Ejercicio7();
            object.entraNumero(numero);
            System.out.println(string);
        }
    }
    
    
}
