<%-- 
    Document   : index
    Created on : 28/Ago/2012, 11:29:51
    Author     : Vanilson
--%>
<%@page import="java.util.List, estudosicolamasterdetail.modelo.Classe, estudosicolamasterdetail.modelo.Semestre, estudosicolamasterdetail.modelo.Turno, estudosicolamasterdetail.modelo.Curso, estudosicolamasterdetail.modelo.Matricula, estudosicolamasterdetail.modelo.Turma, estudosicolamasterdetail.dao.CursoDao, estudosicolamasterdetail.dao.MatriculaDao, estudosicolamasterdetail.dao.TurmaDao, estudosicolamasterdetail.dao.TurnoDao, estudosicolamasterdetail.dao.SemestreDao, estudosicolamasterdetail.dao.ClasseDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sicola</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">   
        <link rel="stylesheet" href="css/estilo.css">
        <script src = "js/jquery-1.7.1.js"></script>
        <script type="text/javascript" src = "bootstrap/js/bootstrap.js"></script>
        <script src="js/ajax.js"></script>
        <style type="text/css">
            #formulario{
                margin: 10px auto;
                width: 1150px;
            }
            #formulario form{
                margin: 0 0 0 57px;
            }
            #responsavel{
                width: 200px;
                margin-left: -59px;
            }
            input{
                width: 350px;
            }
            select[name=sltcurso], select[name=sltturma], select[name=sltclasse], select[name=sltsemestre], select[name=sltturno]{
                width: 365px;
            }
            table select{
                width: 210px;
            }
            #opcoes tr td:nth-child(1){
                width: 300px;
            }
            #disciplinas{
                width: 300px;
            }
            form{
                float: left;

            }
            #tabela{
                float: left;
                width: 550px;
                margin: 0 0 0 17px;
            }
            #detalhes{
                margin-top: -22px;
            }
        </style>
    </head>
    <body>
        <div id ="formulario">
            <legend>Matricula</legend>
            <form class="form-horizontal">

                <div class="control-group">
                    <label class="control-label" for ="numero-matricula">Numero da matricula</label>
                    <div class="controls">
                        <%
                            MatriculaDao md = new MatriculaDao();
                            int pegaUltimoCodigoMatricula = md.buscarUltimoCodigoVenda() + 1;
                        %>
                        <input type="text" name="txtnumeromatricula" value = <%= pegaUltimoCodigoMatricula%> readonly/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for ="numero-aluno">Numero do aluno</label>
                    <div class="controls">
                        <input type="text" name="txtnumeroaluno" />
                    </div>
                </div>
                <div class="control-group">
                    <label  class="control-label" for ="curso">Curso</label>
                    <div class="controls">
                        <select name="sltcurso">
                            <option value="0">--Seleccione o curso--</option>
                            <%
                                CursoDao ad = new CursoDao();
                                List<Curso> lc = ad.visualizar();
                                for (Curso c : lc) {
                            %>
                            <option value="<%= c.getCodigoCurso()%>"><%= c.getNomeCurso()%></option>
                            <%}%> 
                        </select>
                    </div>
                </div>
                <div class="control-group">
                    <label  class="control-label" for ="turma">Turma</label>
                    <div class="controls">
                        <select name="sltturma">
                            <option select ="select">--Seleccione a turma--</option>
                            <%
                                TurmaDao td = new TurmaDao();
                                List<Turma> lt = td.visualizar();
                                for (Turma t : lt) {
                            %>
                            <option value="<%= t.getCodigoTurma()%>"><%= t.getNomeTurma()%></option>
                            <%}%> 
                        </select>  
                    </div>
                </div>
                <div class="control-group">
                    <label  class="control-label" for ="classe">Classe</label>
                    <div class="controls">
                        <select name="sltclasse">
                            <option select ="select">--Seleccione a classe--</option>
                            <%
                                ClasseDao cd = new ClasseDao();
                                List<Classe> lcl = cd.visualizar();
                                for (Classe c : lcl) {
                            %>
                            <option value="<%= c.getCodigoClase()%>"><%= c.getNomeClasse()%></option>
                            <%}%> 
                        </select>   
                    </div>
                </div>
                <div class="control-group">
                    <label  class="control-label" for ="semestre">Semestre</label>
                    <div class="controls">
                        <select name="sltsemestre">
                            <option select ="select">--Seleccione o semestre--</option>
                            <%
                                SemestreDao sd = new SemestreDao();
                                List<Semestre> ls = sd.visualizar();
                                for (Semestre s : ls) {
                            %>
                            <option value="<%= s.getCodigoSimestre()%>"><%= s.getNomeSimestre()%></option>
                            <%}%> 
                        </select> 
                    </div>
                </div>
                <div class="control-group">
                    <label  class="control-label" for ="semestre">Turno</label>
                    <div class="controls">
                        <select name="sltturno">
                            <option select ="select">--Seleccione o turno--</option>
                            <%
                                TurnoDao tda = new TurnoDao();
                                List<Turno> ltu = tda.visualizar();
                                for (Turno t : ltu) {
                            %>
                            <option value="<%= t.getCodigoTurno()%>"><%= t.getNomeTurno()%></option>
                            <%}%>
                        </select>  
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for ="hora">Hora</label>
                    <div class="controls">
                        <input type="text" name="txthora" />
                    </div>
                </div>

                <div class="control-group">
                    <label class="control-label" for ="hora">Data</label>
                    <div class="controls">
                        <input type="text" name="txtdata" />
                    </div>
                </div>

                <div class="control-group">
                    <label class="control-label" for ="responsavel" id ="responsavel">Responsavel pelo atendimento</label>
                    <div class="controls">
                        <input type="text" name="txtresponsavel" />
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for ="ano-lectivo" >Ano lectivo</label>
                    <div class="controls">
                        <input type="text" name="txtanolectivo" />
                    </div>
                </div>
                <div id ="botoes">
                    <label class="control-label" for ="ano-lectivo" ></label>
                    <div class="controls">
                        <input type ="submit" value="Matricular aluno" class="btn"/>
                    </div>
                    
                </div>
            </form>
            <div id ="tabela">
                <table id ="opcoes" class="table table-striped">
                    <tr>
                        <td id ="disciplinas">Disciplinas</td>
                    </tr>
                </table>
                <table id="detalhes" class="table">
                </table>
            </div>
            <!---->
        </div>
    </body>
</html>
