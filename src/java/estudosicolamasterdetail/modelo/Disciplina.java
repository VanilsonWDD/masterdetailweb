/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Disciplina {
    
    private int codigoDisciplina;
    private String nomeDisciplina;
    private String   ementaDisciplina;

    public Disciplina() {
    }

    public Disciplina(int codigoDisciplina, String nomeDisciplina, String ementaDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.ementaDisciplina = ementaDisciplina;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getEmentaDisciplina() {
        return ementaDisciplina;
    }

    public void setEmentaDisciplina(String ementaDisciplina) {
        this.ementaDisciplina = ementaDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    
    
}
