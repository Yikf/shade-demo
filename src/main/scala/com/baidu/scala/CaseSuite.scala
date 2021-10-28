package com.baidu.scala

object CaseSuite {
  def main(args: Array[String]): Unit = {
    val persons = Seq.apply(Person("1"))

    println(persons.contains(Person("1")))
  }
}

case class Person(id: String) {

}
