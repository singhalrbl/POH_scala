package com.shubham.numbers

object IncrementOrDecrement {

  def main(args:Array[String]):Unit={

    /*scala doesn't support ++ and -- as other languages
    Because val fields are immutable they can't be increment or decrement
    but var fields can be mutated with += and -= methods
    */

    var a=1
    a += 1
    a-= 1
    println(a)

    //similar methods for multiplication and division

    var i=1
    i*=2
    println(i)
    i/=2
    println(i)



  }

}
