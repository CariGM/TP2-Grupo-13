package fi.unju.edu.ar.enunciado4;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		
		int n;

		Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes: ");
        n = teclado.nextInt();
        
        if( n <= 12 && n >= 1) {
        	if(n==12) {
        		System.out.println("El valor " + n + " pertenece al mes de Diciembre.");
        	}
        	if(n==11) {
        		System.out.println("El valor " + n + " pertenece al mes de Noviembre.");
        	}
        	if(n==10) {
        		System.out.println("El valor " + n + " pertenece al mes de Octubre.");
        	}
        	if(n==9) {
        		System.out.println("El valor " + n + " pertenece al mes de Septiembre.");
        	}
        	if(n==8) {
        		System.out.println("El valor " + n + " pertenece al mes de Agosto.");
        	}
        	if(n==7) {
        		System.out.println("El valor " + n + " pertenece al mes de Julio.");
        	}
        	if(n==6) {
        		System.out.println("El valor " + n + " pertenece al mes de Junio.");
        	}
        	if(n==5) {
        		System.out.println("El valor " + n + " pertenece al mes de Mayo.");
        	}
        	if(n==4) {
        		System.out.println("El valor " + n + " pertenece al mes de Abril.");
        	}
        	if(n==3) {
        		System.out.println("El valor " + n + " pertenece al mes de Marzo.");
        	}
        	if(n==2) {
        		System.out.println("El valor " + n + " pertenece al mes de Febrero.");
        	}
        	if(n==1) {
        		System.out.println("El valor " + n + " pertenece al mes de Enero.");
        	}
        }
        else {
        	System.out.println("El valor " + n + " no pertenece a ningun mes.");
        }
		
	}

}