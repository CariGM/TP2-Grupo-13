package fi.unju.edu.ar.enunciado13;

import java.util.Calendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Scanner teclado1= new Scanner(System.in);
        int cal1, cal2, cal3, cal4;

        System.out.println("ingrese el nombre");
        String nombre = teclado.next();

        System.out.println("ingrese el legajo");
        int legajo=teclado1.nextInt();

        System.out.println("ingrese el Email");
        String email=teclado.next();
        
        System.out.println("ingrese las hora de trabajo");
        int horas=teclado1.nextInt();

        Calendar hoy = Calendar.getInstance();
        
        System.out.println("ingrese el año de ingreso");
        int anio=teclado1.nextInt();
        
        while(anio < 0 || anio >= hoy.get(Calendar.YEAR)) {
        	System.out.println("anio ingresado erroneo, ingrese nuevamente");
        anio=teclado1.nextInt();
        }
        
        System.out.println("ingrese el mes de ingreso");
        int mes=teclado1.nextInt(); 
        while(mes < 0 || mes >= 12) {
        	System.out.println("mes ingresado erroneo, ingrese nuevamente");
        mes=teclado1.nextInt(); 
        }
        
        System.out.println("ingrese el dia de ingreso");
        int dia=teclado1.nextInt();
        while(dia < 0 || dia >= 31) {
        System.out.println("dia ingresado erroneo, ingrese nuevamente");
        dia=teclado1.nextInt();
        }
        
        if(horas>160) {
            cal1=160*600;
            cal2=horas-160;
            cal3=cal2*650;
            cal4=cal1+cal3;
        }else {
            cal4=horas*600;
        }

        Empleado emp = new Empleado(nombre,anio,mes,dia,legajo,email,cal4,horas);

        System.out.println("Datos del Empleado");
        System.out.print(emp.mostrarDatos());

    }

}