<?php 
//Comandos de repetição

for ($i=0; $i<=10;$i++){
    echo $i.'</br>';
}

echo "</br>";

/* exemplo 2 */
for ($i=0; ; $i++){
    if($i >10){
        break; # quebrar a sequência ou romper a rotina da estrutura de repetição. 
    }
    echo $i.'</br>';
}
echo "</br>";
/* exemplo 3 */

$i=0;
for(; ; ){
    if($i>10){
        break;# quebrar a sequência ou romper a rotina da estrutura de repetição.
    }
    echo $i.'</br/';
    $i++;
}
/* exemplo 4 */
# a variável $i é somatório do laço $j é o limitador do laço
echo "</br>";

for($i=1, $j=0;$j<=10;$j+=$i, print$i."</br>", $i++);

echo "</br>";

# Comandos de repetição condicional
/* exemplo 5 */

for ($i=0; $i <= 5; $i++){
    if($i==3){
        echo "Mensagem exibida se $i for igual a 3 </br>";
    }
    if($i == 5){
        echo "Mensagem exíbida se $i for igual a 5 </br>";
    }
}

echo "</br>";
/* exemplo 6 */
# Estrutura de repetição for com array
$nomes = ['A','B','C','D','E','F','G','H'];

for ($i=0; $i <= 5; $i++){
    echo $nomes[$i].'</br>';
}
?>