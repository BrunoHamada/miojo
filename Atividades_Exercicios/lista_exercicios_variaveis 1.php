<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<?php 
$nome= "Bruno";
$produto30= 6*5;
$produto27= 9*3;
$media= (5+8+12)/3;
$media= number_format($media, 2,',');
$numeroreal= 45.7;

$numeroi= 25;
$numAntes= $numeroi-1;
$numDepois= $numeroi+1;

$numerof= 77.5;
$boolean= true;

echo "1) Nome: $nome" .'<br>'. "2) Mutiplicação 6 X 5: $produto30" .'<br>'. "Mutiplicação 9 X 3: $produto27". '<br>'. "3) Média: $media";

echo "</br>";
echo "</br>";

echo "4) Numero inteiro: $numeroi" .'<br>'. "5) Numero sucessor: $numDepois" .'<br>'. "Numero anterior: $numAntes" .'<br>'. "6) Numeros reais: $numeroreal \ne  $numeroi";

echo "</br>";
echo "</br>";

$endereco= "Rua. Parana, N°54, Bairro: Tanquinho";
$fone= "94236-7936";
echo "7) Cliente: $nome" .'<br>'. "Endereço: $endereco" .'<br>'. "Telefone: $fone";

echo "</br>";
echo "</br>";

$numInteiro= 18;
$subtracao= $numeroi - $numInteiro;
echo "8) Subtração de dois numeros inteiros: $subtracao";

echo "</br>";
echo "</br>";

$dividir= $numeroreal/4;

echo "9) 1/4 do numero real $numeroreal é $dividir";

echo "</br>";
echo "</br>";

$medianumreal= (30+$numeroi+2)/3;
echo "10) A média aritmética de 30, $numeroi e 2: $medianumreal"

?>

</body>

</html>