package fi.unju.edu.ar.enunciado5;

import java.util.Scanner;

public class MesesSwitch {

	public static void main(String[] args) {
		
		int n;

		Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes: ");
        n = teclado.nextInt();
		
		switch (n) {
		case 12:
			System.out.println("El valor " + n + " pertenece al mes de Diciembre.");
			break;
		case 11:
    		System.out.println("El valor " + n + " pertenece al mes de Noviembre.");
			break;
		case 10:
    		System.out.println("El valor " + n + " pertenece al mes de Octubre.");
			break;
		case 9:
    		System.out.println("El valor " + n + " pertenece al mes de Septiembre.");
			break;
		case 8:
    		System.out.println("El valor " + n + " pertenece al mes de Agosto.");
			break;
		case 7:
    		System.out.println("El valor " + n + " pertenece al mes de Julio.");
			break;
		case 6:
    		System.out.println("El valor " + n + " pertenece al mes de Junio.");
			break;
		case 5:
    		System.out.println("El valor " + n + " pertenece al mes de Mayo.");
			break;
		case 4:
    		System.out.println("El valor " + n + " pertenece al mes de Abril.");
			break;
		case 3:
    		System.out.println("El valor " + n + " pertenece al mes de Marzo.");
			break;
		case 2:
    		System.out.println("El valor " + n + " pertenece al mes de Febrero.");
			break;
		case 1:
    		System.out.println("El valor " + n + " pertenece al mes de Enero.");
			break;
		default:
			System.out.println("El valor " + n + " no pertenece a ningun mes.");
			break;
		}

	}

}