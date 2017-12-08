package com.yezhihun

/**
  * @description:
  * @author tianye
  *         Created on 2017/12/6.
  */
object Loop {

  def main(args: Array[String]) {
    val str = "testsafgad";

    println("循环1")
    var i = 0;
    while (i < str.length){
      println(i);
      i += 1;
    }
    println(i);


    println("循环2")
    for(char <- str){
      println(char)
    }

    println("循环3")
    str.foreach(println);

    println("循环4：")
    // 1 to 10   表示  1.to(10)
    for (num <- 1.to(10) if num % 2 == 0){
      println(num)
    }
  }
}
