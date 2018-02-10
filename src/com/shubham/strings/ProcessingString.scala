package com.shubham.strings

object ProcessingString {
  def main(args:Array[String]):Unit={
    //processing string one charter at at time
    val upper: Unit ="shubham singhal".foreach(c=> println(c.toUpper))


    val lower ="SHUBHAM SINGHAL".map(c=> c.toLower)
    println(lower)

  }



}
