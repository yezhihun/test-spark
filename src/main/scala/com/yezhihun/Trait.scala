package com.yezhihun

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/6.
  */
object Trait {

  def main(args: Array[String]) {
    val logger1 = new LoggerImp;
    logger1.log("test");
    print("test")
  }

}
trait Logger1{
  def log(msg: String): Unit={
    println("log:"+msg);
  }
}

class LoggerImp extends Logger1{
}



