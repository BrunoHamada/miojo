<?php 
 $banco="banco.txt";
 if(isset($_POST['codigo'])){
     if(file_exists($banco) && !empty(file_get_contents($banco))){
         $lista= explode("\n",file_get_contents($banco));
         $informacoes= 4;// quantidade de informações. Neste caso tem 4: nome, email, data, e mensagem
         $conjunto= $informacoes*($_POST['codigo']-1);// cáculo para descobrir o conjunto no qual o usuário se refere

         $lista[$conjunto]= $_POST['nome'];
         $lista[$conjunto+1]= $_POST['email'];
         $lista[$conjunto+2]= $_POST['data'];
         $lista[$conjunto+3]= str_replace("\n","<br>",$_POST["mensagem"]);

         for($i = 0; $i < count($lista)-1; $i++){ $texto .= $lista[$i]. "\n";}// juntando todos os elementos que não foram apagados na variavel $texto

         unlink($banco);
         $criar= fopen($banco, "a+");
         fwrite($criar, $texto);
         fclose($criar);
     }
 }
 header('Location: /crudtxt/select.php#'.$_POST['codigo']);
