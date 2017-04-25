
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    
    public Empresa(){
        this.trabajadores = new ArrayList<>();
    }
    
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for(Trabajador trabjador : trabajadores){
            salarioTotal += trabajador.calcularSalario();
            
        }
        return salarioTotal;
        
    }
    
    public String listarinformacion(){
        String informacion = " ";
        for(Trabajador trabajador : trabajadores){
            informacion += trabajador.listarInformacion();                        
        }
        return informacion;
    }
    
}
