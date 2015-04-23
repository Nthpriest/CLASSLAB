/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ObjetosNegocio.*;
import Persistencia.Persistencia;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADRIAN
 */
public class ControlAnalisis {

    Persistencia persistencia;

    public ControlAnalisis(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public void AgregarAnalisis(Analisis analisis) {
        try {
            this.persistencia.Guardar(analisis, "1");
        } catch (IOException ex) {
            Logger.getLogger(ControlAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void GuardarAnalisis(Analisis analisis) {
        try {
            this.persistencia.Guardar(analisis, "1");
        } catch (IOException ex) {
            Logger.getLogger(ControlAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
