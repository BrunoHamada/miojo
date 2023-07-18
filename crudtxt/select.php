<?php 
$banco= "banco.txt";
echo "<CENTER>Registro cadastros na base de dados.<br> </CENTER>";
echo "<br>";
if (file_exists($banco) && !empty(file_get_contents($banco))){
    $lista= explode("\n", file_get_contents($banco));
    $informacoes= 5;
    unset($lista[count($lista) - 1]);
    $conjunto= 1;

    echo "<center><table border=1>";
    date_default_timezone_set('America/Sao_Paulo');
    echo "<meta charset='UTF-8'>";
    
    echo "<tr><th>Código</th> <th>Nome banda</th><th>Genero Banda</th><th>Música preferida</th><th>Data do Álbum</th><th>Conte mais sobre a Banda</th><th>Acoes</th></tr>";
    for ($i= 0; $i< count($lista); $i +=$informacoes){
        echo "<tr>";
        echo "<td id= '$conjunto'>$conjunto</td>";

        for ($j= $i; $j <$i + $informacoes; $j++){
            echo "<td>{$lista[$j]}</td>";
        }

        echo "<td><a href='delete.php?codigo=$conjunto'><img src='img/delete_crud.png' alt='Deletar registro' title='Deletar dados'></a><a href='monta.php?codigo=$conjunto'><img src='img/update_crud.png' alt='Atualizar' title='Atualizar registro'><a href='index.php'><img src='img/insert_crud.png' alt= 'Inserir' title='Inserir' title='Inserir registro'></td.";
        echo "</tr>";

        $conjunto++;
    }
    echo "</table>";
    echo "<footer id= 'footer'>";
    echo "</footer>";

} else {
    echo "<br><br><p align=center>Ainda não há nenhum registro!</p>";
}
?>