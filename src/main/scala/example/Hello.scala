package example

import com.edsonpatricio.orderage.model.{Item, Order, Product}

import java.time.{LocalDate, YearMonth}
import java.time.temporal.ChronoUnit
import scala.collection.mutable.Map

object Hello extends App {
  println("Hello")

  val orderList = getOrderSample()
  val startDate = LocalDate.of(2018, 1, 1)
  val endDate = LocalDate.of(2019, 1, 1)

  for ((month, orderSet) <- collectAge(orderList, startDate, endDate)) {
    println(s"${month}")
    for (order <- orderSet) {
      println(s"    ${order.id}")
    }
  }

  def collectAge(
                  orders: List[Order],
                  startDate: LocalDate,
                  endDate: LocalDate,
                ): Map[Int, Set[Order]] = {

    var orderMap = Map[Int, Set[Order]]()

    for (order <- orders) {
      val orderDateIsStartDate = order.date.isEqual(startDate)
      val orderDateIsEndDate = order.date.isEqual(endDate)
      val orderDateIsInBetween = order.date.isAfter(startDate) && order.date.isBefore(endDate)

      if (orderDateIsStartDate || orderDateIsEndDate || orderDateIsInBetween) {
        for (item <- order.items) {

          val period = item.product.creationDate.until(order.date)
          val months = period.getMonths

          if (orderMap.contains(months)) {
            orderMap = orderMap ++ Map(
              months -> (orderMap.get(months).get + order)
            )
          } else {
            orderMap = orderMap ++ Map(period.getMonths -> Set(order))
          }
        }
      }
    }
    orderMap
  }

  def getOrderSample(): List[Order] = {
    val product1 = Product(
      id = 1,
      name = "p1",
      category = "a",
      price = 0.0,
      creationDate = LocalDate.of(2018, 1, 1),
    )
    val product2 = Product(
      id = 2,
      name = "p2",
      category = "b",
      price = 0.0,
      creationDate = LocalDate.of(2018, 2, 1)
    )
    val product3 = Product(
      id = 3,
      name = "p3",
      category = "c",
      price = 0.0,
      creationDate = LocalDate.of(2018, 3, 1)
    )
    val product4 = Product(
      id = 4,
      name = "p4",
      category = "d",
      price = 0.0,
      creationDate = LocalDate.of(2018, 4, 1)
    )
    val product5 = Product(
      id = 5,
      name = "p5",
      category = "e",
      price = 0.0,
      creationDate = LocalDate.of(2018, 5, 1)
    )
    val product6 = Product(
      id = 6,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 6, 1)
    )

    val item1 = Item(id = 1, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 1, product = product1)
    val item2 = Item(id = 2, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product2)
    val item3 = Item(id = 3, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 3, product = product2)
    val item4 = Item(id = 4, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 4, product = product3)
    val item5 = Item(id = 5, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 5, product = product3)
    val item6 = Item(id = 6, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 6, product = product3)
    val item7 = Item(id = 7, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 7, product = product4)
    val item8 = Item(id = 8, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 8, product = product5)
    val item9 = Item(id = 9, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 9, product = product6)

    val item10 = Item(id = 10, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 9, product = product6)
    val item11 = Item(id = 11, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 9, product = product6)

    val order1 = Order(
      id = 1,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 1, 1),
      items = List(item1),
    )
    val order2 = Order(
      id = 2,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 2, 2),
      items = List(item2),
    )
    val order3 = Order(
      id = 3,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 3, 3),
      items = List(item3),
    )
    val order4 = Order(
      id = 4,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 4, 4),
      items = List(item4),
    )
    val order5 = Order(
      id = 5,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 5, 5),
      items = List(item5),
    )
    val order6 = Order(
      id = 6,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 6, 6),
      items = List(item6),
    )
    val order7 = Order(
      id = 7,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 7, 7),
      items = List(item7),
    )
    val order8 = Order(
      id = 8,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 8, 8),
      items = List(item8),
    )
    val order9 = Order(
      id = 9,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 9, 9),
      items = List(item9),
    )

    val order10 = Order(
      id = 10,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 9, 9),
      items = List(item10, item11),
    )

    List(
      order1,
      order2,
      order3,
      order4,
      order5,
      order6,
      order7,
      order8,
      order9,
    )

  }
}