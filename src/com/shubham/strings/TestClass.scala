package com.shubham.strings

object TestClass {

  def main(args:Array[String]):Unit={

    //to get className
    println("to get className")
    println("Hello World".getClass.getName)

    //length of the String
    println()
    println("length of the String")
    val s = "Hello World"
    println(s.length)

    //Concatenate the String
    println()
    println("Concatenate the String")
    val concatString="Hello "+"world"
    println(concatString)

    //iterate over every character in the string
    println()
    println("iterate over every character in the string")
    "hello".foreach(println)

    //string as sequence of character
    println()
    println("string as sequence of character")
    for(c <-"hello")println(c)

    //sequence of bytes
    println()
    println("sequence of bytes")
    s.getBytes().foreach(println)












  }

}
