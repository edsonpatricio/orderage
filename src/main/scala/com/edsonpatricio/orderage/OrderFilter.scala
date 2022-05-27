package com.edsonpatricio.orderage

import com.edsonpatricio.orderage.model.Order

import java.time.temporal.ChronoUnit
import java.time.{LocalDate, YearMonth}
import scala.collection.mutable
import scala.collection.mutable.Map

object OrderFilter {
  def collectAge(
                  orders: List[Order],
                ): mutable.Map[Long, Set[Order]] = {

    var orderMap = mutable.Map[Long, Set[Order]]()

    for (order <- orders) {
      for (item <- order.items) {

        val months = ChronoUnit.MONTHS.between(
          YearMonth.from(item.product.creationDate),
          YearMonth.from(order.date)
        )

        if (orderMap.contains(months)) {
          orderMap = orderMap ++ mutable.Map(
            months -> (orderMap(months) + order)
          )
        } else {
          orderMap = orderMap ++ mutable.Map(months -> Set(order))
        }
      }
    }
    orderMap
  }
}
