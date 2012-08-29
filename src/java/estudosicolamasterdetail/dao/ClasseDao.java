/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import estudosicolamasterdetail.conexao.Conexao;
import estudosicolamasterdetail.modelo.Classe;
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
public class ClasseDao {
    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;

    public ClasseDao() {
    }
    
    public List<Classe> visualizar() {
        List<Classe> lc = new ArrayList<Classe>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select *from classe");
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem classes cadastradas");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Classe c = new Classe();
                    c.setCodigoClase(rs.getInt("codigo_classe"));
                    c.setNomeClasse(rs.getString("nome_classe"));
                    lc.add(c);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar classes " + exception);
        }
        return lc;
    }     
}
