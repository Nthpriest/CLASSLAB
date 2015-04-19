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
public class TipoAnalisis {

    public String Id;
    public String Nombre;
    public List<Factor> Factores;

    public TipoAnalisis(String Id, String Nombre, List<Factor> Factores) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Factores = Factores;
    }

    public TipoAnalisis() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Factor> getFactores() {
        return Factores;
    }

    public void setFactores(List<Factor> Factores) {
        this.Factores = Factores;
    }

    @Override
    public String toString() {
        return "TipoAnalisis{" + "Id=" + Id + ", Nombre=" + Nombre + ", Factores=" + Factores + '}';
    }

}
