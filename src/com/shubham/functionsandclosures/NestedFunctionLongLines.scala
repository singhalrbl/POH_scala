package com.shubham.functionsandclosures

import scala.io.Source
/*
    Nested Functions
 */
class NestedFunctionLongLines {

    // java style of code
      /*def processFiles(fileName:String,width:Int): Unit ={
        val source =Source.fromFile(fileName)
        for(line <- source.getLines())
          processLine(fileName,width,line)
      }
      private def processLine(fileName:String,width:Int,line:String): Unit ={
        if(line.length > width)
          println(fileName+" :"+line.trim)
      }*/

    //scala style of code for nested function
    def processFile(fileName:String,width:Int):Unit={
      def processLine(fileName:String,width:Int,line:String):Unit={
        if(line.length > width)
          println(fileName +" : "+line.trim)
      }
      val source = Source.fromFile(fileName)
      for(line <- source.getLines())
        processLine(fileName,width,line)
    }

    //example of nested function
      def max(a:Int,b:Int,c:Int): Int ={
        def max(x:Int,y:Int)= if (x > y) x else y
        max(a,max(b,c))
      }


}
