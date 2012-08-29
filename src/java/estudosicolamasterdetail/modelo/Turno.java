/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Turno {
    private int codigoTurno;
    private String nomeTurno;

    public Turno() {
    }

    public Turno(int codigoTurno, String nomeTurno) {
        this.codigoTurno = codigoTurno;
        this.nomeTurno = nomeTurno;
    }

    public int getCodigoTurno() {
        return codigoTurno;
    }

    public void setCodigoTurno(int codigoTurno) {
        this.codigoTurno = codigoTurno;
    }

    public String getNomeTurno() {
        return nomeTurno;
    }

    public void setNomeTurno(String nomeTurno) {
        this.nomeTurno = nomeTurno;
    }
    
    
    
    
}
