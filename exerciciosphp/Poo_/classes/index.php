<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar Dados</title>
<!-- <script type="text/javascript"> 
    function validate() {
        if(document.form1.name.value == ''){ 
        alert('Forneça seu nome');
        document.form1.email.focus();
        return false;
    }
    if (document.form1.email.value == ''){
        alert('Forneça seu e-mail');
        document.form1.emai.focus();
        return false;
    }
    return true;
    }
    </script> --> 

</head>

<body>
    <!--<a href="idex.php">Home</a>-->
    <br/><br/>
    <div id="msg"></div>
    <!--<form action="add.php" method="post" name="form1" onsubit = "return(validate());">-->
    <form action="add.php" method="post" name="form1">
        <center>
            <h1>Formulário - Incluir registro</h1>
        </center>
        <table width="588" border="0" align="center">
            <tr>
                <td width="118">
                    <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Nome completo:</font>
                </td>
                <td width="460">
                <input name="nome" type="text" class="formbutton" id="nome" size="52" maxlength="150">
            </td>
            </tr>
            
        <tr> 
            <td>
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">Idade:</font>
            </td>
            <td>
                <font size="2">
                    <input name="idade" type="text" class="formbutton" id="idade" size="05" maxlength="150">
                </font>
            </td>
        </tr>
            
            <tr> 
            <td> 
                <font size="1" face="Verdana, Arial, Helvetica, sans-serif">E-mail:</font>
            </td>
            <td> 
                <font size="2">
                    <input name="email" type="email" class="formbutton" id="email">
            </font>
        </td>
        </tr>

        <tr>
            <td></td>
                <td><input type="submit" name="submit" value="Cadastrar">
                <button type="submit" formaction="index.php">Consultar</button>
                
            </td>
        </tr>
        </table>
    </form>
</body>

</html>

