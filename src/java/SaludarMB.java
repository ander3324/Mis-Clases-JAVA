/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ander
 */

@RequestScoped
@ManagedBean(name="sal")
public class SaludarMB {

    //Atributos de la clase:
    private String nombre; //nombre del usuario...
    
    /**
     * Creates a new instance of SaludarMB
     */
    public SaludarMB() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método que retorna un saludo:
    public String saludar(){
        
        return "¡Hola " + nombre + "! Bienvenido a JavaServer Faces.";
    }

  
}
