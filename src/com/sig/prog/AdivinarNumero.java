/**
* Ejercicio adivinar número
* 
* @author  Adán García Santos
* @version 1.1
* @since   22-01-2018
*/

package com.sig.prog;
import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		
		Scanner sc_numero = new Scanner(System.in);	//Se inicializa lector de número
		double numero = Math.random()*100+1;			//Generación numero aleatorio 1-100
		
		while (true) {	//bucle infinito. Solo se finaliza si es acertado el número
			
			System.out.println("Introduce número: ");
			int num = sc_numero.nextInt();		//Se almacenan datos de entrada en variable "num"
			
			if (num < (int)numero) {		//Si el numero es mayor:
				System.out.println("El número es mayor a " + num + ". Sigue intentandolo.");
			} else if (num > (int)numero) {	//Si el numero es menor:
				System.out.println("El número es menor a " + num + ". Sigue intentandolo.");
			} else if (num == (int)numero) {	//Si se acierta el número:
				System.out.println("Enhorabuena!!");
				break;	//Finaliza el bucle
			}
			
		}
		
		sc_numero.close();	//Cerrar lector
	}

}
