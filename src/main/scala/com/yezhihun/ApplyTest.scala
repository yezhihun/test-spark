package com.yezhihun

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/7.
  */
class ApplyTest private{
  def apply() = "Class_"

  var count: Int = 0;

  def inrc = {
    count += 1;
  }
}

object ApplyTest{
  var applyTest: ApplyTest = _

  def apply() = if(applyTest == null) {applyTest = new ApplyTest; applyTest} else applyTest;
}

object ApplyTestSignleton{

  def main(args: Array[String]) {
    val a1 = ApplyTest();
    a1()
    println(a1)
    println(a1.count)
    a1.inrc
    println(a1.count)
    println("-------------------------")

    val a2 = ApplyTest();

    println(a2.count)
  }
}
