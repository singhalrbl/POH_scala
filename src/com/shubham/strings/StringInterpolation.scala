package com.shubham.strings

object StringInterpolation {

  def main(args:Array[String]):Unit={

    //string interpolation with letter s
    val name:String="Shubham"
    val age:Int =28
    val weight:Int=74

    println(s"$name is $age years old, and weighs $weight kgs")

    //using expression in string literals ${}
    println(s"Age next year :${age+1}")

    println(s"you are 28 years old : ${age==28}")

    //substituting string interpolation


  }

}
