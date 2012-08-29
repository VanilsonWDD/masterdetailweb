/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class MetodoAvaliacao {
    
    private int codigoMetodoAvaliacao;
    private String descricaoMetodoAvaliacao;
    private String metodoAvaliacaoCol;

    public MetodoAvaliacao() {
    }

    public MetodoAvaliacao(int codigoMetodoAvaliacao, String descricaoMetodoAvaliacao, String metodoAvaliacaoCol) {
        this.codigoMetodoAvaliacao = codigoMetodoAvaliacao;
        this.descricaoMetodoAvaliacao = descricaoMetodoAvaliacao;
        this.metodoAvaliacaoCol = metodoAvaliacaoCol;
    }

    public int getCodigoMetodoAvaliacao() {
        return codigoMetodoAvaliacao;
    }

    public void setCodigoMetodoAvaliacao(int codigoMetodoAvaliacao) {
        this.codigoMetodoAvaliacao = codigoMetodoAvaliacao;
    }

    public String getDescricaoMetodoAvaliacao() {
        return descricaoMetodoAvaliacao;
    }

    public void setDescricaoMetodoAvaliacao(String descricaoMetodoAvaliacao) {
        this.descricaoMetodoAvaliacao = descricaoMetodoAvaliacao;
    }

    public String getMetodoAvaliacaoCol() {
        return metodoAvaliacaoCol;
    }

    public void setMetodoAvaliacaoCol(String metodoAvaliacaoCol) {
        this.metodoAvaliacaoCol = metodoAvaliacaoCol;
    }
    
    
    
    
}
