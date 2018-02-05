package com.scala.example

import com.java.example.JavaExampleUtil
import org.apache.spark.{SparkConf, SparkContext}

object SparkExampleApp {

  def main(args: Array[String]) {

    JavaExampleUtil.printMessage()

    val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")
    val context = new SparkContext(conf)

    context.stop()
  }
}
