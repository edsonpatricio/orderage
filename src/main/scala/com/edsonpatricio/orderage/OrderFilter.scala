package com.edsonpatricio.orderage

import com.edsonpatricio.orderage.model.Order

import java.time.temporal.ChronoUnit
import java.time.{LocalDate, YearMonth}
import scala.collection.mutable.Map

object OrderFilter {
  def collectAge(
                  orders: List[Order],
                ): Map[Long, Set[Order]] = {

    var orderMap = Map[Long, Set[Order]]()

    for (order <- orders) {
      for (item <- order.items) {

        val months = ChronoUnit.MONTHS.between(
          YearMonth.from(item.product.creationDate),
          YearMonth.from(order.date)
        )

        if (orderMap.contains(months)) {
          orderMap = orderMap ++ Map(
            months -> (orderMap.get(months).get + order)
          )
        } else {
          orderMap = orderMap ++ Map(months -> Set(order))
        }
      }
    }
    orderMap
  }
}
