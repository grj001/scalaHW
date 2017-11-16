package com.zhiyou.bd14.oo

class ConstructorWithDefault(var attr1:String
                             , var attr2:String = "defaultATTR2"
                            , var attr3:Int = 3) {

  // 方法定义与默认时是不能自动判断类型的
  override def toString() ={
    s"attr1: ${attr1}, attr2: ${attr2}, attr3: ${attr3}"
  }



}
object ConstructorWithDefaultObj {

  def main(args: Array[String]): Unit = {
    val c1 = new ConstructorWithDefault("c1参数")
    println(c1)
    val c2 = new ConstructorWithDefault("c1参数", "c2参数")
    println(c2)
    val c3 = new ConstructorWithDefault("c1参数", "c2参数", 3)
    println(c3)
    val c4 = new ConstructorWithDefault("c1参数", attr3 = 123)
    println(c4)
  }
}