<?php 
$banco="banco.txt";

$conteudo=$_POST["nome_banda"]. "\n".$_POST["Genero_Banda"]. "\n".$_POST["Musica"]. "\n" .$_POST["data_album"]. "\n". str_replace("\n","<br>", $_POST["Conte_mais"])."\n";

$criar=fopen($banco, "a+");

fwrite($criar, $conteudo);

if($criar == true){
    echo "<script language='javascript' type='text/javascript'>
    alertt('Dados cadastrados com sucesso!')
    window.location.href='index.php'</script>";
} else{
    echo "<script language='javascript' type=text/javascript'>
    alert('Erro ao cadastrar os dados!')
    window.location.href='index.php'</script>";
    
}

fclose($criar);
header('location: /crudtxt/index.php')
?>