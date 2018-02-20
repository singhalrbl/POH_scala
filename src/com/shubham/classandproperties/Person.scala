package com.shubham.classandproperties

/*
var fields example
 */

class Person(var firstName:String, var lastName:String) {

  println("Constructor begins")
  //some class fields
  private val HOME = System.getProperty("user.name")
  var age = 28

  //some Methods
  override def toString: String = s"$firstName $lastName and age is $age"
  def printHome():Unit = println(s"HOME=$HOME" )

  def printFullName() {println(this)}

  printHome()
  printFullName()

  println("still in constructor")
}
