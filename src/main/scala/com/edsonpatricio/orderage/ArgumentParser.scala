package com.edsonpatricio.orderage

import java.time.LocalDate
import scala.collection.mutable

class ArgumentParser {

  // FIXME Refactor to use immutable map
  def mapArgs(args: Array[String]): mutable.Map[String, Any] = {
    var map: mutable.Map[String, Any] = mutable.Map()

    // FIXME Validate date1 argument
    val startDate = LocalDate.parse(args(0).replace("\"","").split(" ")(0))
    map = map ++ mutable.Map("Start Date" -> startDate)

    // FIXME Validate date2 argument
    val endDate = LocalDate.parse(args(1).replace("\"", "").split(" ")(0))
    map = map ++ mutable.Map("End Date" -> endDate)

    if (args.length == 3) {
      val listOfIntervals = args(2).replace("\"", "").split(",").toList
      map = map ++ mutable.Map("List of Intervals" -> listOfIntervals)
    }

    map
  }

}
