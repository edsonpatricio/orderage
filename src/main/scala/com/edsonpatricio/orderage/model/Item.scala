package com.edsonpatricio.orderage.model

//TODO: Primitive Obsession
//TODO: Find or make more appropriated money class
case class Item(
                       id: Long,
                       cost: BigDecimal,
                       shippingFee: BigDecimal,
                       taxAmount: BigDecimal,
                       quantity: Int,
                       product: Product,
                     )
