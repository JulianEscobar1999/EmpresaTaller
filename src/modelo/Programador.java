package modelo;


public class Programador extends Empleado {
    
    protected String lenguaje;
    
    public Programador(String lenguaje, String nombre, int id, double salario){
        this.lenguaje = lenguaje;
        super(nombre,salario,id);                
        
    }
    
    public double calcularSalario(){
        double salarioTotal = this.salario;
        if(this.lenguaje)
    }
    
    
    public String listarinformacion(){
        return "Programador "+this.id+" "+this.nombre;
    }
}
