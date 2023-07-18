<?php 

$numero=3;
switch($numero){
    case 1;
    echo 'O valor de '.$numero.' é 1';
    break;
    case 2:
        echo 'O valor de '.$numero.' é 2';
        break;
    case 3:
    case 4:
        echo 'O valor de '.$numero.' é de 3 ou 4';
        break;
    case 5:
        echo 'O valor de '.$numero.' é 5'; // Será exibido na tela
        break;
    default:
    echo 'O valor de '.$numero.' não corresponde as condicionais anteriores';
    break;
}
echo '<br>';

$nome='Bruno';
switch($nome){
    case 'Renata':
    echo 'O valor da variavel é '.$nome;
    break;
    case 'Alexandro':
        echo ' O valor da variavel é '.$nome;
        break;
    case 'Bruno':
        echo 'O valor da variavel é '.$nome;// sera exiido na tela
        break;
    default:
    echo 'O valor da variavel '.$nome.' não correponde as condições anteriores.';
        break;
}
# comparando o uso de caso e if 
echo'<br>';
if ($numero==1){
    echo 'O valor é '.$numero;
}else if ($numero==2){
    echo 'O valor é '.$numero;
}else if ($numero ==3 || $numero==4){
    echo 'O valor pode ser 3 ou 4'.$numero;
}else if ($numero==5){
    echo 'O valor da variavel '.$numero.' não corresponde aos condicionais.';
}
?>