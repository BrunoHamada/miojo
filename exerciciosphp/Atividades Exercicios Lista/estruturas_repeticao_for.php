<?php 
echo '1) ';
for ($i=1; $i<101; $i++){
    echo $i.', ';
}
echo 'FIM';
echo '</br> </br>';

echo '2) ';

for ($i=100; $i>1; $i--){

    if($i %2 != 0){
        $i--;
        echo $i.', ';
    } 
    
}
echo '1,';
echo ' FIM';
echo '</br> </br>';

echo '3) ';
for ($i=5; $i<505; $i++){

    if($i %5 == 0){
        echo $i.', ';
    } 
}
echo ' FIM';
echo '</br> </br>';

echo '4) ';


$pessoas= array(
    array(
        $nome = 'Polliany', $sexo = 'Feminino', $idade = 22
    ),

    array(
        $nome = 'Bruno', $sexo = 'Masculino', $idade = 25
    ),
    
    array(
        $nome= 'Marcos', $sexo='Masculino', $idade= 19
    ),

    array(
        $nome= 'Christopher', $sexo= 'Masculino', $idade = 25
    ),

    array(
        $nome = 'Nicoly', $sexo = 'Feminino', $idade = 22
    ),

    array(
        $nome = 'Fabio', $sexo = 'Masculino', $idade = 19
    ),

    array(
        $nome = 'Maria',$sexo = 'Feminino', $idade = 40
    ),

    array(
        $nome = 'Antonio', $sexo = 'Masculino', $idade = 48
    ),

    array(
         $nome ='Ernesto',$sexo ='Masculino', $idade = 58
    ),

    array(
         $nome ='Vinicius', $sexo ='Masculino', $idade = 32
    ),

    array(
           $nome = 'Simone', $sexo = 'Feminino', $idade = 35
    ),

    array(
     $nome => 'Adriana', $sexo = 'Feminino', $idade = 40   
    ),

    array(
     $nome = 'Pietro', $sexo = 'Masculino', $idade = 15   
    ),

    array(
     $nome = 'Eliana', $sexo = 'Feminino', $idade = 45   
    ),

    array(
     $nome = 'Luciano', $sexo = 'Masculino', $idade = 52   
    ),

    array(
     $nome = 'Bruna', $sexo = 'Feminino', $idade = 24   
    ),

    array(
     $nome = 'Osvaldo', $sexo = 'Masculino', $idade = 38   
    ),

    array(
     $nome = 'Willy', $sexo = 'Feminino', $idade = 73   
    ),

    array(
     $nome = 'Athena', $sexo = 'Feminino', $idade = 200   
    ),

     array(
     $nome = 'Nao', $sexo = 'Feminino', $idade = 26   
    )
);


for($i = 0; $i < count($pessoas); $i++){

    list($nome, $genero, $idade) = $pessoas[$i];
    if($genero == 'Masculino'){
        if ($idade > 21) {
            echo "Nome: " . $nome . " <br> \nGênero: " . $genero . " <br> \nIdade: " . $idade . "<br><br>";
        }
    }
};


?>