package com.zhiyou.bd14

object ArrayTest {

  def main(args: Array[String]): Unit ={

    val array = Array(1,2,3,4,5)

    println(array(0))

    //数组的元素是可变的
    array(0) = 100
    println(array.mkString(","))

    //数组的遍历

  }


}
