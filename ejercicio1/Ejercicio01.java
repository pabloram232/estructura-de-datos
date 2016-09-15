/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author JUANPABLORAMIREZ pablo.ram232@gmail.com
 * 1215100282
 * UTNG
 * sistemas
 * 
 * 
 */
public class Ejercicio01 {
    
    

	static final String DATA_PATH="datos.txt";
	
	public static void main(String[]ärgs){
		Scanner fileReader=null;
		try{
			fileReader= new Scanner(new File(DATA_PATH));
			System.out.println("Archivo abierto: "+ fileReader);
			
		}catch(FileNotFoundException e){
			System.out.println("El archivo" +DATA_PATH+ " NO SE ENCUENTRA!!");
			System.out.println("Programa terminado");
			System.exit(0);
		}
		int contador=1;
		int datoLeido=fileReader.nextInt();
		System.out.println("palas cargadoras 78345");
		while(datoLeido==78345){
			datoLeido=fileReader.nextInt();
			System.out.println(contador +": serie"+datoLeido);
			datoLeido=fileReader.nextInt();
			contador++;
	}
		
		System.out.println("retroexcavadoras 33285");
		while(datoLeido==33287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador +": serie"+datoLeido);
			datoLeido=fileReader.nextInt();
			contador++;
}
		System.out.println("dumpers 63287");
		while(datoLeido==63287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador +": serie"+datoLeido);
			datoLeido=fileReader.nextInt();
			contador++;
}}
}

