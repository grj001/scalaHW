package com.zhiyou.bd14.oo.abstractTest


//DynamicAction用来操作储存系统数据
class DynamicAction {


  def saveData() = {
    println("保存数据到本地文件")
  }


  def deleteData() = {
    println("删除本地文件系统数据")
  }


}


class HBaseAction extends DynamicAction {
  override def saveData() = {
    println("保存数据到hbase")
  }
}

class MysqlAction extends DynamicAction {
  override def saveData() = {
    println("保存数据到mysql上")
  }
}


object DynamicActionFactory {
  def mkInstance():DynamicAction = {
//    new HBaseAction()
//    new MysqlAction()
    new DynamicAction(){
      override def saveData(): Unit ={
        println("保存数据到hive里面")
      }
    }
  }
}


object DynamicActionTest {
  def main(args: Array[String]): Unit = {
    val action = DynamicActionFactory.mkInstance()
    action.saveData()
  }
}






