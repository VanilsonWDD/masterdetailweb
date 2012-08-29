/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Pais {
    private int codigoPais;
    private String nomePais;
    private String dominioRegional;

    public Pais() {
    }

    public Pais(int codigoPais, String nomePais, String dominioRegional) {
        this.codigoPais = codigoPais;
        this.nomePais = nomePais;
        this.dominioRegional = dominioRegional;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDominioRegional() {
        return dominioRegional;
    }

    public void setDominioRegional(String dominioRegional) {
        this.dominioRegional = dominioRegional;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
    
    
    
    
    
}
