<?php

$i=0;
while($i<10){
    echo $i.' ';
    $i++;
}
echo '<br>';

$i=0;
do{
    echo $i.' ';
    $i++;
}while($i<10);
echo '<br>';

$nome='Bruno';
do{
    echo $nome;
}while($nome!='Bruno');
?>