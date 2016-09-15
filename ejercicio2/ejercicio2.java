package ejercicio2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ejercicio2 {
    
    /**
 *
 * @author JUANPABLORAMIREZ pablo.ram232@gmail.com
 * 1215100282
 * UTNG
 * sistemas
 * 
 * 
 */

static final String DATA_PATH="datos.txt";
	
	public static void main(String[]Args){
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
                int datoLeido1, datoLeido2;
                while (fileReader.hasNextInt()){
                    
                
                datoLeido1=fileReader.nextInt();
                datoLeido2=fileReader.nextInt();
                    System.out.println(contador+": producto: "+ datoLeido1 +" " +"serie: "+datoLeido2);
                    contador++;
                
                }
}
}
