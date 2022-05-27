package com.edsonpatricio.orderage

import java.time.LocalDate
import scala.collection.mutable

object ArgumentType extends Enumeration {
  type  args = Value
  val StartDate, EndDate, ListOfArgument = Value
}

class ArgumentParser {

  // FIXME Refactor to use immutable map
  def mapArgs(args: Array[String]): mutable.Map[ArgumentType.Value, Any] = {
    var map: mutable.Map[ArgumentType.Value , Any] = mutable.Map()

    // FIXME Validate date1 argument
    val startDate = LocalDate.parse(args(0).replace("\"","").split(" ")(0))
    map = map ++ mutable.Map(ArgumentType.StartDate -> startDate)

    // FIXME Validate date2 argument
    val endDate = LocalDate.parse(args(1).replace("\"", "").split(" ")(0))
    map = map ++ mutable.Map(ArgumentType.EndDate -> endDate)

    if (args.length == 3) {
      val listOfIntervals = args(2).replace("\"", "").split(",").toList
      map = map ++ mutable.Map(ArgumentType.ListOfArgument -> listOfIntervals)
    }

    map
  }

}
