<?php 

//$valorInt1= 5;
//$valorInt1= 4;
$valorInt2= 4;
//$valorInt2= 10;
$valorInt1= 20;
$somaInt= $valorInt1+$valorInt2;

echo "1) ";
if ($somaInt<=10){
    echo "A soma entre $valorInt1 + $valorInt2 = $somaInt sendo menor ou igual a 10.";

} else {

    echo "A soma entre $valorInt1 + $valorInt2 = $somaInt o resultado é maior que 10.";
}
echo '</br> </br>';

echo "2) ";

if ($somaInt<=20){
    $resultado= $somaInt-5;
    echo "A soma entre $valorInt1 + $valorInt2 = $somaInt sendo menor ou igual a 20 foi retirado 5 passando ser igual a $resultado.";

} else {
    $resultado= $somaInt+8;
    echo "A soma entre $valorInt1 + $valorInt2 = $somaInt sendo maior que 20 foi adicionado 8 passando ser igual a $resultado.";
}
echo '</br> </br>';

echo "3) ";
$numero= 6;
$numero= 7;

if ($numero %2==0){
    echo "O número $numero é múltiplo de 3.";
} else{
    echo "O número $numero NÃO é múltiplo de 3";
}
echo '</br> </br>';

echo "4) ";

if ($valorInt1 %5==0){
    echo "O número $valorInt1 é divisível por 5";
} else {
    echo "O número $valorInt1 não é divisível por 5";
}
echo '</br> </br>';

//$num= 3;
$num= 7;
echo "5) ";

if  ($num %3==0){
    echo "O valor $num é divisível por 3";
} else if ($num %7==0){
    echo "O valor $num é divisível por 7";
}
?>