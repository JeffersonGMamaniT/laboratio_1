/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    
    public Persona(String nombre, String apellido, String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }
            
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getNombre(){
        if(this.nombre==null)
            return "SIN NOMBRE";
        return this.nombre;
    }
    public String getApellido(){
        if(this.apellido==null)
            return "SIN APELLIDO";

        return this.apellido;
    }
    public String getDni(){
        if(this.dni==null)
            return "SIN DNI";
        return this.dni;
    }
    public int getEdad(){
        
        return this.edad;
    }
    public String getContenidoConsola(){
        
        return ""
                + "EL NOMBRE ES: "+this.getNombre()
                + "\nEL APELLIDO ES: "+this.getApellido()
                + "\nEL DNI ES: "+this.getDni()
                + "\nLA EDAD ES: "+this.getEdad();
    }
}
