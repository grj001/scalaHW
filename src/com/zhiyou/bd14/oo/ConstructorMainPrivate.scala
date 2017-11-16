package com.zhiyou.bd14.oo

class ConstructorMainPrivate private(var attr1: String, var attr2: String) {

  override def toString: String = s"attr1: $attr1, attr2: $attr2"

  def this() {
    this("", "")
    println("已使用共有的辅助构造方法来构建对象")
  }
}

object ConstructorMainPrivateObj {
  def main(args: Array[String]): Unit = {
    val c1 = new ConstructorMainPrivate()
    c1.attr1 = "属性1"
    c1.attr2 = "属性2"
    println(c1)
  }
}