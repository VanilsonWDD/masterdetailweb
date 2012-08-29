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
public class Matricula {
    private int codigoMatricula;
    private Date dataMatricula,horaMatricula;
    private Aluno aluno;
    private Curso curso;
    private AnoLectivo anoLectivo;

    public Matricula() {
    }

    public Matricula(int codigoMatricula, Date dataMatricula, Date horaMatricula, Aluno aluno, Curso curso, AnoLectivo anoLectivo) {
        this.codigoMatricula = codigoMatricula;
        this.dataMatricula = dataMatricula;
        this.horaMatricula = horaMatricula;
        this.aluno = aluno;
        this.curso = curso;
        this.anoLectivo = anoLectivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public int getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(int codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Date getHoraMatricula() {
        return horaMatricula;
    }

    public void setHoraMatricula(Date horaMatricula) {
        this.horaMatricula = horaMatricula;
    }
    
    
    
}
