/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Estudiante
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="Juan";
        String apellido="Perez";
        String dni="00001111";
        
        Persona personita=new Persona(nombre,apellido,dni);
        personita.setEdad(17);
        
        String contenido= personita.getContenidoConsola();
        System.out.println(contenido);
        
        Persona mario=new Persona("Mario");
        System.out.println(mario.getContenidoConsola());
        
        Producto prod=new Producto();
        Producto prod2=new Producto("aaa","aaaa",56.00);
        
        prod.setNombre("Carne");
        prod.setCodigo("0000123135EEF");
        prod.setDisponible(true);
        prod.setFechaCompra("16/05/2023");
        prod.setMarca("San Fernando");
        prod.setHabilitado(true);
        
    }
    
    
}
