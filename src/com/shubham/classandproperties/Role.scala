package com.shubham.classandproperties

/*
  private fields with val or var
 */
class Role(private var roleName:String) {

  override def toString: String = roleName.toString

}
