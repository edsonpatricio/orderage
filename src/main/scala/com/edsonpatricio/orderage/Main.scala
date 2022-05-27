package com.edsonpatricio.orderage

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
  argumentParser.mapArgs(args)
}
