<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar Dados</title>
    
</head>

<body>
    <?php 
    include_once '../Controller/ControllerUser.php';
    $userController = new ControllerUser();
    
    if(isset($_POST['Submit'])){
        $userController->addUser();
    }
    ?>
    
    
    <form action="" method="post" name="form1">
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
                <td><input type="Submit" name="Submit" value="Cadastrar">
                    <button type="Submit" formaction="view-users.php">Consultar</button>

                </td>
            </tr>
        </table>
    </form>
</body>

</html>