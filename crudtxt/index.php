<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
    /*css interno*/ 
    </style>

<script> 
/* Javascript interno */
//programação 
</script>

<title>Banda de Rock</title>

</head>

<body>
    <form action="create.php" method="post"> 
        <table width="588" border="0" align="center">
            <tr>
                <td width="118">
                    <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Nome da Banda de Rock:</font>
                </td>
                <td width="480">
                <input name="nome_banda" type="text" class="formbutton" id="nome_banda" size="40" maxlength="150"></td>
            </tr>
            
            <tr>
            <td width="118"> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">Genero da Banda:</font>
            </td>
            
            <td width="480"> 
                    <input name="Genero_Banda" type="text" class="formbutton" id="Genero_Banda" size="40" maxlength="150">
                </td>
            </tr>

            <tr>
            <td width="118"> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">Música preferida:</font>
            </td>
            
            <td width="480"> 
                    <input name="Musica" type="text" class="formbutton" id="Musica" size="40" maxlength="150">
                </td>
            </tr>

            <td width="118"> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">Data do Álbum:</font>
            </td>

            <td width="480"> 
                    <input name="data_album" type="date" class="formbutton" id="data_album" size="40" maxlength="150">
                </td>
            <tr> 

            </tr>

            <tr> 
                <td> 
                    <font size="1" face="Verdana, Arial, Helvetica, sans-serif">Conte mais sobre a Banda:</font>
                </td>
                <td rowspan="2">
                    <font size="2">
                        <textarea name="Conte_mais" cols="50" rows="8" class="formbutton" id="Conte_mais" input></textarea>
                    </font>
                </td>
            </tr>
            <tr>
            <tr>
                <td height="22"></td>
                <td>     
                <input name="Submit" type="submit" class="forobjects" value="Cadastrar">
                    <input name="Reset" type="reset" class="formobjects" value="Limpar campos">
                    <button type="submit" formaction="select.php">selecionar</button>
                    <button type="submit" formaction="#">limpar banco</button>
                    <button type="submit" formaction="#">resetar banco</button>
                </td>
        </table>

    </form>

</body>
</html>