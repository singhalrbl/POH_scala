package com.shubham.strings

object StringEquality {

  def main(args:Array[String]):Unit={

    //String equality in scala
    println("String equality in scala")
    val s1 = "Hello"
    val s2 ="Hello"
    val s3 ="H"+"ello"
    println(s1==s2)
    println(s1==s3)

    println()
    //== method doesn't throw a null pointer exception
    println("== method doesn't throw a null pointer exception")
    val s4 :String =null
    println(s4==s3)

    println()
    //comparing string in case sensitive manner
    println("comparing string in case sensitive manner")
    println(s1.toUpperCase()==s2.toUpperCase())

    println()
    //null string can throw null pointer exception
    println("null string can throw null pointer exception")
    val s5:String=null
    val s6:String=null
   // println(s5.toUpperCase()==s6.toUpperCase())

    println()
    //Using equalIgnoreCase in scala
    println("Using equalIgnoreCase in scala")
    val a="Marisa"
    val b="marisa"
    println(a.equalsIgnoreCase(b))






  }


}
