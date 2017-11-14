package com.zhiyou.bd14.homework_20171114

import java.util.Random

import scala.collection.mutable.ArrayBuffer

object InsertSort {


  def main(args: Array[String]): Unit = {
    //新建一个ArrayBuffer
    var array = new ArrayBuffer[Int]()
    val random = new Random()

    for (i <- 1 to 10) {
      array += random.nextInt(100)
    }


    for (i <- 2 until array.length) {
      val lowerArray = array.filter(x => (x < array(i)))
      val equalArray = array.filter(x => (x == array(i)))
      val upperArray = array.filter(x => (x > array(i)))

      println(lowerArray.mkString(","))
      println(equalArray.mkString(","))
      println(upperArray.mkString(","))

      array = lowerArray ++ equalArray ++ upperArray

      println(array)
    }
  }


}
