package com.example.firstkotlinprogram

fun main(args: Array<String>) {

    // immutable collection
    var age = mapOf<String,Int>("david" to 20, "ronaldo" to 25)

    println("----------------immutable map of")
    println("age of david : " + age["david"])
    println("age of ronaldo : " + age["ronaldo"])

    // mutable collection
    var mutableAge = mutableMapOf<String,Int>("david" to 20, "ronaldo" to 25)

    mutableAge.put("buffon", 30)

    println("----------------mutable map of")
    println("age of david : " + age["david"])
    println("age of ronaldo : " + age["ronaldo"])
    println("age of buffon : " + mutableAge.get("buffon"))






}