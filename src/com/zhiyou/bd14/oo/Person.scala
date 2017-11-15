package com.zhiyou.bd14.oo

import java.util.Date

class Person {

  val personType = "人类型"

  //buxie权限修饰符就是public, scala会自动给我们生成get, set方法

  //Scala的面向对象
  var id:Int = 0
  var name:String = ""
  var age:Int = 0

  //添加修饰符的话
  private var salary:Double = 0.0

  println(s"-----------person类的代码块被执行------------${new Date()}")

  def getSalary() = {
    salary
  }
  def setSalary(salary:Double) = {
    this.salary = salary
  }

  def printPerson(): Unit ={

    println(s"$id, $name, $age")
  }




}
