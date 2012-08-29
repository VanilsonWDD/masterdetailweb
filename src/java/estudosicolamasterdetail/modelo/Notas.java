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
public class Notas {
    private double nota;
    private Date anoLectivo;
    private Aluno aluno;
    private Disciplina disciplina;

    public Notas() {
    }

    public Notas(double nota, Date anoLectivo, Aluno aluno, Disciplina disciplina) {
        this.nota = nota;
        this.anoLectivo = anoLectivo;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(Date anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
