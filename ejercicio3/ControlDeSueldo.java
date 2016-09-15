/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
   /**
 *
 * @author JUANPABLORAMIREZ pablo.ram232@gmail.com
 * 1215100282
 * UTNG
 * sistemas
 * 
 * 
 */

public class ControlDeSueldo {


    public static void main(String[] args) {
        String[] nom=new String [10];
        String nomMay = null;
        String nomMenor = null;
        int trabajadores;
        double may=0;
        
        double meo=100;
        int hora=0;
        char categoria;
        double [] sueldo=new double[3];
        
        
         java.util.Scanner leer = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           System.out.println("Ingrese el nombre del empleado  ");
	     nom[i]=leer.next();
             System.out.println("Ingrese el dueldo del empleado ");
             sueldo[i]=leer.nextDouble();
             
             if(sueldo[i]>=may){
                 may=sueldo[i];
                 nomMay=nom[i];
             }
             if(sueldo[i]<=meo){
                     
                 meo=sueldo[i];
                 nomMenor=nom[i];
             }
        }
        System.out.println("El sueldo mayor es "+may +"Del empleado "+nomMay);
        System.out.println("El sueldo menor es "+meo+"Del empleado +"+nomMenor);
        // TODO code application logic here
    }
    
}
