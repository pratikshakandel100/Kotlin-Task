package com.pratiksha.firstapp


fun main(){
var Collage = "Softwarica";
//Immuable
val Location = "Ganeshwor";
var TotalStudent: Int = 500;
var Batch : String = "36B";
var isGOod: Boolean = true;
val Students: String = "GOod";

var Studentss: String = "TalentedStudent";
println(Students.lowercase())
    println(Students.uppercase())
// Array
    var fruits = arrayOf("Apple", "Mango", "Orange", "Papaya");
    println("The first element of Fruits is " + fruits[0]);
    fruits[1] = "Papaya"
    println("The first element of Fruit is " + fruits[1]);
    println(fruits.size);
    var flower = ArrayList<String>();
    flower.add("Lily");
    flower.add("Rose");
    println(flower);

    var number = arrayListOf<Int>(1,2,3,4,5);
    println(number);
    number.add(4,6);
    number.add(0,10);
    println(number);
    number.removeAt(0);
    number.remove(3);
    println(number);
    //Mixed Array
    var mixArray = arrayListOf<Any>("hello", 5,9.0, true);
    println(mixArray);
    println(mixArray[3]);






}