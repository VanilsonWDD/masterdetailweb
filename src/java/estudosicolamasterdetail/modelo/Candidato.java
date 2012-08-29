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
public class Candidato {
    private int codigoCandidato;
    private String nomeCandidato,nomePaiCandidato,nomeMaeCandidato;
    private Date dataNascimentoCandidato;
    private String bairroCandidato,ruaCandidato,casaCandidato,telefoneMovelCandidato,telefoneFixoCandidato;
    private String fotoCandidato;
    private String loginCandidato,senhaCandidato;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private Municipio municipio;

    public Candidato() {
    }

    public Candidato(int codigoCandidato, String nomeCandidato, String nomePaiCandidato, String nomeMaeCandidato, Date dataNascimentoCandidato, String bairroCandidato, String ruaCandidato, String casaCandidato, String telefoneMovelCandidato, String telefoneFixoCandidato, String fotoCandidato, String loginCandidato, String senhaCandidato, Sexo sexo, EstadoCivil estadoCivil, Municipio municipio) {
        this.codigoCandidato = codigoCandidato;
        this.nomeCandidato = nomeCandidato;
        this.nomePaiCandidato = nomePaiCandidato;
        this.nomeMaeCandidato = nomeMaeCandidato;
        this.dataNascimentoCandidato = dataNascimentoCandidato;
        this.bairroCandidato = bairroCandidato;
        this.ruaCandidato = ruaCandidato;
        this.casaCandidato = casaCandidato;
        this.telefoneMovelCandidato = telefoneMovelCandidato;
        this.telefoneFixoCandidato = telefoneFixoCandidato;
        this.fotoCandidato = fotoCandidato;
        this.loginCandidato = loginCandidato;
        this.senhaCandidato = senhaCandidato;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.municipio = municipio;
    }

    public String getBairroCandidato() {
        return bairroCandidato;
    }

    public void setBairroCandidato(String bairroCandidato) {
        this.bairroCandidato = bairroCandidato;
    }

    public String getCasaCandidato() {
        return casaCandidato;
    }

    public void setCasaCandidato(String casaCandidato) {
        this.casaCandidato = casaCandidato;
    }

    public int getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(int codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public Date getDataNascimentoCandidato() {
        return dataNascimentoCandidato;
    }

    public void setDataNascimentoCandidato(Date dataNascimentoCandidato) {
        this.dataNascimentoCandidato = dataNascimentoCandidato;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFotoCandidato() {
        return fotoCandidato;
    }

    public void setFotoCandidato(String fotoCandidato) {
        this.fotoCandidato = fotoCandidato;
    }

    public String getLoginCandidato() {
        return loginCandidato;
    }

    public void setLoginCandidato(String loginCandidato) {
        this.loginCandidato = loginCandidato;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getNomeMaeCandidato() {
        return nomeMaeCandidato;
    }

    public void setNomeMaeCandidato(String nomeMaeCandidato) {
        this.nomeMaeCandidato = nomeMaeCandidato;
    }

    public String getNomePaiCandidato() {
        return nomePaiCandidato;
    }

    public void setNomePaiCandidato(String nomePaiCandidato) {
        this.nomePaiCandidato = nomePaiCandidato;
    }

    public String getRuaCandidato() {
        return ruaCandidato;
    }

    public void setRuaCandidato(String ruaCandidato) {
        this.ruaCandidato = ruaCandidato;
    }

    public String getSenhaCandidato() {
        return senhaCandidato;
    }

    public void setSenhaCandidato(String senhaCandidato) {
        this.senhaCandidato = senhaCandidato;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefoneFixoCandidato() {
        return telefoneFixoCandidato;
    }

    public void setTelefoneFixoCandidato(String telefoneFixoCandidato) {
        this.telefoneFixoCandidato = telefoneFixoCandidato;
    }

    public String getTelefoneMovelCandidato() {
        return telefoneMovelCandidato;
    }

    public void setTelefoneMovelCandidato(String telefoneMovelCandidato) {
        this.telefoneMovelCandidato = telefoneMovelCandidato;
    }
    
    
    
    
}
