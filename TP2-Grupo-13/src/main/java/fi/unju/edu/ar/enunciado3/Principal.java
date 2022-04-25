package fi.unju.edu.ar.enunciado3;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros");
        for(int i=0;i<5;i++) {
            n = teclado.nextInt();
        if(n%2==0) 
            {
            System.out.println("el numero es par");
            }else
                {
                System.out.println("el numero es impar");
                }
       }

    }

}