
package com.mycompany.ccodigo;


import java.util.Calendar;

public final class ProfesorInterino extends Profesor {

    private Calendar fechacomienzoInterinidad;

    public ProfesorInterino(Calendar fechacomienzoInterinidad) {
        this.fechacomienzoInterinidad = fechacomienzoInterinidad;
    }

    public ProfesorInterino(Calendar fechacomienzoInterinidad, String IdProfesor, String nombre, String apellidos, int edad) {
        super(IdProfesor, nombre, apellidos, edad);
        this.fechacomienzoInterinidad = fechacomienzoInterinidad;
    }

    @Override
    public float ImporteNomina() {
        return 30f * 35.60f;
    }
}
