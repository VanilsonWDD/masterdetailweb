/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import estudosicolamasterdetail.conexao.Conexao;
import estudosicolamasterdetail.modelo.Curso;
import estudosicolamasterdetail.modelo.Turma;
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
public class TurmaDao {

    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;

    public TurmaDao() {
    }

    public List<Turma> visualizar() {
        List<Turma> lt = new ArrayList<Turma>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select *from turma");
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem turmas cadastrados");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Turma t = new Turma();
                    t.setCodigoTurma(rs.getInt("codigo_turma"));
                    t.setNomeTurma(rs.getString("nome_turma"));
                    lt.add(t);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar turmas " + exception);
        }
        return lt;
    }
}
