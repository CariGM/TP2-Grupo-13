package fi.unju.edu.ar.enunciado1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n,r=1,aux;
		
		Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a factoriar: ");
        n = teclado.nextInt();

		aux=n;
		
		if( n <= 10 && n > 1 ){
			for(int i=1;i<=aux;i++){
				r = r * n;
				n --;
			}
			System.out.println("Resultado : " + r);
		}
		else {
			if( n==0 || n==1 ) {
				r = 1;
				System.out.println("Resultado : " + r);
			}
			else {
				System.out.println("Valor ingresado esta fuera de los limites.");
			}
		}
	}
}