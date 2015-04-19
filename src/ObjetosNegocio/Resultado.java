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
public class Resultado {

    public Analisis analisis;
    public Factor factor;

    public Resultado(Analisis analisis, Factor factor) {
        this.analisis = analisis;
        this.factor = factor;
    }

    public Resultado() {
    }

    public Analisis getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }

    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "Resultado{" + "analisis=" + analisis + ", factor=" + factor + '}';
    }

}
