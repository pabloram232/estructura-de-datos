//UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANANJUATO
//SISTEMAS INFORMATICOS 
//JUAN PABLO RAMIREZ IBARRA
//1215100282
//OBJETIVO : METODOS DE RECURSIVIDAD


package ejercicio4;

public class Ejercicio_04 {
	static int  factorial(int numero){
		if(numero <= 1){
			return 1;
		}else{
			return numero*factorial(numero-1);
			
		}
		
		
	}
	//metodo prar contar de 1 ....N 
	static int inicial=1;
	static void cuentaHasta(int n){
		if (inicial<=n){
			System.out.println(inicial);
			inicial ++;
			cuentaHasta(n);
			
		}
	}
//metodo para una cuenta regresiva a partir de N a 0 
	
static void regresa(int n){
	if(n>=0){
		System.out.println(n);
		n--;
	}
}

public static void main(String args[]){
	
	regresa(8);
}
}


