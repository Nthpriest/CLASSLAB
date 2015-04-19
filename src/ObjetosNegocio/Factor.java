/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

/**
 *
 * @author ADRIAN
 */
public class Factor {
    public String Nombre;
    public String Referencia;
    public boolean ResultadoOpcional;

    public Factor(String Nombre, String Referencia, boolean ResultadoOpcional) {
        this.Nombre = Nombre;
        this.Referencia = Referencia;
        this.ResultadoOpcional = ResultadoOpcional;
    }

    public Factor() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public boolean isResultadoOpcional() {
        return ResultadoOpcional;
    }

    public void setResultadoOpcional(boolean ResultadoOpcional) {
        this.ResultadoOpcional = ResultadoOpcional;
    }

    @Override
    public String toString() {
        return "Factor{" + "Nombre=" + Nombre + ", Referencia=" + Referencia + ", ResultadoOpcional=" + ResultadoOpcional + '}';
    }
    
    
    
}
