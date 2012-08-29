/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import estudosicolamasterdetail.conexao.Conexao;
import estudosicolamasterdetail.modelo.Curso;
import estudosicolamasterdetail.modelo.Semestre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vanilson
 */
public class SemestreDao {

    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;

    public SemestreDao() {
    }

    public List<Semestre> visualizar() {
        List<Semestre> ls = new ArrayList<Semestre>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select *from semestre");
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem semestres cadastrados");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Semestre s = new Semestre();
                    s.setCodigoSimestre(rs.getInt("codigo_semestre"));
                    s.setNomeSimestre(rs.getString("nome_semestre"));
                    ls.add(s);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar semestres " + exception);
        }
        return ls;
    }
}
