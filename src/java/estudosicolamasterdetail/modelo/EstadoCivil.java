/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class EstadoCivil {
    private int codigoEstadoCivil;
    private String nomeEstadoCivil;

    public EstadoCivil() {
    }

    public EstadoCivil(int codigoEstadoCivil, String nomeEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
        this.nomeEstadoCivil = nomeEstadoCivil;
    }

    public int getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(int codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public String getNomeEstadoCivil() {
        return nomeEstadoCivil;
    }

    public void setNomeEstadoCivil(String nomeEstadoCivil) {
        this.nomeEstadoCivil = nomeEstadoCivil;
    }
    
    
    
    
}
