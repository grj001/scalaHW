package com.zhiyou.bd14

object IfTest {

  //接受分数, 判断给出分数
  def main(args: Array[String]): Unit = {

//    val score = args(0).toInt;
//
//    if(score > 90){
//      print("优秀")
//    }else if(score > 80){
//      print("良好")
//    }else if(score > 60){
//      print("中等")
//    }else{
//      print("差")
//    }


//      val str1 = "111"
//      val str2 = {
//        val str3 = s"${str1}defg"
//        print(str3)
//        str3
//      }


    val score = args(0).toInt;
    val result = if(score > 90){
      "优秀"
    }else if(score >= 80){
      "良好"
    }else if(score >= 60){
      "中等"
    }else{
      "差"
    }
    print(result)







  }
}
