package com.edsonpatricio.orderage

import org.scalatest._
import flatspec._
import matchers._
import com.edsonpatricio.orderage.model.{Item, Order, Product}
import org.mockito.Mockito.when
import org.scalatestplus.mockito.MockitoSugar.mock

import java.time.LocalDate

// TODO Empty cases test
class OrderFilterTest extends AnyFlatSpec with should.Matchers {
  "A order with one 3-month product in the same year" should "return a map with one 3-month order on key 3" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2018, 4, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(3) should be (Set(order))
  }

  "A order with one 3-month product crossing the year" should "return a map with one 3-month order on key 3" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 12, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 3, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(3) should be (Set(order))
  }

  "A order with one 1-month product in the same year" should "return a map with one 1-month order on key 1" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2018, 2, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(1) should be (Set(order))
  }

  "A order with one 1-month product crossing the year" should "return a map with one 1-month order on key 1" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 12, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 1, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(1) should be (Set(order))
  }

  "A order with one 12-month product crossing the year" should "return a map with one 12-month order on key 12" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 7, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 7, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(12) should be (Set(order))
  }

  "A order with one 13-month product crossing the year" should "return a map with one 13-month order on key 13" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 7, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 8, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(13) should be (Set(order))
  }

  "A order with one 25-month product crossing the year" should "return a map with one 25-month order on key 25" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2017, 11, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 12, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(25) should be (Set(order))
  }

  "A order with less than 1 month product" should "return a map with one order on key 0" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2017, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2017, 1, 2))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order))(0) should be (Set(order))
  }

  "A order with 2 product and different month age (5 and 7)" should "return a map with the same order on key 5 and 7" in {
    val product5 = mock[Product]
    when(product5.creationDate).thenReturn(LocalDate.of(2017, 3, 1))

    val product7 = mock[Product]
    when(product7.creationDate).thenReturn(LocalDate.of(2017, 1, 1))

    val item5 = mock[Item]
    when(item5.product).thenReturn(product5)

    val item7 = mock[Item]
    when(item7.product).thenReturn(product7)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2017, 8, 2))
    when(order.items).thenReturn(List(item5, item7))

    OrderFilter.collectAge(List(order))(5) should be (Set(order))
    OrderFilter.collectAge(List(order))(7) should be (Set(order))
  }
}
