/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Classe {
    
    private int codigoClase;
    private String nomeClasse;

    public Classe() {
    }

    public Classe(int codigoClase, String nomeClasse) {
        this.codigoClase = codigoClase;
        this.nomeClasse = nomeClasse;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }
    
    
    
}
