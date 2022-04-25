package fi.unju.edu.ar.enunciado2;

import java.util.Scanner;

public class Bisiesto{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int an = teclado.nextInt();
        if (an % 4 == 0  || an % 400 == 0){
            if( an % 100 == 0) {
                System.out.println("El año ingresado no es bisiesto");
            }else {

                System.out.println("El año ingresado es bisiesto");
            }
        }else {
                System.out.println("El año no es bisiesto");

            }
    	}
    
    }