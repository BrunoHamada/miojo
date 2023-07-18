<?php

for ($i=0; $i<10; $i++){

    if($i==4||$i==6){
        echo "$i </br>";
    continue;
    }
    
    if($i==8){
        echo "$i </br>";
    break;
    }

    echo $i.' </br>';
}
echo 'Final';
?>