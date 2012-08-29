/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudosicolamasterdetail.controller;

import estudosicolamasterdetail.dao.DisciplinaDao;
import estudosicolamasterdetail.modelo.DisciplinaCurso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vanilson
 */
public class DisciplinaCursoController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        int codigoCurso = Integer.parseInt(request.getParameter("codigocurso"));
        DisciplinaDao dd = new DisciplinaDao();
        DisciplinaCurso dc = new DisciplinaCurso();
        if (codigoCurso == 0) {
            out.write("Seleccione o curso do aluno");
        } 
        else {
            List<DisciplinaCurso> ldc = dd.pesquisarDisciplinaPorCurso(codigoCurso);
            StringBuilder sb = new StringBuilder("");
            for (DisciplinaCurso dcc : ldc) {
                sb.append(dcc.getDiscplina().getCodigoDisciplina() + "-" + dcc.getDiscplina().getNomeDisciplina() + ":");
            }
            out.write(sb.toString());
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
