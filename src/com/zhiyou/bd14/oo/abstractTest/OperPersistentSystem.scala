package com.zhiyou.bd14.oo.abstractTest

trait OperPersistentSystem {

  def saveData()
  def implementsMethod() = {
    println("调用了 trait实现的 implementsMethod方法")
  }

  var unInitAttr:String
  var initedAttr = "trait 的已初始化的属性"

}

trait DisplayData{
  def showData()
}


class OperPersistentSystemImpl extends OperPersistentSystem{
  override def saveData(): Unit = {
    println("保存数据到本地文件系统")
  }

  override var unInitAttr: String = "在OperPersistentSystemImpl中初始化unInitAttr属性"
}






class OperAndDisplay extends OperPersistentSystem with DisplayData{
  override def saveData(): Unit = {
    println("保存数据到本地文件系统")
  }

  override var unInitAttr: String = "OperAndDisplayData初始化OperpersistentSystem的变量"

  override def showData(): Unit = {
    println("展示数据到DishBoard")
  }
}








object OperPersistentSystemTest{
  def main(args: Array[String]): Unit = {
    val operPersistentSystem = new OperPersistentSystemImpl()
    operPersistentSystem.saveData()
    println(operPersistentSystem.initedAttr)
    println(operPersistentSystem.unInitAttr)
    operPersistentSystem.implementsMethod()

    println("-----------------------")
    val operAndDisplay = new OperAndDisplay()
    operAndDisplay.saveData()
    operAndDisplay.showData()
  }
}