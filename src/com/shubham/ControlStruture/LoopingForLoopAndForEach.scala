package com.shubham.ControlStruture

object LoopingForLoopAndForEach {

  def main(args:Array[String]):Unit={

    //use of "for" loop for a list
    val languages = List("Java","Scala","F#")
    for(lang <- languages)
      println(lang)

    //Use of "for-to" loop to iterate over a range of numbers
    for(i:Int<- 1 to 5)
      println(i)

    /*
    With for-loop we can also use until keyword.
    To and Until are the methods that return an enumeration
    of numbers Until() stops one number before the final number
     */

    for(i:Int <- 100 until 105){
      println(i)
    }

    /* we can directly loop over the numbers in a range
    The first argument to the range is the start , the second is the exclusive
    end.The third optional argument is the step
     */

    //Loop over number in range
      for ( i:Int <- Range(5,8)){
        println(i)
      }
    //Loop over a step of 2
    for (i <- Range(0,5,2)){
      println(i)
    }

    //A decrement for-loop ..step is negative 1
    for( i <- Range(10,5,-1)){
      println(i)
    }




  }

}
