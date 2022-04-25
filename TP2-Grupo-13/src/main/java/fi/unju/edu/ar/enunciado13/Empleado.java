package fi.unju.edu.ar.enunciado13;

public class Empleado {
    private String nombre;
    private int anio;
    private int mes;
    private int dia;
    private int legajo;
    private String email;
    private int sueldo;
    private int horasT;

    public Empleado (String nombre, int anio, int mes, int dia, int legajo, String email, int sueldo, int horasT) {
        this.nombre = nombre;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.legajo = legajo;
        this.email = email;
        this.sueldo = sueldo;
        this.horasT = horasT;
    }
    public String mostrarDatos() {

        return "Nombre: "+nombre+" \nAño de ingreso: "+dia+"/"+mes+"/"+anio+", \nLegajo: "+legajo+"\nEmail: "+email+"\nSueldo: "+sueldo+"\nHoras de Trabajo: "+horasT;
    }

}