/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class TipoOcorrencia {
    private int codigoTipoOcorrencia;
    private String descricaoTipoOcorrencia;

    public TipoOcorrencia() {
    }

    public TipoOcorrencia(int codigoTipoOcorrencia, String descricaoTipoOcorrencia) {
        this.codigoTipoOcorrencia = codigoTipoOcorrencia;
        this.descricaoTipoOcorrencia = descricaoTipoOcorrencia;
    }

    public int getCodigoTipoOcorrencia() {
        return codigoTipoOcorrencia;
    }

    public void setCodigoTipoOcorrencia(int codigoTipoOcorrencia) {
        this.codigoTipoOcorrencia = codigoTipoOcorrencia;
    }

    public String getDescricaoTipoOcorrencia() {
        return descricaoTipoOcorrencia;
    }

    public void setDescricaoTipoOcorrencia(String descricaoTipoOcorrencia) {
        this.descricaoTipoOcorrencia = descricaoTipoOcorrencia;
    }
    
    
    
}
