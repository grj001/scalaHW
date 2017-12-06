package com.zhiyou.bd14.function

object RegressTest {


  //定义一个函数, 接受两个参数, 一个是x, 一个年返回x的n次方
  def nMultiply(x: Int, n: Int): Unit = {
    var y = x
    for(i <- 1 until n){
      y = y*x
    }
  }

  def main(args: Array[String]): Unit = {
    println(nMultiply(5,3))
  }

    //上述需求从list的尾部开始计算
  // map("zhang gei"->50, "zhang liao"->80, "liu bei"->90, "guan yu"->100)
  //姓张的人员的战斗力总和
  // 使用递归函数的方式来实现
  val sanGuoMap = Map("zhang gei"->50
    , "zhang liao"->80
    , "liu bei"->90
    , "guan yu"->100)



}
