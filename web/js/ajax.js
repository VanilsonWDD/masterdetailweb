$(document).ready(function() {
    function habilitarcampos(){
        $('#opcoes select').each(function(i){
            $(this).removeAttr('disabled');   
        });
    }
    function desabilitarcampos(){
        $('#opcoes select').each(function(i){
            $(this).attr('disabled', 'disabled');   
        });        
    }
    //pesquisar disciplinas por curso
    $('select[name=sltcurso]').on('change', function(){        
        $.ajax({
            type: 'GET',
            url: 'DisciplinaCursoController',
            data: 'codigocurso='+$('select[name=sltcurso]').val(),
            statusCode: {
              404: function() {
                console.log('Pagina não encontrada');
              },
              500: function(){
                console.log('Erro no servidor');
              }
            },
            success: function(dados){
                var detalhes = $('#detalhes');
                $('#detalhes tr').remove();
                
                if(dados == ''){
                    desabilitarcampos();
                    detalhes.
                    append('<tr>\n\
                                <td>Não existem disciplinas registadas para esse curso</td>\n\
                          <tr/>'); 
                }
                else if(dados == 'Seleccione o curso do aluno'){
                    desabilitarcampos();
                    detalhes.
                    append('<tr>\n\
                                <td>Seleccione o curso do aluno</td>\n\
                          <tr/>');                    
                }
                else{
                    habilitarcampos();
                    pegadados = dados.split(":");
                    for(var i = 0; i < pegadados.length - 1; i++){
                       var codigodisciplina = pegadados[i].split("-")[0]; 
                       var nomedisciplina = pegadados[i].split("-")[1];
                       detalhes.
                       append('<tr>\n\
                                    <td><input type = checkbox value ="'+codigodisciplina+'"/>&nbsp;'+nomedisciplina+'</td>\n\
                             <tr/>'); 
                    }
                }               
            }
        })
    });
})