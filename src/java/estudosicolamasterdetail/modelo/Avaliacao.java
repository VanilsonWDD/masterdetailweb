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
public class Avaliacao {
    private int codigoAvaliacao;
    private double notaAvaliecao,pesoAvaliacao;  
    private Date dataAvalicao;
    private MetodoAvaliacao metodoAvalicao;
    private Aluno aluno;

    public Avaliacao() {
    }

    public Avaliacao(int codigoAvaliacao, double notaAvaliecao, double pesoAvaliacao, Date dataAvalicao, MetodoAvaliacao metodoAvalicao, Aluno aluno) {
        this.codigoAvaliacao = codigoAvaliacao;
        this.notaAvaliecao = notaAvaliecao;
        this.pesoAvaliacao = pesoAvaliacao;
        this.dataAvalicao = dataAvalicao;
        this.metodoAvalicao = metodoAvalicao;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public Date getDataAvalicao() {
        return dataAvalicao;
    }

    public void setDataAvalicao(Date dataAvalicao) {
        this.dataAvalicao = dataAvalicao;
    }

    public MetodoAvaliacao getMetodoAvalicao() {
        return metodoAvalicao;
    }

    public void setMetodoAvalicao(MetodoAvaliacao metodoAvalicao) {
        this.metodoAvalicao = metodoAvalicao;
    }

    public double getNotaAvaliecao() {
        return notaAvaliecao;
    }

    public void setNotaAvaliecao(double notaAvaliecao) {
        this.notaAvaliecao = notaAvaliecao;
    }

    public double getPesoAvaliacao() {
        return pesoAvaliacao;
    }

    public void setPesoAvaliacao(double pesoAvaliacao) {
        this.pesoAvaliacao = pesoAvaliacao;
    }
    
  
            
}
