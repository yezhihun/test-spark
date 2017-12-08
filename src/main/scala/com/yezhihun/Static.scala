package com.yezhihun

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/7.
  */
object Static {

  def static1: Unit = {
    print("static1 excute")
  }

  var count: Int = 9;

  def incr: Unit = {
    count += 1;
  }
}

object TestStatic{

  def main(args: Array[String]) {
    Static.static1

    println(Static.incr)
    println(Static.count)
  }
}
