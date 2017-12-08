package com.yezhihun

/**
  * @description:
  * @author tianye
  *         Created on 2017/11/15.
  */
object Hello {

  def main(args: Array[String]) {
    val sex = "n";
    var age = 12;
    val name = "nihao";
    println(fun1(age, name));
    println(fun2(1, 2));
    println(fun3(4, 5));
    println(fun4(5)(3));
    println(fun5(5)(2));
    println(fun6(name));

    println(if(age>18) "成年" else "未成年")
//    print("test")
  }

  def fun1(age: Integer, name: String): String ={
    println(name + " age is:" + age)
    return name;
  }

  def fun2(x: Int, y: Int): Int={
    return x + y;
  }

  def fun3 = (x: Int, y: Int)=>x -y ;

  def fun4(x: Int)(y: Int) = x + y;

  def fun5(x: Int) = (y: Int) => x * y;

  def fun6(name: String*): Unit={
    name.foreach(x => printf(x));
  }

}
