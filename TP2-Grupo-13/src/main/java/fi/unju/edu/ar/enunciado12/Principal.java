package fi.unju.edu.ar.enunciado12;
import java.lang.Math;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado= new Scanner(System.in);


        System.out.println("ingrese el valor de h");
        int h = teclado.nextInt();
        double g = 9.81;
        double t = (2*h)/g;
        double t1 = Math.sqrt(t);
        System.out.println("El tiempo en caer de: "+ h + "cm es: "+t1 +" segundos");

    }
}