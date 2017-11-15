package com.zhiyou.bd14

object MapTest {

  def main(args: Array[String]): Unit = {

    //map的声明, 自变量, 取值
    val map1 = Map(1 -> "a", 2 -> "b", 3 -> "c")
    println(map1)

    val map2 = Map((1, "a"), (2, "b"), (3, "c"))
    println(map2)

    //map的取值
    println(map1(1))
    println(map2(1))

    val map3 = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map3("a"))


    //遍历
    map3.foreach(
      (k) => println(s"key: $k")
    )
    map3.foreach(
      x => println(s"key:${x._1}, value:${x._2}")
    )

    println("-----------------------------------------")
    for (x <- map3) {
      println(s"key:${x._1}, value:${x._2}")
    }

    for ((k, v) <- map3) {
      println(s"key:$k, value:$v")
    }

    for (ks <- map3.keySet) {
      println(s"key:$ks, value:${map3(ks)}")
    }


    //不可变map无法重新赋值
    //map3("a") = 100

    //get方法获取指定key的value值
    val map4 = Map("zhang"->80, "li"->85, "liu"->90)
    println(map4("zhang"))
    println(map4.get("zhang"))

    //小括号方法获取key的value值时,如过key不存在, 程序会抛异常
//    println(map4("wang"))
    println(map4.get("wang"))

    //map ++
    println(map3++map4)
    //会覆盖
    println( map3 ++ Map("c"-> 100) )

    //判断map4中是否包含key :"zhang"
    println(map4.contains("zhang"))

    //CopyToArray

    val map5 = Map("apple"->5, "pear"->4, "peach"->5, "tomato"->6, "banana"->7)
    //计算出value 代表key长度的kv对数量
    val count = map5.count(
      x => x._1.length == x._2
    )
    println(count)
    //计算出key长度是5的数量
    val count1 = map5.count(
      x => x._1.length == 5
    )
    println(count1)

    //drop, 从前往后删除, 写入后的自动排序
    println(map5)
    println(map5.drop(2))
    println(map5.dropRight(2))

    //过滤掉key长度等于5的kv对
    val filter1 = map5.filterKeys(x=>x.length!=5)
    println("过滤掉key长度为5 的key, 结果为: "+filter1)

    val filter2 = map5.filter(x => x._1.length != 5)
    println("过滤掉key长度为5 的key, 结果为: "+filter2)

    // flatMap, 展平成 List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val map6 = Map("a"->List(1,2,3), "b"->List(4,5,6), "c"->List(7,8,9))
    println(map6)
    val flatMap = map6.flatMap(x => x._2)
    println(flatMap)








  }

}
