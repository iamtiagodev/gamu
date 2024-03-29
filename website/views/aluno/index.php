	<div class="container-fluid">
		<div class="row">
			<div id="header" class="col-xs-12" style="padding-top:30px;padding-bottom:70px;">
				<h2 id="title" class='text-center'>Alunos</h2>	
			</div>
		</div> 
	</div>

	<div class="container">
		<div id="sidebar" class="col-xs-12 col-md-2" style="padding-top:10px;">
			<ul class="sidebar nav nav-pills nav-stacked">
				<li role="presentation" class="normal">
					
					<a href="#" onclick="showModal()">
					<i class="fa fa-plus" style="padding-right: 20px"></i>
						Adicionar
					</a>
				</li>
				<li id="download" role="presentation" class="safe">
					<a href="?controller=aluno&action=exportxml">
						<i class="fa fa-file-text-o" style="padding-right: 20px"></i>
						Exportar XML
					</a>
				</li>
				<li role="presentation" class="safe">
					<a href="#" onclick="inputXML()">
						<i class="fa fa-file-pdf-o" style="padding-right: 20px"></i>
						Exportar PDF
					</a>
				</li>
				<li class="mydivider">
				</li>
				<li role="presentation" class="warn">
					<a href="#" onclick="inputXML()">
						<i class="fa fa-file-text-o" style="padding-right: 20px"></i>
						Importar XML
					</a>
				</li>
			</ul>
		</div>
		<div id="content" class="col-xs-12 col-md-10">
			<!-- Button trigger modal -->
			<table class='table'>
				<thead>
					<tr>
						<th width='5%'>#</th>
						<th width='40%'>Nome</th>
						<th width='15%'>Data de Nasc</th>
						<th width='7%'>Ano</th>
						<th width='25%'>Curso</th>
						<th width='4%'></th>
						<th width='4%'></th>
					</tr>
				</thead>
				<tbody>
					
					<?php
							foreach ($alunos as $aluno)
							{
								echo "<tr>";
								echo "<td>P".$aluno->id."</td>";
								echo "<td>".$aluno->nome."</td>";
								echo "<td>".$aluno->dataNasc."</td>";
								echo "<td>".$aluno->anocurso."º ano</td>";
								echo "<td>".$aluno->curso."</td>";
								echo "<td>
									  <a href='#' onclick='showModal2(\"".$aluno->id."\",\"".$aluno->nome."\",\"".$aluno->dataNasc."\",\"".$aluno->anocurso."\",\"".$aluno->id_curso."\")'><i class='fa fa-pencil-square-o'></i></a>
									  </td>
									  <td>
									  <a href='?controller=aluno&action=remove&id=".$aluno->id."'><i class='fa fa-times'></i></a>
									  </td>";
								echo "</tr>";
							}
					?>
				</tbody>
			</table>
			<?php
				echo "<nav class='text-center'>
					  <ul class='pagination'>";
															
				if($page-1<1)
					echo "<li class='disabled'><a href=''";
				else
					echo "<li><a href='?controller=aluno&action=index&page=".($page-1)."'";
					echo "aria-label='Previous'>
						   <span aria-hidden='true'>&laquo;</span>
						   </a>
						  </li>";
				for ($i=1; $i <=$result_number ; $i++) {
					if($i<$page-2){
						if($i==1)
							echo   "<li><a href='?controller=aluno&action=index&page=".$i."'>...</a></li>";
						continue;
					}


					if($page==$i)
						echo   "<li class='active'><a href='?controller=aluno&action=index&page=".$i."'>".$i."</a></li>";
					else
						echo   "<li><a href='?controller=aluno&action=index&page=".$i."'>".$i."</a></li>";
					if($i>$page+1){
						echo   "<li><a href='?controller=aluno&action=index&page=".$result_number."'>...</a></li>";
						break;	
					}

				}
				if($page+1>$result_number)
					echo "<li class='disabled'><a href=''";
				else
					echo "<li><a href='?controller=aluno&action=index&page=".($page+1)."'";
					echo "aria-label='Next'>
						  <span aria-hidden='true'>&raquo;</span>
						  </a>
						  </li>
						 </ul>
						</nav>";
			?>
		</div>
	</div>

<!-- Modal -->
<div class="modal fade" id="insertModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">Adicionar Aluno</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<form action='?controller=aluno&action=add' method="post" accept-charset="utf-8">
						<div class="col-md-12">
							<div class="form-group">
								<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do Aluno">
							</div>
							<div class="form-group">
								<input type="date" class="form-control" id="dataNasc" name="dataNasc" placeholder="Data de Nascimento">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<input type="number" class="form-control" id="anoCurso" name="anoCurso" placeholder="Ano a Frequentar">
								</div>
						</div>					
						<div class="col-md-8">
							
							<select class="form-control" name="id_curso">
									
									<?php
										//echo "<option value='' disabled selected>Escolha um Curso</option>";
										$nr_cursos = Curso::count();
										$cursos = Curso::retrieve('designacao',1,100);
										
										foreach ($cursos as $curso) {
											echo "<option value='".$curso->id."'>".$curso->designacao."</option>";
										}
									?>	
							</select>
						</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="submit" class="btn btn-primary">Adicionar</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
					</form>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">Editar Aluno</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<form action='?controller=aluno&action=update' method="post" accept-charset="utf-8">
						<div class="hiddenfile" style="width: 0px; height: 0px; overflow: hidden;">
							<div class="form-group">
								<input type="text" class="form-control" id="idu" name="id">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<input type="text" class="form-control" id="nomeu" name="nome" placeholder="Nome do Aluno">
							</div>
							<div class="form-group">
								<input type="date" class="form-control" id="dataNascu" name="dataNasc" placeholder="Data de Nascimento">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<input type="number" class="form-control" id="anoCursou" name="anoCurso" placeholder="Ano a Frequentar">
								</div>
						</div>					
						<div class="col-md-8">
							
							<select id="cursou" class="form-control" name="id_curso">
									
									<?php
										//echo "<option value='' disabled selected>Escolha um Curso</option>";
										$nr_cursos = Curso::count();
										$cursos = Curso::retrieve('designacao',1,100);
										
										foreach ($cursos as $curso) {
											echo "<option value='".$curso->id."'>".$curso->designacao."</option>";
										}
									?>	
							</select>
						</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="submit" class="btn btn-primary">Actualizar</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
					</form>
			</div>
		</div>
	</div>
</div>



<div  class="hiddenfile" style="width: 0px; height: 0px; overflow: hidden;">
<form id="upload" action='?controller=aluno&action=importxml' method="post" accept-charset="utf-8" enctype="multipart/form-data">
  <input type="file" name="ficheiro" id="file" />
  <input type="submit" name="Enviar"/>
</form>
</div>
<script type="text/javascript">
function showModal(){
	$('#insertModal').modal('show');};
function showModal2(id,nome,dataNasc,anoCurso,curso){
	$('#idu').val(id);
	$('#nomeu').val(nome);
	$('#dataNascu').val(dataNasc);
	$('#anoCursou').val(anoCurso);
	$('#cursou').val(curso);
	$('#updateModal').modal('show');
};
function inputXML(){
	$('#file').trigger('click');
}
$('#file').change(function() {
  $('#upload').submit();
});
</script>