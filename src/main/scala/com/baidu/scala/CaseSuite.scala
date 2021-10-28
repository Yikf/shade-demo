package com.baidu.scala

import java.util.UUID
import scala.collection.mutable

object CaseSuite {

  private val map: mutable.Map[String, String] = mutable.Map()


  def main(args: Array[String]): Unit = {
    val persons = Seq.apply(Person("1"))

    println(persons.contains(Person("1")))

    /*for(i <- 1 to 24) {
      map += (i.toString -> i.toString)
      println(s"map size ${map.size}")
    }*/

    val seq = Seq(1, 2, 3)
    val value = if (false) {

    } else {
      seq.map {
        case i: Int =>
          if (i != 2) {
            map += (UUID.randomUUID().toString -> 1.toString)
            println(s"map size ${map.size}")
            "2"
          }
      }
    }
    println("=============")
    println(map.size)

    value

    //println(map.toMap.size)

  }
}

case class Person(id: String) {

}
