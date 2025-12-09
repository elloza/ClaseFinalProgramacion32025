package com.usal;


/**
 * 
 * Esta clase es muy importante! Y la documentación también!
 * 
 * 
 */
public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Esto un método factory que sirve para crear una persona
     * a partir de un String separado por comas.
     * 
     * @param personaString String separado por comas
     * @return retorna una Persona o lanza una @IllegalArgumentException
     */
    public static Persona fromCSVString(String personaString){

        String [] trozos = personaString.split(",");

        if(trozos.length != 2){
            throw new IllegalArgumentException("Parametros inválidos");
        } else{
            return new Persona(trozos[0], trozos[1]);
        }

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
