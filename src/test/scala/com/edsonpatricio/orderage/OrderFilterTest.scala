package com.edsonpatricio.orderage

import org.scalatest._
import flatspec._
import matchers._
import com.edsonpatricio.orderage.model.{Item, Order, Product}
import org.mockito.Mockito.when
import org.scalatestplus.mockito.MockitoSugar.mock

import java.time.LocalDate
import collection.mutable.Stack

class OrderFilterTest extends AnyFlatSpec with should.Matchers {
  "A order with one 3-month product in the same year" should "return a map with one 3-month order on key 3" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2018, 4, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(3).get should be (Set(order))
  }

  "A order with one 3-month product crossing the year" should "return a map with one 3-month order on key 3" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 12, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 3, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(3).get should be (Set(order))
  }

  "A order with one 1-month product in the same year" should "return a map with one 1-month order on key 1" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2018, 2, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(1).get should be (Set(order))
  }

  "A order with one 1-month product crossing the year" should "return a map with one 1-month order on key 1" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 12, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 1, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(1).get should be (Set(order))
  }

  "A order with one 12-month product crossing the year" should "return a map with one 12-month order on key 12" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 7, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 7, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(12).get should be (Set(order))
  }

  "A order with one 13-month product crossing the year" should "return a map with one 13-month order on key 13" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2018, 7, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 8, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(13).get should be (Set(order))
  }

  "A order with one 25-month product crossing the year" should "return a map with one 25-month order on key 25" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2017, 11, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2019, 12, 1))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(25).get should be (Set(order))
  }

  "A order with less than 1 month product" should "return a map with one order on key 0" in {
    val product = mock[Product]
    when(product.creationDate).thenReturn(LocalDate.of(2017, 1, 1))

    val item = mock[Item]
    when(item.product).thenReturn(product)

    val order = mock[Order]
    when(order.date).thenReturn(LocalDate.of(2017, 1, 2))
    when(order.items).thenReturn(List(item))

    OrderFilter.collectAge(List(order)).get(0).get should be (Set(order))
  }
}
