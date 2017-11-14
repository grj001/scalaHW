package com.zhiyou.bd14

import java.util

import scala.util.control.Breaks

object ForTest {

  def main(args : Array[String]) : Unit = {
    //    val times = args(0).toInt
    //
    //    //<- 属于
    //    for(i <- 1 to times){
    //      println(s"lprint:$i")
    //    }


    //    val times = args(0).toInt
    //    for(i <- 1 to times if i%2==0) println(s"2print:$i")


    //    val times = args(0).toInt
    //    for(i <- 1 to times){
    //      for(i <- 1 to times){
    //        println(s"lprint:$i")
    //      }
    //    }


    //    val times = args(0).toInt
    //    for(i <- 1 to times; j <- 1 to times){
    //      println(s"lprint:$i")
    //    }

    //    val times = args(0).toInt
    //    for(i <- 1 to times ; j <- 1 to times if i%2==1 && j%2 ==0){
    //      println(s"i$i, j$j")
    //    }


    //    val times = args(0).toInt
    //    for(i <- 1 to times ; j <- 1 to times if i*j > 25){
    //      println(s"长:$i, 宽:$j, 面积:${i*j}")
    //    }


    //    val times = args(0).toInt
    //    for{
    //      i <- 1 to times
    //      j <- 1 to times
    //      x = i * j
    //    } println(s"长:$i, 宽:$j, 面积:${x}")


    var a = 1
    var b = 1
    //    print(s"a*b=${a*b}")

//    for (a <- 1 to 10) {
//      for (b <- 1 to a) {
//        print(s"$a*$b=${a*b}\t")
//      }
//      println()
//    }

//    for(a <- 1 to 10; b <- 1 to a) {
//      print(s"$a*$b=${a}\t")
//      if(a==b) println()
//    }

//    for(a <- 1 to 10; b <- 1 to a) print(s"$a*$b=${a} ${if(a==b)  "\n" else "\t"}")


//    val times = args(0).toInt
//    val result = for(i <- 1 to times) yield{
//      if(i%2==0) i
//    }
//    println(result)

    //Unit 类型
//    val times = args(0).toInt
//    val result2 = for(i <- 1 to times if i%2==0) yield i
//    println(result2)


//    val times = args(0).toInt
//    val result3 = for(i <- 1 to 10) yield i+5
//    println(result3)


    //scala的break方法
    //创建Break对象
    val times = args(0).toInt;
    val loop = new Breaks;
    //在其方法中写for循环即可break
    loop.breakable(
      for(i <- 1 to times){
        if(i==5) loop.break() else println(i)
      }
    )







  }
}
