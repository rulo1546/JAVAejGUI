/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultComboBoxModel;

/**
 *
 * @author rulo2
 */
public class Persona {
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    public Persona(String nombre, int edad, String nacionalidad){
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
