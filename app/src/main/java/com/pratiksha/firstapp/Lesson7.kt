package com.pratiksha.firstapp

fun main() {
    println("Happy Coding");
    //immutable
    val age = 18;

    //mutable
    var name = "sandis";
    name = "Unisha";

    var namee : String = "Unisha";
    var agee: Int = 21;

    println("Hello I am $name and my age is $age")
    print("Hello I am ${name.lowercase()}.")

    var number = arrayOf(10,20,40,50);
    var Female = arrayListOf<String>("Ram", "Shyam", "Hari");
    Female.add("Unique");
    Female.removeAt(2);
    var Fruits = arrayListOf<Any>("Orange", 10, 13, 10.5);

    //map
    var mapp = mapOf(
        "Unisha" to "She is a great Student",
        "Sristika" to "She is honest Student",
    )
    println(mapp["apple"]);

//until -- less than
//downto
//.. ---less than equal to




}