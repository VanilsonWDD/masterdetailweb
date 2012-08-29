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
import estudosicolamasterdetail.modelo.Curso;
import estudosicolamasterdetail.modelo.Disciplina;
import estudosicolamasterdetail.modelo.DisciplinaCurso;

/**
 *
 * @author Vanilson
 */
public class DisciplinaDao {
    private Connection conexao;
    private ResultSet rs;
    private PreparedStatement ps;
    
    public DisciplinaDao() {
    }
    
    public List<DisciplinaCurso> pesquisarDisciplinaPorCurso(int codigoCurso) {
        List<DisciplinaCurso> ldc = new ArrayList<DisciplinaCurso>();

        try {
            conexao = Conexao.getConnection();
            ps = conexao.prepareStatement("select d.codigo_disciplina, d.nome_disciplina from curso c, disciplina d, disciplina_curso dc where c.codigo_curso = dc.codigo_curso\n" +
                                          "and d.codigo_disciplina = dc.codigo_disciplina and dc.codigo_curso = ?");
            ps.setInt(1, codigoCurso);
            rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Não existem disciplinas cadastradas nesse curso");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    Curso c = new Curso();
                    Disciplina d = new Disciplina();
                    DisciplinaCurso dc = new DisciplinaCurso(); 
                    d.setCodigoDisciplina(rs.getInt("codigo_disciplina"));
                    d.setNomeDisciplina(rs.getString("nome_disciplina"));
                    dc.setDiscplina(d);
                    ldc.add(dc);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Impossivel visualizar disciplinas do curso " + exception);
        }
        return ldc;
    } 
}
