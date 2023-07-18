<?php

for ($i=0; $i<10; $i++){

    if($i==4||$i==6){
    continue;
    }
    
    if($i==8){
        break;
    }

    echo $i.' </br>';
}
echo 'Final';
?>