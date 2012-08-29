/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import estudosicolamasterdetail.conexao.Conexao;
import estudosicolamasterdetail.modelo.Aluno;
import estudosicolamasterdetail.modelo.Curso;

/**
 *
 * @author Vanilson
 */
public class CursoDao {
    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;

    public CursoDao() {
    }
    public List<Curso> visualizar() {
        List<Curso> lc = new ArrayList<Curso>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select *from curso");
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem cursos cadastrados");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Curso c = new Curso();
                    c.setCodigoCurso(rs.getInt("codigo_curso"));
                    c.setNomeCurso(rs.getString("nome_curso"));
                    lc.add(c);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar cursos " + exception);
        }
        return lc;
    }    
    
}
