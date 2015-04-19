/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class Orden {

    public List<Analisis> ListaAnalisis;
    public Cliente cliente;
    public String Medico;
    public Date fecha;
    public boolean ayuno;

    public Orden(List<Analisis> ListaAnalisis, Cliente cliente, String Medico, Date fecha, boolean ayuno) {
        this.ListaAnalisis = ListaAnalisis;
        this.cliente = cliente;
        this.Medico = Medico;
        this.fecha = fecha;
        this.ayuno = ayuno;
    }

    public Orden() {
    }

    public List<Analisis> getListaAnalisis() {
        return ListaAnalisis;
    }

    public void setListaAnalisis(List<Analisis> ListaAnalisis) {
        this.ListaAnalisis = ListaAnalisis;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAyuno() {
        return ayuno;
    }

    public void setAyuno(boolean ayuno) {
        this.ayuno = ayuno;
    }

    @Override
    public String toString() {
        return "Orden{" + "ListaAnalisis=" + ListaAnalisis + ", cliente=" + cliente + ", Medico=" + Medico + ", fecha=" + fecha + ", ayuno=" + ayuno + '}';
    }

}
