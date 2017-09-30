/*
 * Este objeto unicamente tiene relacion con los datos de modelo de aplicacion
 * No es un controlador - Explique por que 
 * Tampoco adminsitra el flujo de la aplicación
 */
package modelo.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean
public class Candidato {

    //Atributos
    private String nombre = "Introduce tu nombre";

    public Candidato() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
