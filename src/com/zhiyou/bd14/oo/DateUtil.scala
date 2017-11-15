package com.zhiyou.bd14.oo

import java.util.Date
import java.text.SimpleDateFormat

//纯静态单例类
object DateUtil {


  val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

  def formatDate(date:Date)={
    format.format(date)
  }

}
