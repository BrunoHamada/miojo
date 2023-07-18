<?php 
//incluindo o arquivo de conexão com banco de
include_once("Model/Crud.php");

$crud= new Crud();

//obtendo id dos dados url
$id= $crud->escape_string($_GET['id']);

//excluindo a linha da tabela
//$result= $crud->execute("DELETE FROM users WHERE id=$id");
$result= $crud->delete($id, 'users');


if($result){
    //redirecionamento para a pagina de exibição (index.php neste caso)
    header("Location:select.php");
}
?>