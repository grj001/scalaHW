package com.zhiyou.bd14.oo.packageTest

import java.util
import java.util.{Date, Random}
import scala.collection.mutable.{Queue=>MutableQueue}
import scala.collection.mutable._
import scala.collection.immutable.{HashMap=>_}

class PackageTest {

  import java.util.ArrayList
  val date = new Date()
  val random = new Random()

  def test() = {
    import java.util.ArrayList
    val array = new util.ArrayList[String]()
  }
}


class PackageTest1{
  val arrayList = new util.ArrayList[String]()
}


object PackageTest{
  def main(args: Array[String])= {
    val queue = new MutableQueue()
    println(queue.getClass.toString())

    val map = new HashMap[String,String]()
  }
}