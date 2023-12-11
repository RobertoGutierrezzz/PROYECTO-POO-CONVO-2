
package com.mycompany.ccodigo;

abstract class Profesor extends Persona {

    private String IdProfesor;

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public Profesor() {
        super();
        IdProfesor = "Desconocido";
    }

    public Profesor(String IdProfesor, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.IdProfesor = IdProfesor;
    }

    public void MostrarDatos() {
        System.out.println("Datos del profesor:");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Apellido:" + getApellidos());
        System.out.println("Identificación:" + getIdProfesor());
    }

    abstract public float ImporteNomina();

    @Override
    public String toString() {
        return "Profesor{" + "IdProfesor=" + IdProfesor + '}';
    }
}
