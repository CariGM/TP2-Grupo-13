package fi.unju.edu.ar.enunciado14;

public class Empleados {
	
	
	String nombre;
	int edad;
	
	public Empleados (String nombre, int edad) {
		nombre=nombre;
		edad=edad;
	}

	public void MostrarDtos() {
		System.out.println(nombre);
		System.out.println(edad);
	}
	
}
