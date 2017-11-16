package com.zhiyou.bd14.oo.abstractTest

class ExtendedClass extends HBaseAction {

  //通过继承ExtendedClass已经具有保存数据到hbase的功能
  def displayData() = {
    println("展示数据到控制台上")
  }


}

trait OperPersistent{
  def saveData()
}




class ExtendedClassCompose(val hBaseAction: OperPersistent){
  //通过组合的方式把想具有更能的类型实例化成一个对象
  // 通过这个对象调用保存数据到hbase的功能
//  val hbaseAction = new HBaseAction()
  def display() = {
    println("展示数据到Dashboard上")
  }
  def saveDateToHBase() = {
    hBaseAction.saveData()
  }
}



object ExtendedClassTest{
  def main(args: Array[String]): Unit = {
    val ec = new ExtendedClass()
    ec.saveData()
    ec.displayData()

    val ecc = new ExtendedClassCompose()
    ecc.saveDateToHBase()
    ecc.display()
  }
}