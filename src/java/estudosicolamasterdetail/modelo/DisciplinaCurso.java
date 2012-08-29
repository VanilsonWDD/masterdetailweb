/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class DisciplinaCurso {
    
    private Curso curso;
    private Disciplina discplina;

    public DisciplinaCurso() {
    }

    public DisciplinaCurso(Curso curso, Disciplina discplina) {
        this.curso = curso;
        this.discplina = discplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDiscplina() {
        return discplina;
    }

    public void setDiscplina(Disciplina discplina) {
        this.discplina = discplina;
    }
    
    
    
}
