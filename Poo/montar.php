<?php 

include_once("Model/Crud.php");

$crud= new Crud();


$id= $crud->escape_string($_GET['id']);


$result= $crud->getData("SELECT * FROM users WHERE id=$id");

foreach($result as $res){
    $id= $res['id'];
    $name= $res['name'];
    $age= $res['age'];
    $email= $res['email'];
}
?>

<html>

<head>
    <title>Editar dados</title>
</head>
<body>

    <br /><br />
    <center>
        <h1>Editar dados Cadastrados</h1>
    </center>
    <form name="form1" method="post" action="update.php">
        <table width="588" border="0" align="center">
            <tr>
                <td width="50">
                    <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Codigo:</font>
                </td>
                <td width="100"><input type="text" name="id" style="background-color: grey;" placeholder="<?php echo $id; ?>" class="formbutton" readonly="<?php echo $id; ?>"></td>

                <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Nome:</font>
                </td>
                <input type="text" name="nome" size="52" maxlength="150" class="formbutton" value="<?php echo $name; ?>"></td>

                <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Idade:</font>
                </td>
                <input type="text" name="idade" size="05" maxlength="150" class="formbutton" value="<?php echo $age; ?>"></td>
                </td>

                <font size="1" face="Verdana, Arial, Helvetica,sans-serif">Email:</font>
                </td>
                <input type="text" name="email" size="52" maxlength="150" class="formbutton" value="<?php echo $email; ?>"></td>
            </tr> 
            <tr>
                <td><input type="hidden" name="id" value="<?php echo $_GET['id']; ?>"></td>
                <td><input type="submit" name="update" value="Atualizar">
                    <button type="submit" formaction="update.php">Consultar</button>
                    </td>
            </tr>
        </table>
    </form>    
</body>

</html>