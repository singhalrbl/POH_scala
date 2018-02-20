package com.shubham.classandproperties

/*
  val fields example
 */


class Employee(val name:String,val empId:Int) {

  override def toString: String = name.toString

  /*
    one do not need to write these as getter method as
    scala generate them in source code
    scala will not generate setter fields for this class
    as fields here are val which is final in java sense
   */

 /* def getEmployeeId:Int=empId
  def getEmployeeName:String=name*/


}
