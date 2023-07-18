<html>

<head>
    <title>Editar Usuário</title>
</head>
<body>
    <?php 
    include_once '../Controller/ControllerUser.php';

    if(isset($_GET['id'])){
        $id = $_GET['id'];

        $userController = new ControllerUser();
        $user = $userController->getUserById($id);

        if(!$user){
            echo 'Usuário não encontrado';
            exit;
        }

        if(isset($_POST['Submit'])){
            $name = $_POST['nome'];
            $age = $_POST['idade'];
            $email = $_POST['email'];

            $userController->updateUser($id, $name, $age, $email);
        }
    } else {
        echo 'ID de usuário não fornecido';
        exit;
    }
    ?>

    <form name="form1" method="post" action="">
        <table border="0">
            <tr>
                <td>Nome</td>
                <td><input type="text" name="nome" value="<?php echo $user['name']; ?>"></td>
            </tr>

            <tr>
                <td>Idade</td>
                <td><input type="text" name="idade" value="<?php echo $user['age']; ?>"></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="<?php echo $user['email']; ?>"></td>
            </tr>
                <td><input type="Submit" name="Submit" value="Atualizar"></td>
                <td><button type="Submit" name="Submit" formaction="../View/view-users.php">Voltar</button></td>

        </table>
    </form>    
</body>

</html>