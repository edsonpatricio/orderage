package com.edsonpatricio.orderage.model

import java.time.LocalDate

//FIXME: Primitive Obsession
//FIXME: Find or make more appropriated money class
//FIXME: Find more appropriated date class
case class Order(
                  id: Long,
                  customerName: String,
                  contact: String,
                  shippingAddress: String,
                  grandTotal: BigDecimal,
                  date: LocalDate,
                  items: List[Item],
                )