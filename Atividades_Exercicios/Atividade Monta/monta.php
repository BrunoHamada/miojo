<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Site PHP</title>

    <style>
        table, tr, td {
            border: 1px solid black;
        }
    </style>
</head>

<body>
    <?php 
    $banco="banco.txt";
    if(isset($_GET['codigo'])){
        if(file_exists($banco)&& !empty(file_get_contents($banco))){
            $lista= explode("\n",file_get_contents($banco));
            $informacoes= 4;// quantidade de info. Neste caso tem 4: nome, email, data e mensagem
            $conjunto= $informacoes * ($_GET['codigo'] -1);// calculo para descobrir o conjunto no qual o usuário se refere

            $nome= $lista[$conjunto];
            $email= $lista[$conjunto +1];
            $data= $lista[$conjunto +2];
            $mensagem= str_replace("<br>", "\n", $lista[$conjunto +3]);// desfaz o multiline pra ficar bonitin o campo?

            
        }
    }
    ?>

<table>
<form method="post" action="update.php">
    
    <tr>
        <td>
            <label for="codigo">Codigo:</label>
        </td>
        <td>
            <input type="number" id="codigo" name="codigo" placeholder="<?php echo $_GET['codigo']; ?>" value="<?php echo $_GET['codigo']; ?>" style="backgorund-color: grey;" readonly><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="codigo">Nome:</label>
        </td>
        <td>
            <input type="text" id="nome" name="nome" placeholder="<?php echo $nome;?>" value="<?php echo $nome; ?>" required><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="email">Email</label>
        </td>
        <td>
            <input type="text" name="email" id="email" placeholder="<?php echo $email;?>" value="<?php echo $email; ?>" required><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="data">Data</label>
        </td>
        <td>
            <input type="text" name="data" id="data" placeholder="<?php echo $data;?>" value="<?php echo $data; ?>" required><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="mensagem">Mensagem</label>
        </td>
        <td>
            <textarea type="text" name="mensagem" id="mensagem" cols="40" rows="10"><?php echo $mensagem; ?></textarea><br>
        </td>
    </tr>
    <tr>
        <td>
            <input type="submit" value="Enviar" class="final">
        </td>
    </tr>
    
</form>
<br><br><a href="index.php">Voltar</a>
    
</table>

</body>

</html>



