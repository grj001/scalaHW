package com.zhiyou.bd14.oo

object ObjectTest {
  var varAttr1 = ""
  private var varAttr2:String = ""
  val valAttr1 = "常量1"

  def method1() ={
    println("执行方法method1")
  }

  private def method2() ={
    println("执行方法method2")
  }


  def main(args: Array[String]): Unit = {
    ObjectTest.varAttr1 = "给丹利对象属性赋值"
    ObjectTest.varAttr2 = "给丹利对象的私有属性复赋值"
    //倡廉属性不可被重新赋值
//    ObjectTest.valAttr1 = "123"

    println(s"ObjectTest单例对象: varAttr1: ${ObjectTest.varAttr1}, valAttr1: ${ObjectTest.valAttr1}" +
      s", private varAttr2: ${ObjectTest.varAttr2}")
    ObjectTest.method1()
    ObjectTest.method2()
  }

}

object ObjectTestExists{
  def main(args: Array[String]): Unit = {
    ObjectTest.valAttr1
  }
}