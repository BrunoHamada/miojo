<!DOCTYPE html>
<html>

<head>

    <title>Visualizar Usuários</title>
</head>

<body>
    <?php 
    include_once '../Controller/ControllerUser.php';
    $userController = new ControllerUser();
    $users = $userController->viewUsers();
    ?>
    <center><h2 size="1" style="font-family: Verdana, Arial, Helvetica, sans-serif;">Usuários</h2></center>
    <center><button size="1" style="font-family: Verdana, Arial, Helvetica, sans-serif;" class="styled-button" onclick="window.location.href='add-users.php'">Adicionar Novo Usuário</button></center>
    <br />
    <br />

    <table width="80%" border="0" align="center">
        <tr bgcolor='#CCCCC'>
            <td>
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Codigo</strong></font>
            </td>

            <td>
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Nome</strong></font>
            </td>

            <td>
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Idade</strong></font>
            </td>

            <td>
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Email</strong></font>
            </td>

            <td>
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Ações</strong></font>
            </td>
        </tr>
        <?php
        foreach ($users as $user) {
                echo "<tr>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $user['id'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $user['name'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $user['age'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $user['email'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''><a href=\"edit-users.php?id={$user['id']}\" onClick=\"return confirm ('Tem certeza que deseja editar?')\">Editar</a> | <a href=\"delete-users.php?id={$user['id']}\" onClick=\"return confirm('Tem certeza de que deseja excluir?')\">Excluir</a> | <a href=\"add-users.php\">Adicionar</a></a></a></td>";
                
                echo "</tr>";
            }
        ?>
    </table>
</body>

</html>