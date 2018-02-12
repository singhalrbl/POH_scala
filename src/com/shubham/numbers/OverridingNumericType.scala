package com.shubham.numbers

object OverridingNumericType {

  def main(args:Array[String]):Unit={

    /*
    Scala automatically assigns types to numeric
    values when you assign them
     */

    //override simple numeric type
    val doubleOverride=1d
    println(doubleOverride.getClass.toString)

    val floatOverride=1f
    println(floatOverride.getClass.toString)

    val longOverride=2d
    println(longOverride.getClass.toString)

    //Type ascription or scala another approach to annotate with the type
    val byteVariable=0:Byte
    println(byteVariable.getClass.toString)

    val intVariable =0:Int
    println(intVariable.getClass.toString)

    val shortVariable=0:Short
    println(shortVariable.getClass.toString)

    val doubleVariable=0:Double
    println(doubleVariable.getClass.toString)

    val floatVariable=0:Float
    println(floatVariable.getClass.toString)



  }

}
