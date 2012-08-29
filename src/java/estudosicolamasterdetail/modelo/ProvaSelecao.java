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
public class ProvaSelecao {
    private int codigoProva;
    private Candidato candidato;
    private Disciplina disciplina;
    private Date dataProva;
    private Date notaProva;

    public ProvaSelecao() {
    }

    public ProvaSelecao(int codigoProva, Candidato candidato, Disciplina disciplina, Date dataProva, Date notaProva) {
        this.codigoProva = codigoProva;
        this.candidato = candidato;
        this.disciplina = disciplina;
        this.dataProva = dataProva;
        this.notaProva = notaProva;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getCodigoProva() {
        return codigoProva;
    }

    public void setCodigoProva(int codigoProva) {
        this.codigoProva = codigoProva;
    }

    public Date getDataProva() {
        return dataProva;
    }

    public void setDataProva(Date dataProva) {
        this.dataProva = dataProva;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Date getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Date notaProva) {
        this.notaProva = notaProva;
    }
    
    
    
}
