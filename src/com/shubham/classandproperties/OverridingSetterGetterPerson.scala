package com.shubham.classandproperties

/*
  overriding default accessor and mutator
 */
class OverridingSetterGetterPerson( private var _name:String) {

  def this() {
    this("no name")
  }

  def name: String = _name

  def name_(aName: String) {
    _name = aName
  }

  override def toString: String = _name

}