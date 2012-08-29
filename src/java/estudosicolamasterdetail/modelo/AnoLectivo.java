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
public class AnoLectivo {
    private int codigoAnoLectivo;
    private String anoCivilAnoLectivo;
    private Date dataInicioAnoLectivo;
    private Date dataFimAnoLectivo;

    public AnoLectivo() {
    }

    public AnoLectivo(int codigoAnoLectivo, String anoCivilAnoLectivo, Date dataInicioAnoLectivo, Date dataFimAnoLectivo) {
        this.codigoAnoLectivo = codigoAnoLectivo;
        this.anoCivilAnoLectivo = anoCivilAnoLectivo;
        this.dataInicioAnoLectivo = dataInicioAnoLectivo;
        this.dataFimAnoLectivo = dataFimAnoLectivo;
    }

    public String getAnoCivilAnoLectivo() {
        return anoCivilAnoLectivo;
    }

    public void setAnoCivilAnoLectivo(String anoCivilAnoLectivo) {
        this.anoCivilAnoLectivo = anoCivilAnoLectivo;
    }

    public int getCodigoAnoLectivo() {
        return codigoAnoLectivo;
    }

    public void setCodigoAnoLectivo(int codigoAnoLectivo) {
        this.codigoAnoLectivo = codigoAnoLectivo;
    }

    public Date getDataFimAnoLectivo() {
        return dataFimAnoLectivo;
    }

    public void setDataFimAnoLectivo(Date dataFimAnoLectivo) {
        this.dataFimAnoLectivo = dataFimAnoLectivo;
    }

    public Date getDataInicioAnoLectivo() {
        return dataInicioAnoLectivo;
    }

    public void setDataInicioAnoLectivo(Date dataInicioAnoLectivo) {
        this.dataInicioAnoLectivo = dataInicioAnoLectivo;
    }
    
    
    
    
}
