/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class ProfessorTurma {
   
    private AnoLectivo anoAlectivo;
    private Turma turma;
    private Professor professr;

    public ProfessorTurma() {
    }

    public AnoLectivo getAnoAlectivo() {
        return anoAlectivo;
    }

    public void setAnoAlectivo(AnoLectivo anoAlectivo) {
        this.anoAlectivo = anoAlectivo;
    }

    public Professor getProfessr() {
        return professr;
    }

    public void setProfessr(Professor professr) {
        this.professr = professr;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

   
    
    
    
}
