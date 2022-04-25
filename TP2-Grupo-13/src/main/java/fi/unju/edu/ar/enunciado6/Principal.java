package fi.unju.edu.ar.enunciado6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int n = 69;

        while (n!=0) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese nota: ");
            n = teclado.nextInt();

            if(n>10 || n<0) {
                System.out.println("Valor no permitido");
            }
            else {
                if(n==6) {
                    System.out.println("El alumno regulariza.");
                }
                if(n>6) {
                    System.out.println("El alumno promociona.");
                }
                if(n<6 && n>0) {
                    System.out.println("El alumno desaprueba.");
                }
                if(n==0) {
                    System.out.println("Valor no permitido.");
                }
            }

        }

    }

}