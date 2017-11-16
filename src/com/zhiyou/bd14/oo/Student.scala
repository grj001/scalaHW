package com.zhiyou.bd14.oo

//Student的伴生类
class Student(
               var studentNo: String
               , var studentName: String
               , var studentClass: String
               , var age: Int) {

  private def classPrivateMethod() = {
    println("伴生类的私有方法classPrivateMethod")
    Student.objectPrivateMethod()
  }

  def printlnString() = {
    println(s"studentNo: ${studentNo}" +
      s", studentName: ${studentName}" +
      s", studentClass: $studentClass")

  }

  private[this] def classPrivateThisMethod: Unit = {
    println("class的private[this]方法")
  }

  //这里要求重要内的类型需要使用包对象封装,
  // 即StudentTest和Student要封装再一个包下面
  // 更加灵活的限定权限
  //  private[StudentTest] def classPrivateStudentTestMethod() = {
  //    println("Student的private[StudentTest]方法")
  //  }
}



//Student的伴生对象
object Student {
  private def objectPrivateMethod(): Unit = {
    println("伴生对象的私有方法: objectPrivateMethod")
  }

  var schoolName: String = ""

  def gotoSchoole(): Unit = {
    println(s"伴生对象的上学方法,$Student")
  }

  def callStudentClassPrivateMethod(): Unit = {
    val s = new Student("002", "小王", "一年级", 19)
  }

  def apply(): Unit = {
    println("调用了apply方法")
  }

  def apply(sutdentNo: String, studentName: String, studentClass: String, age: Int) =
    new Student(sutdentNo, studentName, studentClass, age)
}




//main
object StudentTest {

  def main(args: Array[String]): Unit = {
    val student = new Student("001", "小王", "一年级", 18)
    student.printlnString()
    //    student.classPrivateStudentTestMethod()

    Student.gotoSchoole()


    Student.apply()
    Student()

    val student1 = Student("003", "小李", "一年级", 19)
    println(student1)
    student1.printlnString()
  }

}