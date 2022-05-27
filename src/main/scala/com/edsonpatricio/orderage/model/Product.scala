package com.edsonpatricio.orderage.model

import java.time.LocalDate

//TODO: Primitive Obsession
//TODO: Find or make more appropriated money class
//TODO: Find more appropriated date class
case class Product(
                    id: Long,
                    name: String,
                    category: String,
                    price: BigDecimal,
                    creationDate: LocalDate,
                  )
