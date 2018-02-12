package com.shubham.ControlStruture

object LoopsWithMultipleCouters {

  def main(args:Array[String]):Unit={

    println("LoopsWithMultipleCouters")
    for(i <- 1 to 2; j <- 1 to 2){
      println(s"i=$i and j=$j")
    }

    /*
    Using loops with Guards
     */
    println()
    println("Using loops with Guards")
    for( i <- 1 to 5 if i > 3) println(i)

    println()
    for{
      i <- 1 to 10
      if i > 3
      if i < 6
      if i%2==0
    }println(i)

    //print all the prime numbers
    println()
    println("print all the prime numbers")
    for( i <- 1 to 10 if i%2==0) println(i)
  }

}
