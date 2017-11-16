package com.zhiyou.bd14.oo

class ConstructorTest(pattr1:String, pattr2:String) {


  //没有使用任何构造方法, 就是用默认构造方法
  //属性1
  var attr1 = pattr1
  //属性2
  var attr2 = pattr2

//  public constructirTest(String attr1, int attr2){
//    this.attr1 = attr1
//    this.attr2 = attr2
//  }


  //副构造方法
  def this() = {
    this("","") //zhi接调用住构造方法
    println("执行了副构造方法")
    this.attr2 = "副构造方法内的副值"
  }


  def this(pattr1:String) = {
    this()    //没有调用住构造方法, 通过调用别的构造方法,间接的调用主构造方法
    println("执行了副构造方法二")
    this.attr1 = pattr1
  }
}

object ConstructorTestOb{

  def main(args: Array[String]): Unit = {
    val c1 = new ConstructorTest("aaa", "123")
    println(s"c1.attr1: ${c1.attr1}, c1.attr2: ${c1.attr2} ")
    val c2 = new ConstructorTest()
    println(s"c2.attr1: ${c2.attr1}, c2.attr2: ${c2.attr2}")
  }
}