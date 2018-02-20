package com.shubham.classandproperties

/*
  auxiliary constructor
 */
//primary constructor
class Pizza(var crustSize :Int ,var crustType:String) {

  //one-arg auxiliary constructor
  def this(crustSize:Int){
    this(crustSize,Pizza.DEFAULT_CRUST_TYPE)
  }
  //one-arg auxiliary constructor
  def this(crustType:String){
    this(Pizza.DEFAULT_CRUST_SIZE,crustType)
  }
  //zero-arg auxiliary constructor
  def this(){
    this(Pizza.DEFAULT_CRUST_SIZE,Pizza.DEFAULT_CRUST_TYPE)
  }

}
  object Pizza{
    val DEFAULT_CRUST_TYPE="THIN"
    val DEFAULT_CRUST_SIZE=12

  }


