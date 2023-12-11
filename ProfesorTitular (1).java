
package com.mycompany.ccodigo;


class ProfesorTitular extends Profesor {

    public ProfesorTitular() {
    }

    public ProfesorTitular(String IdProfesor, String nombre, String apellidos, int edad) {
        super(IdProfesor, nombre, apellidos, edad);
    }

    @Override
    public float ImporteNomina() {
        return 30f * 43.2f;
    }
}