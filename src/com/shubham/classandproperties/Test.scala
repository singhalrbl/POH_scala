package com.shubham.classandproperties

object Test {

  def main(args: Array[String]): Unit = {

    /*
    Test for employee class val fields
     */
        val employee = new Employee("shubham singhal",1111)
        println(employee.name)
        println(employee.empId)
    /*
    Test for person class var fields
     */
        println()
        println("Test for employee class")
        val p =new Person("Shubham","Singhal")
        //As the field is val scala generate accessors and mutator for fields
        p.firstName="sudeeksha"
        p.lastName="singhal"
    /*

     */


  }

}
