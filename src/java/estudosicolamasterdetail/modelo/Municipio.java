/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Municipio {
    
    private int codigoMunicipio;
    private String nomeMunicipio;
    private Provincia provincia;

    public Municipio() {
    }

    public Municipio(int codigoMunicipio, String nomeMunicipio, Provincia provincia) {
        this.codigoMunicipio = codigoMunicipio;
        this.nomeMunicipio = nomeMunicipio;
        this.provincia = provincia;
    }
    
    
    
}
