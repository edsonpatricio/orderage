package example

import com.edsonpatricio.orderage.model.{Item, Order, Product}

import java.time.{LocalDate, YearMonth}

object DataSample extends App {

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

    val product7 = Product(
      id = 7,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 7, 1)
    )

    val product8 = Product(
      id = 8,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 8, 1)
    )

    val product9 = Product(
      id = 9,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 9, 1)
    )

    val product10 = Product(
      id = 10,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 10, 1)
    )

    val product11 = Product(
      id = 11,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 11, 1)
    )

    val product12 = Product(
      id = 12,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 12, 1)
    )

    val product13 = Product(
      id = 13,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2019, 1, 1)
    )

    val product14 = Product(
      id = 14,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 1, 1)
    )

    val product15 = Product(
      id = 15,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 2, 1)
    )

    val product16 = Product(
      id = 16,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 3, 1)
    )

    val product17 = Product(
      id = 17,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2018, 4, 1)
    )

    val product18 = Product(
      id = 18,
      name = "p6",
      category = "f",
      price = 0.0,
      creationDate = LocalDate.of(2019, 2, 1)
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
    val item10 = Item(id = 10, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 1, product = product6)
    val item11 = Item(id = 12, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 1, product = product6)
    val item12 = Item(id = 13, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product7)
    val item13 = Item(id = 14, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 3, product = product7)
    val item14 = Item(id = 15, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 4, product = product7)
    val item15 = Item(id = 16, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 5, product = product8)
    val item16 = Item(id = 17, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 6, product = product9)
    val item17 = Item(id = 18, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 7, product = product10)
    val item18 = Item(id = 19, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 8, product = product11)
    val item19 = Item(id = 20, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 9, product = product12)
    val item20 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product13)
    val item21 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product14)
    val item22 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product15)
    val item23 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product16)
    val item24 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product17)
    val item25 = Item(id = 21, cost = 0.0, shippingFee = 0.0, taxAmount = 0.0, quantity = 2, product = product18)

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
      date = LocalDate.of(2019, 10, 9),
      items = List(item10, item11, item12),
    )

    val order11 = Order(
      id = 11,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 11, 9),
      items = List(item13, item14, item15),
    )

    val order12 = Order(
      id = 12,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 11, 9),
      items = List(item16, item17),
    )

    val order13 = Order(
      id = 13,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2018, 12, 9),
      items = List(item18),
    )

    val order14 = Order(
      id = 14,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 1, 9),
      items = List(item19),
    )

    val order15 = Order(
      id = 15,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 2, 9),
      items = List(item20)
    )

    val order16 = Order(
      id = 16,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 3, 9),
      items = List(item21),
    )

    val order17 = Order(
      id = 17,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 4, 9),
      items = List(item22)
    )

    val order18 = Order(
      id = 18,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 5, 9),
      items = List(item23),
    )

    val order19 = Order(
      id = 19,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 6, 9),
      items = List(item24),
    )

    val order20 = Order(
      id = 20,
      contact = "a",
      shippingAddress = "a",
      customerName = "a",
      grandTotal = 0.0,
      date = LocalDate.of(2019, 7, 9),
      items = List(item25),
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
      order10,
      order11,
      order12,
      order13,
      order14,
      order15,
      order16,
      order17,
      order18,
      order19,
      order20,
    )

  }
}