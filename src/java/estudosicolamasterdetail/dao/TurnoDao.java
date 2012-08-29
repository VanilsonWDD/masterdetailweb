/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import estudosicolamasterdetail.conexao.Conexao;
import estudosicolamasterdetail.modelo.Turno;
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
public class TurnoDao {
    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;

    public TurnoDao() {
    }
    
    public List<Turno> visualizar() {
        List<Turno> lt = new ArrayList<Turno>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select *from turno");
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem turnos cadastrados");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Turno t = new Turno();
                    t.setCodigoTurno(rs.getInt("codigo_turno"));
                    t.setNomeTurno(rs.getString("nome_turno"));
                    lt.add(t);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar turno " + exception);
        }
        return lt;
    }    
}
