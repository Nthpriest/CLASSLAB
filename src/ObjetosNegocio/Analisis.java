/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class Analisis {

    public TipoAnalisis tipoAnalisis;
    public List<Resultado> factoresResultado;

    public Analisis(TipoAnalisis tipoAnalisis, List<Resultado> factoresResultado) {
        this.tipoAnalisis = tipoAnalisis;
        this.factoresResultado = factoresResultado;
    }

    public Analisis() {
    }
    

    public TipoAnalisis getTipoAnalisis() {
        return tipoAnalisis;
    }

    public void setTipoAnalisis(TipoAnalisis tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public List<Resultado> getFactoresResultado() {
        return factoresResultado;
    }

    public void setFactoresResultado(List<Resultado> factoresResultado) {
        this.factoresResultado = factoresResultado;
    }

    @Override
    public String toString() {
        return "Analisis{" + "tipoAnalisis=" + tipoAnalisis + ", factoresResultado=" + factoresResultado + '}';
    }

}
