package com.zhiyou.bd14

object SetTest {

  def main(args: Array[String]) = {

    //set的声明和字面量
    // Set是 无序的
    val set1 = Set(1, 2, 3, 4, 5, 6, 67, 1, 2, 3, 4, 5, 6)
    println(set1)

    //因为set中是无序的, 所以没有索引
    // set无序不重复, 因此不能使用索引进行取值
    println(set1(0))

    //set遍历
    for (i <- set1) println(i)
    println("-----------------------------------------")
    set1.foreach(x => println(x))

    // 返回的都是新的set
    // head --- tail 集合中的某个元素
    // init --- last


      //可变的set
    val mSet = scala.collection.mutable.Set(3,2,4)
    mSet.add(456)
    println(mSet)

    mSet.add(3)

    mSet += 1
    println(mSet)

    mSet.remove(3)
    println(mSet)

  }

}
