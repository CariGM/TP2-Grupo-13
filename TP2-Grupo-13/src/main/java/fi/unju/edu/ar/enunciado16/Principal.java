package fi.unju.edu.ar.enunciado16;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fi.unju.edu.ar.enunciado16.CalculoMatematico;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
		Scanner teclado = new Scanner(System.in);
		
		CalculoMatematico dev = new CalculoMatematico();
		
		System.out.println("Ingrese un valor numerico:");
		int num = teclado.nextInt();
		
		System.out.println("El resultado de la sumatoria es: " + dev.calcularSumatoria(num));
		
		System.out.println("El resultado del producto es: " + dev.calcularProductoria(num));
		
	}

}
