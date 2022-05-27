package com.edsonpatricio.orderage

import example.DataSample

import java.time.LocalDate

object Main extends App {
  val usage =
    """
       Usage:
             java -jar orders.jar "YYYY-MM-DD hh:mm:ss" "YYYY-MM-DD hh:mm:ss" [intervals]

             Intervals:
                       n-m
                       >n
                       <n
                 m is ever greater than n
                 Intervals could be separated by comma

       Example1:
                java -jar orders.jar "2018-01-01 00:00:00" "2019-01-01 00:00:00"

       Example2:
                java -jar orders.jar "2018-01-01 00:00:00" "2019-01-01 00:00:00" "0-2, 3-7, 8-12, >12"
    """

  val argumentParser = new ArgumentParser
  val argumentMap = argumentParser.mapArgs(args)

  val filteredOrder = OrderFilter.select(
    DataSample.getOrderSample(),
    argumentMap(ArgumentType.StartDate).asInstanceOf[LocalDate],
    argumentMap(ArgumentType.EndDate).asInstanceOf[LocalDate],
  )

  val ageMap = OrderFilter.collectAge(filteredOrder)

  val keys = ageMap.keys

  //TODO: Intervals as CLI arguments
  val interval1to3 = keys.filter(n => n >= 1 && n <= 3).sum
  val interval4to6 = keys.filter(n => n >= 4 && n <= 6).sum
  val interval7to12 = keys.filter(n => n >= 7 && n <= 12).sum
  val intervalGreaterThan12 = keys.filter(n => n > 12).sum

  println(s"1-3 months: $interval1to3")
  println(s"4-6 months: $interval4to6")
  println(s"7-12 months: $interval7to12")
  println(s">12 months: $intervalGreaterThan12")
}
