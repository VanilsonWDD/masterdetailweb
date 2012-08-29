/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class DetalheMatricula {
    private int idDetalhesIscriao;
    private Matricula matricula;
    private Disciplina disciplina;
    private Turma turma;
    private Classe classe;

    public DetalheMatricula() {
    }

    public DetalheMatricula(int idDetalhesIscriao, Matricula matricula, Disciplina disciplina, Turma turma, Classe classe) {
        this.idDetalhesIscriao = idDetalhesIscriao;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.turma = turma;
        this.classe = classe;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdDetalhesIscriao() {
        return idDetalhesIscriao;
    }

    public void setIdDetalhesIscriao(int idDetalhesIscriao) {
        this.idDetalhesIscriao = idDetalhesIscriao;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
}
