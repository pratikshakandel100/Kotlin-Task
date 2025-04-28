package com.pratiksha.firstapp

fun main() {
    var num1: Double = 10.6
    var num2: Double = 15.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    var x: Int = 20
    var y: Int = 30
    var z: Int = 0
    z = x + y
    println("z = x + y = $z")
    z -= x
    println("z -= x = $z")

    var a: Int = 20
    var b: Int = 10
    println("a == b :" + (a == b))
    println("a <= b:" + (a <= b))


}