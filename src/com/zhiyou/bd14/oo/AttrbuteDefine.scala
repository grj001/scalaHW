package com.zhiyou.bd14.oo


class AttributeDefine(var attr1:String
                      , var attr2:Int
                      , val valAttr:String
                     , private var privateAttr:String) {

  var embodyAttr:String = ""


}

object AttributeDefineObj{

  def main(args: Array[String]): Unit = {
    val a = new AttributeDefine("attr1_value", 100, "常量", "私有成员")
    println(s"attr1属性: ${a.attr1}")
    println(s"attr2属性: ${a.attr2}")
    println(s"valAttr: ${a.valAttr}")

    //私有成员不允许外部访问
//    println(s"privateAttr: ${a.privateAttr}")

    a.embodyAttr = "内部声明的变量"
    println(s"embodyAttr: ${a.embodyAttr}")
  }

}