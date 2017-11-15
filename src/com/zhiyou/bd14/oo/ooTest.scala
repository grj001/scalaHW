package com.zhiyou.bd14.oo

import java.util.Date

object ooTest {

  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.age = 17
    person.name = "小张"
    person.id = 1

    //下面两句 的执行在jvm上 等同于一段代码


    //    person.id = 13
    //    person.id_$eq(13)

    person.setSalary(3000.00)
    println(s"salary: ${person.getSalary()}")

    person.printPerson()

    //diao用Object的方法
    val date = DateUtil.formatDate(new Date())
    println(date)

    val person1 = new Person()


  }

}
