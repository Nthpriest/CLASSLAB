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
public class Cliente {
    public String Nombre;
    public int Edad;
    public String Folio;
    public String Correo;
    public String tipoSangre;
    public String Genero;
    public List<Orden> Ordenes;

    public Cliente(String Nombre, int Edad, String Folio, String Correo, String tipoSangre, String Genero, List<Orden> Ordenes) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Folio = Folio;
        this.Correo = Correo;
        this.tipoSangre = tipoSangre;
        this.Genero = Genero;
        this.Ordenes = Ordenes;
    }

    public Cliente() {
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public List<Orden> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(List<Orden> Ordenes) {
        this.Ordenes = Ordenes;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Folio=" + Folio + ", Correo=" + Correo + ", tipoSangre=" + tipoSangre + ", Genero=" + Genero + ", Ordenes=" + Ordenes + '}';
    }
    
}
