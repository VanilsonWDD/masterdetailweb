/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Curso {
    
    private int codigoCurso;
    private String nomeCurso;
    private String  cargaHorariaCurso;

    public Curso() {
    }

    public Curso(int codigoCurso, String nomeCurso, String cargaHorariaCurso) {
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public String getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(String cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    
          
    
}
