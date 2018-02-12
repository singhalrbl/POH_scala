package com.shubham.ControlStruture

object LoopingForLoopAndForEach {

  def main(args:Array[String]):Unit={

    //use of "for" loop for a list
    val languages = List("Java","Scala","F#")
    for(lang <- languages)
      println(lang)

    println()
    println("for loop for array")
    val a= Array("apple","banana","oranges")
    for(e <- a) println(e)

    println()
    println("for loop for multiple lines")
    for(e <- a){
      println(e.toUpperCase())
    }

    //Use of for-yield loop to return new collection
    println("Use of for-yield loop to return new collection")
    val newArray = for (e <- a) yield  e.toUpperCase
    println(newArray.toString)

    //Use of "for-to" loop to iterate over a range of numbers
    for(i:Int<- 1 to 5)
      println(i)

    for( i <- 1 to 10 if i> 4) println(i)

    /*
    With for-loop we can also use until keyword.
    To and Until are the methods that return an enumeration
    of numbers Until() stops one number before the final number
     */

    for(i:Int <- 100 until 105){
      println(i)
    }

    for(j <- 0 until a.length) {
      println(s"$j is ${a(j)}")
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

    //While loop continues until the condition is not true
    var i=3
    while(i>=0){
      println(i)
      i-=1
    }

    /*
    do-while loop is similar to while loop but
    first iteration is entered
    without checking a condition ,instead condition
    is checked after each iteration
     */
    println("do while loops")
    var j=1
    do{
      println(j)
      j+=1
    }while(j>=5)



  }

}
