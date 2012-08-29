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
public class Aluno {
    private int codigoAluno;
    private String nomeAluno,nomePaiAluno,nomeMaeAluno;
    private Date dataNascimentoAluno;
    private String bairroAluno,ruaAluno,casaAluno;
    private String telefoneMovelAluno,telefoneFixoAluno,fotoAluno;
    private String loginAluno,senhaAluno;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private Municipio municipio;

    public Aluno() {
    }

    public Aluno(int codigoAluno, String nomeAluno, String nomePaiAluno, String nomeMaeAluno, Date dataNascimentoAluno, String bairroAluno, String ruaAluno, String casaAluno, String telefoneMovelAluno, String telefoneFixoAluno, String fotoAluno, String loginAluno, String senhaAluno, Sexo sexo, EstadoCivil estadoCivil, Municipio municipio) {
        this.codigoAluno = codigoAluno;
        this.nomeAluno = nomeAluno;
        this.nomePaiAluno = nomePaiAluno;
        this.nomeMaeAluno = nomeMaeAluno;
        this.dataNascimentoAluno = dataNascimentoAluno;
        this.bairroAluno = bairroAluno;
        this.ruaAluno = ruaAluno;
        this.casaAluno = casaAluno;
        this.telefoneMovelAluno = telefoneMovelAluno;
        this.telefoneFixoAluno = telefoneFixoAluno;
        this.fotoAluno = fotoAluno;
        this.loginAluno = loginAluno;
        this.senhaAluno = senhaAluno;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.municipio = municipio;
    }

    public String getBairroAluno() {
        return bairroAluno;
    }

    public void setBairroAluno(String bairroAluno) {
        this.bairroAluno = bairroAluno;
    }

    public String getCasaAluno() {
        return casaAluno;
    }

    public void setCasaAluno(String casaAluno) {
        this.casaAluno = casaAluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Date getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno(Date dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFotoAluno() {
        return fotoAluno;
    }

    public void setFotoAluno(String fotoAluno) {
        this.fotoAluno = fotoAluno;
    }

    public String getLoginAluno() {
        return loginAluno;
    }

    public void setLoginAluno(String loginAluno) {
        this.loginAluno = loginAluno;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeMaeAluno() {
        return nomeMaeAluno;
    }

    public void setNomeMaeAluno(String nomeMaeAluno) {
        this.nomeMaeAluno = nomeMaeAluno;
    }

    public String getNomePaiAluno() {
        return nomePaiAluno;
    }

    public void setNomePaiAluno(String nomePaiAluno) {
        this.nomePaiAluno = nomePaiAluno;
    }

    public String getRuaAluno() {
        return ruaAluno;
    }

    public void setRuaAluno(String ruaAluno) {
        this.ruaAluno = ruaAluno;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefoneFixoAluno() {
        return telefoneFixoAluno;
    }

    public void setTelefoneFixoAluno(String telefoneFixoAluno) {
        this.telefoneFixoAluno = telefoneFixoAluno;
    }

    public String getTelefoneMovelAluno() {
        return telefoneMovelAluno;
    }

    public void setTelefoneMovelAluno(String telefoneMovelAluno) {
        this.telefoneMovelAluno = telefoneMovelAluno;
    }
    
    
    
    
}
