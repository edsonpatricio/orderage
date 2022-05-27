package com.edsonpatricio.orderage.model

import java.time.LocalDate

//TODO: Primitive Obsession
//TODO: Find or make more appropriated money class
//TODO: Find more appropriated date class
case class Order(
                  id: Long,
                  customerName: String,
                  contact: String,
                  shippingAddress: String,
                  grandTotal: BigDecimal,
                  date: LocalDate,
                  items: List[Item],
                )