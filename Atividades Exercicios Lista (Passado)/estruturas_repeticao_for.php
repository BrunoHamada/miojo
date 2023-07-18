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
    'Pessoa1'=> array(
        'nome'=> 'Polliany', 
        'sexo' => 'Feminino', 
        'idade'=> 22, 

    ),
    'Pessoa2'=> array(
        'nome'=> 'Bruno',
        'sexo' => 'Masculino', 
        'idade'=> 25
    ),
    
    'Pessoa3'=> array(
        'nome'=> 'Marcos',
        'sexo'=>'Masculino', 
        'idade'=> 19,
    ),

    'Pessoa4'=> array(
        'nome'=> 'Christopher',
        'sexo'=>'Masculino', 
        'idade'=> 25
    ),

    'Pessoa5'=> array(
        'nome'=> 'Nicoly',
        'sexo'=>'Feminino', 
        'idade'=> 22,
    ),

    'Pessoa6'=> array(
        'nome'=> 'Fabio',
        'sexo'=> 'Masculino', 
        'idade'=> 19,
    ),

    'Pessoa7'=> array(
        'nome'=> 'Maria',
        'sexo'=>'Feminino', 
        'idade'=> 40,
    ),

    'Pessoa8'=> array(
        'nome'=> 'Antonio',
        'sexo'=>'Masculino', 
        'idade'=> 48
    ),

    );

/*
    'nome'=> 'Antonio','sexo'=>'Masculino', 'idade'=> 48
    'nome'=> 'Ernesto','sexo'=>'Masculino', 'idade'=> 58
    'nome'=> 'Vinicius','sexo'=>'Masculino', 'idade'=> 32
    'nome'=> 'Simone', 'sexo'=> 'Feminino', 'idade'=> 35
    'nome'=> 'Adriana', 'sexo'=> 'Feminino', 'idade'=> 40
    'nome'=> 'Pietro', 'sexo'=> 'Masculino', 'idade'=> 15
    'nome'=> 'Eliana', 'sexo'=> 'Feminino', 'idade'=> 45
    'nome'=> 'Luciano', 'sexo'=> 'Masculino', 'idade'=> 52
    'nome'=> 'Bruna', 'sexo'=> 'Feminino', 'idade'=> 24
    'nome'=> 'Osvaldo', 'sexo'=> 'Masculino', 'idade'=> 38
    'nome'=> 'Willy', 'sexo'=> 'Feminino', 'idade'=> 73
    'nome'=> 'Athena', 'sexo'=> 'Feminino', 'idade'=> 200
    'nome'=> 'Nao', 'sexo'=> 'Feminino', 'idade'=> 26    
*/

/*
for($i= 0, $lista= count($pessoas); $i <$lista; ++$i){
    $pessoas[$i]['Masculino']['idade'>21]= count($pessoas);
     if($pessoas == 'Masculino'){
        if($pessoas >21 ){
            $pessoas= count($pessoas);
            echo "$pessoas, ";
        }
     }
};*/

foreach($pessoas as $pessoas_k => $pessoas_v){
    echo "<br/>";
    echo "Exibindo dados da pessoa: $pessoas_k <br/>";

    foreach ($pessoas_v as $dados_k => $dados_v){
        echo "<br/>$dados_k = $dados_v<br/>";
    }
}


echo '</br> </br>';

echo '5) ';
?>