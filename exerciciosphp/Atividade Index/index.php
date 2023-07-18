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
<title>Document</title>

</head>
<body>
    <form action="create.php" method="post"> 
        <table width="588" border="0" align="center">
            <tr>
                <td width="118">
                    <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Nome completo:</font>
                </td>
                <td width=460>
                <input name="nome" type="text" class="formbutton" id="nome" size="52" maxlength="150"></td>
            </tr>
            
            <tr>
            <td width="118"> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">email:</font>
            </td>
            
            <td width="460"> 
                    <input name="email" type="email" class="formbutton" id="nome" size="40" maxlength="150">
                </td>
            </tr>
            <td width="118"> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">data:</font>
            </td>

            <td width="460"> 
                    <input name="data" type="date" class="formbutton" id="nome" size="40" maxlength="150">
                </td>
            <tr> 

            </tr>

            <tr> 
                <td> 
                    <font size"1" face="Verdana, Arial, Helvetica, sans-serif">Mensagem:</font>
                </td>
                <td rowspan="2">
                    <font size="2">
                        <textarea name="mensagem" cols="50" rows="8" class="formbutton" id="mensagem" input></textarea>
                    </font>
                </td>
            </tr>
            <tr>
            <tr>
                <td height="22"></td>
                <td> 
                    <input name="Submit" type="submit" class="forobjects" value="Cadastrar">
                    <input name="Reset" type="reset" class="formobjects" value="Limpar campos">
                    <button type="submit" formaction="#">Cadastrar</button>
                    <button type="submit" formaction="#">selecionar</button>
                    <button type="submit" formaction="#">limpar banco</button>
                    <button type="submit" formaction="#">resetar banco</button>
                </td>
        </table>

    </form>

</body>
</html>