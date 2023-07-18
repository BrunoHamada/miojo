<?php 
$banco="banco.txt";

$conteudo=$_POST["nome"]. "\n".$_POST["email"]. "\n" .$_POST["data"]. "\n". str_replace("\n","<br>", $_POST["Mensagem"])."\n";

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
?>