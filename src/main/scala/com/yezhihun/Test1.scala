package com.yezhihun

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/8.
  */
object Test1 {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("test").setMaster("local")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("data.txt")
    val lineLengths = lines.map(s => s.length)
    val totalLength = lineLengths.reduce((a, b) => a + b)
    println(totalLength)
  }
}
