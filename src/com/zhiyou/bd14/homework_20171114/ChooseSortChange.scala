package com.zhiyou.bd14.homework_20171114

import java.util.Random

import scala.collection.mutable.ArrayBuffer

object ChooseSortChange {

  def main(args: Array[String]): Unit = {

    val array = Array(14, 92, 10, 19, 89, 34, 60, 17, 98, 79)
    val random = new Random()
    //    for (i <- 0 until 10) {
    //      array(i) = random.nextInt(100)
    //    }

    println(array.mkString(","))

    // 0 1 2 3 4
    // 5
    // 01 02 03 04
    //    12 13 14
    //       23 24
    //          34

    var num = 0
    val arrayBuffer = new ArrayBuffer[Int](10)
    val arrayIndexBuffer = new ArrayBuffer[Int](10)


    var maxNum = 0
    for (i <- 0 until array.length) {
      println(s"\t内层第${i}次循环")
      //找到最大值
      if (maxNum <= array(i)) {
        maxNum = array(i)
      }
    }
    println(maxNum)


    for (j <- 0 until array.length) {
      println(s"外层第${j}次循环")

      var tmp = maxNum

      println("\t索引列表" + arrayIndexBuffer)
      println("\t值列表" + arrayBuffer)

      for (i <- 0 until array.length) {
        println(s"\t内层第${i}次循环")

        //找到最小值
        if (tmp >= array(i) && !arrayIndexBuffer.contains(i)) {
          println("\t" + tmp + "--" + array(i))
          tmp = array(i)
          num = i
        }
      }

      if (!arrayIndexBuffer.contains(num)) {
        println("\t\t最小值为" + tmp)
        println("\t\t最小值索引为" + num)

        arrayBuffer += tmp
        arrayIndexBuffer += num
      }
    }

    println(arrayBuffer)
    println(arrayIndexBuffer)


  }


}
