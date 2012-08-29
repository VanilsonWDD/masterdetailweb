/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Turma {
    
    private int codigoTurma;
    private String nomeTurma;

    public Turma() {
    }

    public Turma(int codigoTurma, String nomeTurma) {
        this.codigoTurma = codigoTurma;
        this.nomeTurma = nomeTurma;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    
    
    
}
