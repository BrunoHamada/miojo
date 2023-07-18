<?php
class DbConfig
{
    private $_host = 'localhost';
    private $_username = 'root';
    private $_password = '';
    private $_database = 'poo';
    private $_port = '3306';

    protected $connection;

    public function __construct()
    {
        if (!isset($this->connection)) {

            $this->connection = new mysqli($this->_host, $this->_username, $this->_password, $this->_database, $this->_port);

            if (!$this->connection) {
                echo 'Não é possivel conectar ao servidor de banco dados';
                exit;
            }
        }
    }
}

