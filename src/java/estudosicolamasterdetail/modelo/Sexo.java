/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Sexo {
    private int codigoSexo;
    private String nomeSexo;

    public Sexo() {
    }

    public Sexo(int codigoSexo, String nomeSexo) {
        this.codigoSexo = codigoSexo;
        this.nomeSexo = nomeSexo;
    }

    public int getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(int codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getNomeSexo() {
        return nomeSexo;
    }

    public void setNomeSexo(String nomeSexo) {
        this.nomeSexo = nomeSexo;
    }
    
    
    
    
}
