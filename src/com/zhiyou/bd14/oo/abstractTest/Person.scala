package com.zhiyou.bd14.oo.abstractTest

abstract class Person(var name:String) {
  println("Persont的构造方法被调用")
  var ptype:String
//  var name:String = ""

  //
  def printlnMethod() = {

    println(s"ptyep: $ptype, name: $name")
  }

  def work(): Unit
}






class Student1(name:String) extends Person("学生姓名") {
  println("Student的构造方法被调用")
  override var ptype: String = "学生类型"

  override def work(): Unit = {
    println("学生工作是上课")
  }
}





//Teacher
class Teacher(name:String) extends Person("教师姓名") {
  println("Teacher的构造方法被调用")
  override var ptype: String = "教师类型"

  override def work(): Unit = {
    println("教师工作是授课")
  }
}





object PersonTest{
  def main(args: Array[String]): Unit = {
//    var person = new Person()
    val student1 = new Student1("小张")
    val teacher = new Teacher("李老师")

    student1.printlnMethod()
    teacher.printlnMethod()
    student1.work()
    teacher.work()
  }
}



