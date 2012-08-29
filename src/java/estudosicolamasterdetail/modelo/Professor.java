/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.modelo;

/**
 *
 * @author WebServer_Script
 */
public class Professor {
    private int codigoProfessor;
    private String nomeProfessor,telefoneProfessor;
    private String emailProfessor,bairroProfessor,ruaProfessor,casaProfessor;
    private String loginProfessor,senhaProfessor;
    private Sexo sexo;
    private EstadoCivil estadoCivil;

    public Professor() {
    }

    public Professor(int codigoProfessor, String nomeProfessor, String telefoneProfessor, String emailProfessor, String bairroProfessor, String ruaProfessor, String casaProfessor, String loginProfessor, String senhaProfessor, Sexo sexo, EstadoCivil estadoCivil) {
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
        this.telefoneProfessor = telefoneProfessor;
        this.emailProfessor = emailProfessor;
        this.bairroProfessor = bairroProfessor;
        this.ruaProfessor = ruaProfessor;
        this.casaProfessor = casaProfessor;
        this.loginProfessor = loginProfessor;
        this.senhaProfessor = senhaProfessor;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getBairroProfessor() {
        return bairroProfessor;
    }

    public void setBairroProfessor(String bairroProfessor) {
        this.bairroProfessor = bairroProfessor;
    }

    public String getCasaProfessor() {
        return casaProfessor;
    }

    public void setCasaProfessor(String casaProfessor) {
        this.casaProfessor = casaProfessor;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getLoginProfessor() {
        return loginProfessor;
    }

    public void setLoginProfessor(String loginProfessor) {
        this.loginProfessor = loginProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getRuaProfessor() {
        return ruaProfessor;
    }

    public void setRuaProfessor(String ruaProfessor) {
        this.ruaProfessor = ruaProfessor;
    }

    public String getSenhaProfessor() {
        return senhaProfessor;
    }

    public void setSenhaProfessor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefoneProfessor() {
        return telefoneProfessor;
    }

    public void setTelefoneProfessor(String telefoneProfessor) {
        this.telefoneProfessor = telefoneProfessor;
    }
    
    
    
            
    
    
    
}
