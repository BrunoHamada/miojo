<?php 

include_once("Model/Crud.php");

$crud= new Crud();

if(isset($_POST['update'])){
    $id= $crud->escape_string($_POST['id']);
    $name= $crud->escape_string($_POST['nome']);
    $age= $crud->escape_string($_POST['idade']);
    $email= $crud->escape_string($_POST['email']);
   
    $result= $crud->execute("UPDATE users SET nome='$name', idade='$age', email='$email' WHERE id=$id");

    header("Location: index.php");
}
?>