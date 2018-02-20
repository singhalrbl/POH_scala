package com.shubham.functionsandclosures

object FunctionLiterals {

  def main(args:Array[String]):Unit={

    var increase = (x:Int)=> x+1
    println(increase(2))

    // function literal block
    var increaseBlock = (x:Int)=>{
      println("we")
      println("are")
      println("here!")
      x+1
    }
    println(increaseBlock(10))

    //function literal in for each block
    val someNumbers= List(-11,-10,-5,0,5,10)

    someNumbers.foreach((x:Int)=>println(x))

    println(someNumbers.filter((x:Int) => x>5))
    //can be written as
    println(someNumbers.filter(x => x>5))




  }

}
