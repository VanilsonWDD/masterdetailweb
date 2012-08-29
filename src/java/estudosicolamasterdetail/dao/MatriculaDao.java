/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import estudosicolamasterdetail.conexao.Conexao;
/**
 *
 * @author Vanilson
 */
public class MatriculaDao {
    PreparedStatement ps;
    ResultSet rs;
    Connection conexao;
    public int buscarUltimoCodigoVenda() {
        try{
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select max(codigo_matricula) as codigo from matricula");
            rs = ps.executeQuery();
            if(rs.last())
                 return rs.getInt("codigo");
            ps.close();
            conexao.close();
        }
        catch(SQLException exception){
            
        }
        return 0;
    }    
}
