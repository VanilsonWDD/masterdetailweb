/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class HistoricoAluno {
    private double  notaFinal;
    private Aluno aluno;
    private Disciplina disciplina;

    public HistoricoAluno() {
    }

    public HistoricoAluno(double notaFinal, Aluno aluno, Disciplina disciplina) {
        this.notaFinal = notaFinal;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
