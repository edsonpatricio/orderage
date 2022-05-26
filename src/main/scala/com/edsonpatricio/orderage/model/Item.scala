package com.edsonpatricio.orderage.model

//FIXME: Primitive Obsession
//FIXME: Find or make more appropriated money class
case class Item(
                       id: Long,
                       cost: BigDecimal,
                       shippingFee: BigDecimal,
                       taxAmount: BigDecimal,
                       quantity: Int,
                       product: Product,
                     )
