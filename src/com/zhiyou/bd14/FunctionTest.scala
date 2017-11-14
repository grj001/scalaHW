package com.zhiyou.bd14

object FunctionTest {

  def plusInt(x:Int, y:Int)= {

    println(s"调用函数plusInt, 结果值 : ${x+y}")
    x + y;
  }


  val plusIntVal:(Int,Int) => Int = (x,y) => x+y
  val plusIntVal

  def preducePlus(x:Int, y:Int)= {

    println(s"调用过程preducePlus, 结果值: ${x+y}");
    x + y
  }

  def main(args : Array[String]) :Unit = {
    val functionResult = plusInt(5,6)
    val preduceResult = preducePlus(5,6)
    println(s"functionResult:$functionResult")
    println(s"preduceResult:$preduceResult")

    println(plusIntVal)
    println(plusIntVal(5,6))
  }

}
