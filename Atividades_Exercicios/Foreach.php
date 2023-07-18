<?php 

$array=[1,3,5,4,6,8];
foreach($array as $item){
    echo $item.' '.'<br>';
}
echo'<br>';

$nomes=['A','B','C','D','E'];
foreach ($nomes as $nome){
    echo $nome.' '.'<br>';
}
echo '<br>';

$dados=[
    'Nome' => 'Bruno',
    'Sobrenome' => 'Hamada',
    'Idade' => 1000
];
foreach($dados as $chave=>$valor){
    echo $chave.': '.$valor.'<br>';
}
echo '<br>';

?>