package com{

  import com.zhiyou.{ZhiYouPackageClass, ZhiYouPackageClass1}
  import com.zhiyou.oo.PackageDefineTest
  package zhiyou{
    package oo{
      class PackageDefineTest{

      }
    }

    class ZhiYouPackageClass{}
    class ZhiYouPackageClass1{}




  }

  class ComPackageClass{}

  object PackageTest{
    def main(args: Array[String]): Unit = {
      val packageDefineTest = new PackageDefineTest()
      val zhiYouPackageClass = new ZhiYouPackageClass()
      val zhiYouPackageClass1 = new ZhiYouPackageClass1()
      val comPackageClass = new ComPackageClass()

      println(packageDefineTest.getClass.toString)
      println(zhiYouPackageClass.getClass.toString)
      println(zhiYouPackageClass1.getClass.toString)
      println(comPackageClass.getClass.toString)
    }
  }

}
