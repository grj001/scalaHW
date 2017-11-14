package com.zhiyou.bd14

import java.util

object ListTest {


  def main(args: Array[String]): Unit = {
    //List的声明和字面量
    val list = List(1, 2, 3, 4, 5)
    val list1 = List()
    println(list)
    println(list1)
    println(list(1))

    // list元素对象,不能更改
    // List(0) = 100

    // 元素的添加,
    println(list.::(23))
    println(23 :: list)
    println(33 :: 43 :: list)

    println(list.:+(22))
    println(list :+ 22)

    //两个List合并
    val list2 = List(1, 2, 3)
    val list3 = List(1, 2, 3)
    println(list2 ++ list3 ++ list)


    //list4有多少个数是大于5的
    val list4 = List(1,2,3,4,5,6,7)
    val bt5Count = list4.count(x => x>5)
    println(s"list4中大于5的数共有${bt5Count}个")


    //判断list4 是否以6,7作为最后两个元素结尾的
    val isEndWith67 = list4.endsWith(List(6,7))
    println(s"List4${ if(isEndWith67) "是" else "不是" } 以6,7结尾的")


    //find: 返回list中第一个满足查询条件的元素, 并用Option封装
    //找出list4中第一个大于4 并且是偶数的元素
    val valBt4 = list4.find(x => x>4 && x%2==0 )
    println(s"第一个大于4并且是偶数的元素为: $valBt4")

    val list5 = List("hadoop is good","spark is better", "sql is best")
    //把list5中的每个元素各自拆分成一个单词一个元素的list
    // flatMap, 是一个展平操作, 类似hive中的explore, 它接收一个函数, 函数的输入
    // 是一个元素, 函数的输出是一个集合
    // 集合中的每一个元素品在一起形成一个新的list
    val flatedList = list5.flatMap(x => x.split("\\s"))
    println(flatedList)
  }


}
