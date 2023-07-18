<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rock PHP</title>

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
            $informacoes= 5;// quantidade de info. Neste caso tem 4: nome, email, data e mensagem
            $conjunto= $informacoes * ($_GET['codigo'] -1);// calculo para descobrir o conjunto no qual o usuário se refere

            $nome_banda= $lista[$conjunto];
            $Genero_Banda= $lista[$conjunto +1];
            $Musica= $lista[$conjunto +2];
            $data_album= $lista[$conjunto +3];
            $Conte_mais= str_replace("<br>", "\n", $lista[$conjunto +4]);// desfaz o multiline pra ficar bonitin o campo?

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
            <label for="codigo">Nome da Banda:</label>
        </td>
        <td>
            <input type="text" id="nome_banda" name="nome_banda" placeholder="<?php echo $nome_banda;?>" value="<?php echo $nome_banda; ?>" required><br>
        </td>
    </tr>

    <tr>
        <td>
            <label for="Genero_Banda">Genero da Banda:</label>
        </td>
        <td>
            <input type="text" id="Genero_Banda" name="Genero_Banda" placeholder="<?php echo $Genero_Banda;?>" value="<?php echo $Genero_Banda; ?>" required><br>
        </td>
    </tr>

    <tr>
        <td>
            <label for="Musica">Música preferida:</label>
        </td>
        <td>
            <input type="text" name="Musica" type="date" id="Musica" placeholder="<?php echo $Musica;?>" value="<?php echo $Musica; ?>" required><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="data_album">Data do Álbum:</label>
        </td>
        <td>
            <input type="date" name="data_album" id="data_album" placeholder="<?php echo $data_album;?>" value="<?php echo $data_album; ?>" required><br>
        </td>
    </tr>
    <tr>
        <td>
            <label for="Conte_mais">mais sobre a Banda:</label>
        </td>
        <td>
            <textarea type="text" name="Conte mais" id="Conte mais" cols="40" rows="10"><?php echo $Conte_mais; ?></textarea><br>
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



