package com.shubham.strings

object SplittingStrings {

  def main(args:Array[String]):Unit={

    //splitting string
    val splitString:String="Hello world"
   println(splitString.split(" "))

    //splitting as an array
    println(splitString.split(" ").foreach(println))

    //splitting with String
    println("hello World".split(" "))

    //splitting with char
    println("hello World".split(' '))
  }

}
