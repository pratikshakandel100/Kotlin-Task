package com.pratiksha.firstapp.ui.theme

fun main(){
    //Immutable List
    val decimall = listOf(2.2, 3.5,5.6,2.3);
    print(decimall);
    for (i in decimall.indices){
        println(decimall[i]);
    }

    //Mutable List
    val mutableL = mutableListOf("Onion", "Tomato", "Garlic");
    mutableL.add("Potato");
    println(mutableL);

    val number = setOf(1,2,3,4,5,6);
    for(j in number){
        println(j);
    }
    val number2 = setOf(6,5,4,3,2,1);
    println("The set are equal:  ${number == number2}");

    val nameAge = mapOf(
        "Unisha" to "21",
        "Sony" to "23",
        "Sristika" to "24"
    )
    println("All keys : ${nameAge.keys}");
    println("Age of Unisha is : ${nameAge["Unisha"]}");

    //immutable map
    val price = mapOf(
        "bike" to 40000,
        "Car" to 20000000,
    )

    //mutable map
    val pricee = mapOf(
        "Bike" to 40000,
        "Car" to 20000000,
    )


}