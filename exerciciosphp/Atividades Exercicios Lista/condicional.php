<?php 

$var1=3;
$var2=2;

if ($var1+$var2==5){
    echo "</br>";
    echo "$var1 + $var2 é igual a 5";// Exibe na tela: 3+2 é igual a 5
    echo "</br>";


} else{
    echo "</br>";
    echo "$var1 + $var2 não é igual a 5 (?)"; 
    echo "</br>";
}

echo "</br>";

$nome= 'Bruno';
if ($nome == 'Bruno'){
    echo "</br>";
    echo 'O valor da variavel '.$nome.' é Bruno';
    echo "</br>";


} else{
    echo "</br>";
    echo 'O valor da variavel '.$nome.' não é Bruno'; 
    echo "</br>";
}

$numero= 5;
if ($numero >10){
    echo "</br>";
    echo 'A variável '.$numero.' é maior que 10';
    echo "</br>";
}else if ($numero >7){
    echo "</br>";
    echo 'A variável '.$numero.' é maior que 7';
    echo "</br>";
}else if ($numero >=5){
    echo "</br>";
    echo 'A variável '.$numero.' é igual a 5'; // esse será inicalmente executado.
    echo "</br>";
}else if ($numero >=3){
    echo "</br>";
    echo 'A variável '.$numero.' é maior que 3';
    echo "</br>";
} else {
    echo "</br>";
    echo 'A variável '.$numero.' possui um valor diferente das condicionais anteriores.';
    echo "</br>";
}

$numero= -5;

if ($numero >0){
    echo "</br>";
    echo 'A variável '.$numero.' é positivo.';
    echo "</br>";
}else if ($numero <0){
    echo "</br>";
    echo 'A variável '.$numero.' é negativa.'; // esse será inicalmente executado.
    echo "</br>";
}else if ($numero == 0){
    echo "</br>";
    echo 'A variável '.$numero.' é igual a 0.';
    echo "</br>";
}else {
    echo "</br>";
    echo 'A variável '.$numero.' não é um número.';
    echo "</br>";
}

if ($numero !=5){
    echo "</br>";
    echo 'A variável '.$numero.' é positivo.'; // Será exibido na tela.
    echo "</br>";
}else {
    echo "</br>";
    echo 'A variável '.$numero. 'não é igual a 5.';
    echo "</br>";
}

echo "</br>";
// Mútiplas condições:if
$numero=5;
$nome='Bruno';

if($numero >= 3 && $numero <= 7){
    echo 'A variável '.$numero.' é maior igual ou a 3 e menor ou igual a 7';
}

if($numero == 5 || $numero == 3){
    echo 'A variável'.$numero. ' é maior ou igual a 5 ou igual a 7';
}

if($numero >= 3 && $numero <= 7){
    echo 'A variável '.$numero.' é maior igual ou a 3 e menor ou igual a 7';
}
if ($numero != 7 && $nome=='Bruno'){
    echo 'A variável '.$numero.' é diferente de 7 e a variável '.$nome.' é igual a "Bruno"';
}
?>