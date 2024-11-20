<?php
/*
 * Serialize single elements and arrays 
 */
echo serialize('hello') . "\n";
echo serialize(array(1,-2,13.99,round(13.721342355),100)) . "\n";

/*
 * Serialize array of strings 
 */
$people = ['Anders','Peyton','Orion',     'Zende'];
$peeps = serialize($people);
echo $peeps . "\n";

/* 
 * Serialize associative array
 */
$values = ['dog'=>'Fido', 'cat'=>'Scratcher', 'student'=>'Alex', 'gpa'=>3.99];
$serial_map = serialize($values) . "\n";
echo $serial_map . "\n";

/*
 * Deserialize
 */
echo unserialize($peeps) . "\n";
var_dump(unserialize($peeps));
var_dump(unserialize($serial_map));
