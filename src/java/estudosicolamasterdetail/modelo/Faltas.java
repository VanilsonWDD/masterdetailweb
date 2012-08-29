/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

import java.util.Date;

/**
 *
 * @author WebServer_Script
 */
public class Faltas {
    private int codigoFaltas;
    private Date dataFaltas;
    private Aluno aluno;

    public Faltas() {
    }

    public Faltas(int codigoFaltas, Date dataFaltas, Aluno aluno) {
        this.codigoFaltas = codigoFaltas;
        this.dataFaltas = dataFaltas;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getCodigoFaltas() {
        return codigoFaltas;
    }

    public void setCodigoFaltas(int codigoFaltas) {
        this.codigoFaltas = codigoFaltas;
    }

    public Date getDataFaltas() {
        return dataFaltas;
    }

    public void setDataFaltas(Date dataFaltas) {
        this.dataFaltas = dataFaltas;
    }
    
    
}
