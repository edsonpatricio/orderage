package com.edsonpatricio.orderage.model

import java.time.LocalDate

//FIXME: Primitive Obsession
//FIXME: Find or make more appropriated money class
//FIXME: Find more appropriated date class
case class Product(
                    id: Long,
                    name: String,
                    category: String,
                    price: BigDecimal,
                    creationDate: LocalDate,
                  )
