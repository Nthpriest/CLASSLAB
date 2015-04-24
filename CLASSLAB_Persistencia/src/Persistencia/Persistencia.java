/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import ObjetosNegocio.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class Persistencia {

    public List<Analisis> ListaAnalisis;
    public List<Cliente> ListaClientes;
    public List<Factor> ListaFactores;
    public List<Orden> ListaOrdenes;
    public List<Resultado> ListaResultados;
    public List<TipoAnalisis> ListaTipoAnalisis;

    File ListaDataAnalisis[];
    File ListaDataClientes[];
    File ListaDataFactores[];
    File ListaDataOrdenes[];
    File ListaDataResultados[];
    File ListaDataTipoAnalisis[];
    File Data = new File("LabData");
    File DataAnalisis = new File("LabData\\Analisis");
    File DataClientes = new File("LabData\\Clientes");
    File DataFactores = new File("LabData\\Factores");
    File DataOrdenes = new File("LabData\\Ordenes");
    File DataResultados = new File("LabData\\Resultados");
    File DataTipoAnalisis = new File("LabData\\TipoAnalisis");

    public Persistencia() throws FileNotFoundException, IOException, ClassNotFoundException {
        this.ListaAnalisis = new ArrayList<>();
        this.ListaClientes = new ArrayList<>();
        this.ListaFactores = new ArrayList<>();
        this.ListaOrdenes = new ArrayList<>();
        this.ListaResultados = new ArrayList<>();
        this.ListaTipoAnalisis = new ArrayList<>();
        BuildUp();
        Reload();
    }

    public void BuildUp() {
        if (!Data.exists()) {
            Data.mkdir();
            System.out.println("Carpeta LabData Creada");
        }
        if (!DataAnalisis.exists()) {
            DataAnalisis.mkdir();
            System.out.println("Carpeta Analisis Creada");
        }
        if (!DataClientes.exists()) {
            DataClientes.mkdir();
            System.out.println("Carpeta Clientes Creada");
        }
        if (!DataFactores.exists()) {
            DataFactores.mkdir();
            System.out.println("Carpeta Factores Creada");
        }
        if (!DataOrdenes.exists()) {
            DataOrdenes.mkdir();
            System.out.println("Carpeta Ordenes Creada");
        }
        if (!DataResultados.exists()) {
            DataResultados.mkdir();
            System.out.println("Carpeta Resultados Creada");
        }
        if (!DataTipoAnalisis.exists()) {
            DataResultados.mkdir();
            System.out.println("Carpeta TipoAnalisis Creada");
        }
    }

    public void Guardar(Object objeto, String Operacion) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            if (Operacion.matches("1")) {
                ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("LabData\\Analisis" + "\\" + objeto.toString() + ".txt"));
                ListaAnalisis.add((Analisis) objeto);
                file.writeObject(objeto);
                System.out.println("Analisis Creado");
                file.close();
            }
            if (Operacion.matches("2")) {
                ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("LabData\\Clientes" + "\\" + objeto.toString() + ".txt"));
                ListaClientes.add((Cliente) objeto);
                file.writeObject(objeto);
                System.out.println("Cliente Creado");
                file.close();
            }
            if (Operacion.matches("3")) {
                ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("LabData\\Factores" + "\\" + objeto.toString() + ".txt"));
                ListaFactores.add((Factor) objeto);
                file.writeObject(objeto);
                System.out.println("Factor Creado");
                file.close();
            }
            if (Operacion.matches("4")) {
                ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("LabData\\Resultados" + "\\" + objeto.toString() + ".txt"));
                this.ListaResultados.add((Resultado) objeto);
                file.writeObject(objeto);
                System.out.println("Resultado Creado");
                file.close();
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    public Object buscaObjeto(String clave, String Operacion) {
        if (Operacion.matches("1")) {
            for (Analisis x : this.ListaAnalisis) {
                if (x.IDAnalisis.matches(clave)) {
                    return x;
                }
            }
            return null;
        }
        if (Operacion.matches("2")) {
            for (Cliente x : this.ListaClientes) {
                if (x.Folio.matches(clave)) {
                    return x;
                }
            }
            return null;
        }
        if (Operacion.matches("3")) {
            for (Factor x : this.ListaFactores) {
                if (x.Nombre.matches(clave)) {
                    return x;
                }
            }
            return null;
        }
        if (Operacion.matches("4")) {
            for (Orden x : this.ListaOrdenes) {
                if (x.Folio.matches(clave)) {
                    return x;
                }
            }
            return null;
        } else {
            return null;
        }

    }
    public void remplazaObjeto(Object Objeto, Object nuevo, String Operacion) {
        if (Operacion.matches("1")) {
            int pos = this.ListaAnalisis.indexOf(Objeto);
            this.ListaAnalisis.remove(pos);
            this.ListaAnalisis.add(pos, (Analisis) nuevo);
        }
        if (Operacion.matches("2")) {
            int pos = this.ListaClientes.indexOf(Objeto);
            this.ListaClientes.remove(pos);
            this.ListaClientes.add(pos, (Cliente) nuevo);
        }
        if (Operacion.matches("3")) {
            int pos = this.ListaFactores.indexOf(Objeto);
            this.ListaFactores.remove(pos);
            this.ListaFactores.add(pos, (Factor) nuevo);
        }
        if (Operacion.matches("4")) {
            int pos = this.ListaOrdenes.indexOf(Objeto);
            this.ListaOrdenes.remove(pos);
            this.ListaOrdenes.add(pos, (Orden) nuevo);
        }
          if (Operacion.matches("5")) {
            int pos = this.ListaResultados.indexOf(Objeto);
            this.ListaResultados.remove(pos);
            this.ListaResultados.add(pos, (Resultado) nuevo);
        }
            if (Operacion.matches("6")) {
            int pos = this.ListaTipoAnalisis.indexOf(Objeto);
            this.ListaTipoAnalisis.remove(pos);
            this.ListaTipoAnalisis.add(pos, (TipoAnalisis) nuevo);
        }
    }

    public void StartUp() {
    }

    public void Reload() throws FileNotFoundException, IOException, ClassNotFoundException {
        if (DataAnalisis.listFiles() != null) {
            this.ListaDataAnalisis = DataAnalisis.listFiles();
            List<Analisis> ListaProvisional = new ArrayList<>();
            for (int i = 0; i < ListaDataAnalisis.length; i++) {
                ObjectInputStream file = new ObjectInputStream(new FileInputStream(ListaDataAnalisis[i]));
                Analisis cuenta = (Analisis) file.readObject();
                ListaProvisional.add(cuenta);
            }
            this.ListaAnalisis = ListaProvisional;
            System.out.println("Lista Analisis Cargada");
        }
        if (DataClientes.listFiles() != null) {
            this.ListaDataClientes = DataClientes.listFiles();
            List<Cliente> ListaProvisional2 = new ArrayList<>();
            for (int i = 0; i < ListaDataClientes.length; i++) {
                ObjectInputStream file = new ObjectInputStream(new FileInputStream(ListaDataClientes[i]));
                Cliente cuenta = (Cliente) file.readObject();
                ListaProvisional2.add(cuenta);
            }
            this.ListaClientes = ListaProvisional2;
            System.out.println("Lista Clientes Cargada");
        }
        if (DataFactores.listFiles() != null) {
            this.ListaDataFactores = DataFactores.listFiles();
            List<Factor> ListaProvisional3 = new ArrayList<>();
            for (int i = 0; i < ListaDataFactores.length; i++) {
                ObjectInputStream file = new ObjectInputStream(new FileInputStream(ListaDataFactores[i]));
                Factor cuenta = (Factor) file.readObject();
                ListaProvisional3.add(cuenta);
            }
            this.ListaFactores = ListaProvisional3;
            System.out.println("Lista Factores Cargada");
        }
        if (DataOrdenes.listFiles() != null) {
            this.ListaDataOrdenes = DataOrdenes.listFiles();
            List<Orden> ListaProvisional4 = new ArrayList<>();
            for (int i = 0; i < ListaDataOrdenes.length; i++) {
                ObjectInputStream file = new ObjectInputStream(new FileInputStream(ListaDataOrdenes[i]));
                Orden cuenta = (Orden) file.readObject();
                ListaProvisional4.add(cuenta);
            }
            this.ListaOrdenes = ListaProvisional4;
            System.out.println("Lista Ordenes Cargada");
        }

    }
}
