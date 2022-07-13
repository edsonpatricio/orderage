package com.edsonpatricio.orderage

import com.edsonpatricio.orderage.model.Order

import java.time.temporal.ChronoUnit
import java.time.{LocalDate, YearMonth}
import scala.collection.mutable

object OrderFilter {

  def collectAge(
                  orders: List[Order],
                ): Map[Long, Set[Order]] = {

    orders.flatMap { order =>
      order.items.map { item =>
        ChronoUnit.MONTHS.between(item.product.creationDate, order.date)
      }.foldLeft(mutable.Map.empty[Long, Set[Order]]) { (orderMap, monthIndex) =>
        if (orderMap.contains(monthIndex)) {
          orderMap ++ mutable.Map {
            monthIndex -> (orderMap(monthIndex) + order)
          }
        } else {
          orderMap ++ mutable.Map(monthIndex -> Set(order))
        }
      }
    }.toMap
  }

  def select(orders: List[Order], startDate: LocalDate, endDate: LocalDate): List[Order] = {
    orders.filter(
      (o: Order) =>
        (o.date.isAfter(startDate) || o.date.isEqual(startDate)) &&
          (o.date.isBefore(endDate) || o.date.isEqual(endDate))
    )
  }
}
