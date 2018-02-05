package com.scala.example

import org.apache.spark.{SparkConf, SparkContext}

object SparkExampleApp {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")
    val context = new SparkContext(conf)

    context.stop()
  }
}
