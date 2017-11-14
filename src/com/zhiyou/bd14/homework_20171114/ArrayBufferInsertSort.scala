package com.zhiyou.bd14.homework_20171114

import java.util.Random

import scala.collection.mutable.ArrayBuffer

object ArrayBufferInsertSort {

  def main(args: Array[String]): Unit ={

    //新建一个ArrayBuffer
    val array = new ArrayBuffer[Int]()
    val random = new Random()

    for(i <- 1 to 10){
      array += random.nextInt(100)
    }

    println(array.mkString(","))

    // 0 1 2 3 4
    // 5
    // 01 12 23 34
    // 01 12 23
    // 01 12
    // 01
    for(i <- 0 until array.length-1){
      for(j <- 0 until array.length-1-i){
        if(array(j) > array(j+1)){
          val tmp = array(j)
          array(j) = array(j+1)
          array(j+1) = tmp
        }

      }
    }

    val insertNum = 35
    array += 35.toInt

    // 0 1 2 3 4
    // 5
    // 01 02 03 04
    //    12 13 14
    //       23 24
    //          34
//    for(i <- 0 until array.length-1){
//      for(j <- i+1 until array.length){
//        println(array(i)+"--"+array(j))
//        if(array(i) > array(j)){
//          println(array(i)+"--"+array(j))
//          val tmp = array(i)
//          array(i) = array(j)
//          array(j) = tmp
//        }
//      }
//    }
//    println(array.mkString(","))

    val lowerArray = array.filter(x => (x < insertNum) )
    val equalArray = array.filter(x => (x == insertNum) )
    val upperArray = array.filter(x => (x > insertNum) )

    println(lowerArray.mkString(","))
    println(equalArray.mkString(","))
    println(upperArray.mkString(","))

    val array1 = lowerArray ++ equalArray ++ upperArray

    println(array1)

  }

}
