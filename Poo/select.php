<?php
include_once("Model/Crud.php");

$crud = new Crud();

$query = "SELECT * FROM users ORDER BY id";
$result = $crud->getData($query);
?>

<html>

<head>

    <title>Homepage</title>
</head>

<body>
    <center>
        <h1>Consultar dados Cadastrados</h1>
    </center>
    <a href="index.php" size="1" style="font-family: Verdana, Arial, Helvetica, sans-serif;">Adicionar novos dados</a><br /><br />

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
                <font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Acoes</strong></font>
            </td>
        </tr>
        <?php
        if (is_array($result)) {
            foreach ($result as $key => $res) {
                echo "<tr>";

                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $res['id'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $res['name'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $res['age'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''>" . $res['email'] . "</td>";
                echo "<td size='1' style='font-family: Verdana, Arial, Helvetica, sans-serif;''><a href=\"montar.php?id=$res[id]\">Editar</a> | <a href=\"delete.php?id=$res[id]\" onClick=\"return confirm('Tem certeza de que deseja excluir?')\">Deletar | <a href=\"add.html\">Adicionar</a></a></a></td>";
            }
        } else {
            echo "<tr><td colspan='4'>Nenhum registro foi encontrado.</td></tr>";
        }
        ?>
    </table>
</body>

</html>