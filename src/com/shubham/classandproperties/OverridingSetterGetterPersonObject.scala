package com.shubham.classandproperties

object OverridingSetterGetterPersonObject {

  def main(args:Array[String]):Unit={

      val p =new OverridingSetterGetterPerson()
      p.name_("shubham singhal")
     //getter method
      println(p.name)
    //setter method
     p.name_("sudeeksha singhal")
    println(p.toString)

  }

}
