/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class LiderProyecto extends Programador {
    private ArrayList<Programador> programadores;
    
    public LiderProyecto(String lenguaje, String nombre, double salario){
        super(lenguaje,nombre,salario,id);
        this.programadores = new ArrayList<>();
    }
    
    public void agregarProgrmador(Programador p){
        this.programadores.add(p);       
    }
    
    public double calcularSalario(){
        double salarioTotal = 0;
        salarioTotal += super.calcularSalario()*
                (super.calcularSalario()*
                this.programadores.size() * 0.1;
        return salarioTotal;
    }
    
    public String listarInformacion(){
        String informacion = super.listarInformacion();
        informacion += "Programadores a cargo \n";
        for(Programador programador : programadores){
            informacion += programador.listarInformacion();
        }
        return informacion;
    }
    
}
