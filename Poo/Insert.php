<!DOCTYPE html>
<html lang="en">
<head>
    <title>Cadastrar Dados</title>
</head>

<body>
    <?php 
    //incluido o arquivo de conexão do banco de dados

    include_once("Model/Crud.php");

    $crud= new Crud();

    if(isset($_POST['Submit'])){
        $name= $crud->escape_string($_POST['nome']);
        $age= $crud->escape_string($_POST['idade']);
        $email= $crud->escape_string($_POST['email']);
        
        //se todos os campos estiverem preenchidos (não vazios)
        //inserir dados no banco de dados
        $result= $crud->execute("INSERT INTO users(name,age,email) VALUES('$name','$age','$email')");

        if($result != false){
            echo "<font color='green'>Dados adicionados com sucesso.";
        }

        //exibir mensagem de
        
        echo "<br/><a href='View/select.php'>Ver resultado</a>";
    }
    ?>
</body>

</html>