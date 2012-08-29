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
public class Ocorrencia {
    private int codigoOcorrencia;
    private String observacao;
    private TipoOcorrencia tipoOcorrencia;
    private Turma turma;
    private Date dataOcorrencia;
    private Aluno aluno;
    private Disciplina disciplina;

    public Ocorrencia() {
    }

    public Ocorrencia(int codigoOcorrencia, String observacao, TipoOcorrencia tipoOcorrencia, Turma turma, Date dataOcorrencia, Aluno aluno, Disciplina disciplina) {
        this.codigoOcorrencia = codigoOcorrencia;
        this.observacao = observacao;
        this.tipoOcorrencia = tipoOcorrencia;
        this.turma = turma;
        this.dataOcorrencia = dataOcorrencia;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(int codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
    
    
}
