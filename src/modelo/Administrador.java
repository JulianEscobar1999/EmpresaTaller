package modelo;

public class Administrador extends Empleado {

    public Administrador(String nombre, int id) {
        super(nombre, 100, id);
    }
       
    
    public String listarinformacion(){
        return "Administrador "+this.id+" "+this.nombre;
    }
    
}
