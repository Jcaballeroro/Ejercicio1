package notas;
import java.util.*;
import nota.varias.varias;

public class NotaObjeto {
	public static void main(String[] args) {

		 varias notamedia = new varias(); // creamos el objeto notamedia

Scanner scanner = new Scanner(System.in); // objeto scanner
		 
String[] asignaturas = {"Programacion", "Base de Datos", "Sistemas"}; // definimos variable String porque es texto  
		 int[] notas = new int[asignaturas.length]; //array de las notas
		 
		 for (int i = 0; i < asignaturas.length; i++) {
		 
			 System.out.print("Introduce las notas de " + asignaturas[i]+ ": ");
		
		 notas[i] = scanner.nextInt();
		 }
		 int media = notamedia.notasuma(notas);
		 

				// se crea una variable que es igul al return del metodo notasuma,
		 // se utiliza como argumento notas, que es una matriz, recuerda que en el metodo hemos creado un
		 // argumento noto que es un array
		 System.out.println("La media es: " + media);
	 scanner.close();
}
}