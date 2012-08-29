/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Semestre {
    private int codigoSimestre;
    private String nomeSimestre;

    public Semestre() {
    }

    public Semestre(int codigoSimestre, String nomeSimestre) {
        this.codigoSimestre = codigoSimestre;
        this.nomeSimestre = nomeSimestre;
    }

    public int getCodigoSimestre() {
        return codigoSimestre;
    }

    public void setCodigoSimestre(int codigoSimestre) {
        this.codigoSimestre = codigoSimestre;
    }

    public String getNomeSimestre() {
        return nomeSimestre;
    }

    public void setNomeSimestre(String nomeSimestre) {
        this.nomeSimestre = nomeSimestre;
    }
    
    
}
