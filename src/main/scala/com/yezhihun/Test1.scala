package com.yezhihun

import org.ap
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/8.
  */
object Test1 {

  def main(args: Array[String]) {

    val conf = new SparkC

    val data = Array(1, 2, 3, 4, 5)
    val distData = sc.parallelize(data)
//    println(distData)
  }
}
